package com.ca.controller.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author luocheng
 *
 */
@Controller
@RequestMapping("/Error")
public class ErrorController {
    /**
     * 
     * TODO 错误页面.
     * 
     * @param request 请求
     * @param response 响应
     * @return 页面
     */
    @RequestMapping("/Error")
    public String error(HttpServletRequest request, HttpServletResponse response)
    {
        String error = "";
        String exceptionID = "";
        String trackID = "";
        String returnUrl = "";
        error = request.getParameter("error");
        exceptionID = request.getParameter("exceptionID");
        trackID = request.getParameter("trackID");
        returnUrl = request.getParameter("returnUrl");
        request.setAttribute("error", error);
        request.setAttribute("exceptionID", exceptionID);
        request.setAttribute("trackID", trackID);
        request.setAttribute("returnUrl", returnUrl);
        return "Common/error";
    }
}
