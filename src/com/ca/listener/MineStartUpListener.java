/*
 * 文件名：MineStartUpListener.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： MineStartUpListener.java
 * 修改人：Tanlei
 * 修改时间：2016年1月23日
 * 修改内容：新增
 */
package com.ca.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ca.dao.impl.AssectsSystemDaoImpl;
import com.google.gson.Gson;

/**
 * 
 * @author Tanlei
 */
public class MineStartUpListener implements ServletContextListener {

    /**
     * 添加方法注释.
     * 
     * @param arg0
     *            .
     */
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub

    }

    /**
     * 添加方法注释.
     * 
     * @param arg0
     *            .
     */
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        ServletContext context = arg0.getServletContext();
        WebApplicationContext webContext = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
        AssectsSystemDaoImpl articleDaoImpl = (AssectsSystemDaoImpl) webContext.getBean("AssectsSystemDaoImpl");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("condition", "");
        System.out.println(new Gson().toJson(articleDaoImpl.selectList(map)));

    }

}
