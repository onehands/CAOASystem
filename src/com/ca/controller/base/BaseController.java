package com.ca.controller.base;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author luocheng
 *
 */
public class BaseController {

    /**
     * 
     * TODO 添加方法注释.
     * 
     * @param response 响应
     * @param request 请求
     * @param ex 异常
     * @return 返回页面
     * @throws IOException io异常
     */
    @ExceptionHandler
    @ResponseBody
    public String processException(
            HttpServletResponse response,
            HttpServletRequest request, 
            Exception ex) throws IOException {

        String exStr = ExceptionHandlerPrcess.prcessException(request, ex);
        String strBackUrl = "http://" + request.getServerName() // 服务器地址
                + ":" + request.getServerPort() // 端口号
                + request.getContextPath() // 项目名称
                + request.getServletPath(); // 请求页面或其他地址

        String queryString = "";
        if (request.getQueryString() != null && request.getQueryString() != "")
        {
            queryString = "?" + request.getQueryString();
        }

        String requestType = request.getHeader("X-Requested-With");
        if (null != requestType) {
            return "{\"code\":4,\"Error\":1,\"message\":\"" + exStr + "\"}";
        }
        String errorMsg = "";
        String error = "";
        String exceptionID = "";
        String trackID = "";
        if (exStr != "") {
            error = exStr.split("<br />")[0];
            exceptionID = exStr.split("<br />")[1];
            trackID = exStr.split("<br />")[2];
        }

        errorMsg = "error=" + error;
        errorMsg += "&exceptionID=" + exceptionID;
        errorMsg += "&trackID=" + trackID;
        errorMsg += "&returnUrl=" + strBackUrl + queryString;

        response.sendRedirect(request.getContextPath() + "/Error/Error?"
                + errorMsg);
        return "";
    }
}
