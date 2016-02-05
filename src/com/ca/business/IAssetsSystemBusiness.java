/*
 * 文件名：IAssetsSystemBusiness.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： IAssetsSystemBusiness.java
 * 修改人：hongjian
 * 修改时间：2016年1月26日
 * 修改内容：新增
 */
package com.ca.business;

import java.util.List;

import com.ca.model.MAssetsSystemVo;

/**
 */
public interface IAssetsSystemBusiness {

    public int insert(List<MAssetsSystemVo> list);

}
