package com.ca.controller.base;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author luocheng
 *
 */
public class ExceptionHandlerPrcess {

    /**
     * 
     * TODO 添加方法注释.
     * 
     * @param request
     *            请求
     * @param ex
     *            异常
     * @return 异常信息
     */
    public static String prcessException(HttpServletRequest request, Exception ex) {
        String msg = "";
        try {
            msg = String.format("%s:%s<br />%s<br />%s", "", ex.getMessage(), "", "");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return msg;
    }
}
