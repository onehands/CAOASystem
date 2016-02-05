/*
 * 文件名：BaseDaoImpl.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： BaseDaoImpl.java
 * 修改人：Tanlei
 * 修改时间：2016年1月23日
 * 修改内容：新增
 */
package com.ca.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * @author Tanlei
 */
@Component("BaseDaoImpl")
public class BaseDaoImpl {

    @Resource(name = "sqlSessionTemplate")
    public SqlSession sqlSessionRead;

}
