/*
 * 文件名：IUserDao.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： IUserDao.java
 * 修改人：Tanlei
 * 修改时间：2016年1月23日
 * 修改内容：新增
 */
package com.ca.dao;

import java.util.List;
import java.util.Map;

import com.ca.model.MAssetsSystemVo;

/**
 * @author Tanlei
 */
public interface IAssectsSystemDao {

    public int insertList(List<MAssetsSystemVo> assetsSystemVo);

    public List<MAssetsSystemVo> selectList(Map<String, Object> paramMap);

}
