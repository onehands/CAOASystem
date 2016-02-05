/*
 * 文件名：TicketImport.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TicketImport.java
 * 修改人：longyou
 * 修改时间：2015年10月21日
 * 修改内容：新增
 */
package com.ca.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ca.business.IAssetsSystemBusiness;
import com.ca.controller.base.BaseController;

@Controller
@RequestMapping("AssetsSystemManage")
public class AssetsSystemManage extends BaseController {
    @Resource(name = "AssetsSystemBusinessImpl")
    private IAssetsSystemBusiness assetsSystemBusiness;

    @RequestMapping(value = "/AssetsSystemManage")
    public String init() {
        return "AssetsSystemManage";
    }


}
