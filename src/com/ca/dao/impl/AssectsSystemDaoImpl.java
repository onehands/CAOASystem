/*
 * 文件名：AssectsSystemDaoImpl.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： AssectsSystemDaoImpl.java
 * 修改人：hongjian
 * 修改时间：2016年1月25日
 * 修改内容：新增
 */
package com.ca.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ca.dao.IAssectsSystemDao;
import com.ca.model.MAssetsSystemVo;

/**
 * @author hongjian
 */
@Component("AssectsSystemDaoImpl")
public class AssectsSystemDaoImpl extends BaseDaoImpl implements IAssectsSystemDao {

    /**
     * 添加方法注释.
     * 
     * @param userInfo
     * @return .
     */
    @Override
    public int insertList(List<MAssetsSystemVo> assetsSystemVoList) {
        return this.sqlSessionRead.insert("com.ca.sqlMapper.AssetsSystem.insert", assetsSystemVoList);
    }

    /**
     * 添加方法注释.
     * 
     * @param paramMap
     * @return .
     */
    @Override
    public List<MAssetsSystemVo> selectList(Map<String, Object> paramMap) {
        return this.sqlSessionRead.selectList("com.ca.sqlMapper.AssetsSystem.selectByCondition", paramMap);
    }

}
