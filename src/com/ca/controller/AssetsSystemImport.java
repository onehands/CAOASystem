/*
 * 文件名：TicketImport.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TicketImport.java
 * 修改人：longyou
 * 修改时间：2015年10月21日
 * 修改内容：新增
 */
package com.ca.controller;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.ca.business.IAssetsSystemBusiness;
import com.ca.controller.base.BaseController;
import com.ca.javaUtils.StringUtils;
import com.ca.model.MAssetsSystemVo;

@Controller
@RequestMapping("AssetsSystemImport")
public class AssetsSystemImport extends BaseController {
    @Resource(name = "AssetsSystemBusinessImpl")
    private IAssetsSystemBusiness assetsSystemBusiness;

    /**
     * 
     * TODO 添加方法注释.
     * 
     * @param request
     *            request
     * @param response
     *            response
     * @param taskName
     *            任务名称
     * @param content
     *            备注
     */
    @RequestMapping(value = "/Import")
    @ResponseBody
    public void importTicket(@RequestParam("file") CommonsMultipartFile[] files, HttpServletRequest request, HttpServletResponse response) {
        try {
            for (CommonsMultipartFile commonsMultipartFile : files) {
                InputStream fis = commonsMultipartFile.getInputStream();
                HSSFWorkbook workbook = null;
                workbook = new HSSFWorkbook(fis);
                // 创建对工作表的引用。
                HSSFSheet sheet = workbook.getSheetAt(0);
                Iterator<Row> rowItr = sheet.rowIterator();
                rowItr.next();
                List<MAssetsSystemVo> list = new ArrayList<MAssetsSystemVo>();
                while (rowItr.hasNext()) {
                    Row row = rowItr.next();
                    // Cell cell0 = row.getCell(0);
                    // cell0.setCellType(Cell.CELL_TYPE_NUMERIC);
                    MAssetsSystemVo excelDetail = new MAssetsSystemVo();
                    for (int i = 0; i < 20; i++) {
                        Cell c = row.getCell(i);
                        if (c != null) {
                            if (i != 8 && i != 13) {
                                c.setCellType(Cell.CELL_TYPE_STRING);
                            }
                            String cellContent = c.toString();
                            setValue(excelDetail, i, cellContent);
                        }
                    }
                    list.add(excelDetail);

                }
                long l = System.currentTimeMillis();
                int result = assetsSystemBusiness.insert(list);
                System.out.println("插入" + result + "条数据耗时: " + (System.currentTimeMillis() - l));
                if (result == 0) {
                    this.tipInfo(response, "excel中无有效数据", 0);
                    return;
                } else {
                    this.tipInfo(response, "成功上传" + result + "条数据", 1);
                    return;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            try {
                this.tipInfo(response, "程序异常", 0);
                return;
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }
    }

    /**
     * 添加方法注释.
     * 
     * @param excelDetail
     * @param i
     *            .
     * @param cellContent
     */
    private void setValue(MAssetsSystemVo excelDetail, int i, String cellContent) {
        switch (i)
            {
            case 0:
                // excelDetail.setSequenceNum(new Integer(cellContent));
                break;
            case 1:
                excelDetail.setPhysicalNum(cellContent);
                break;
            case 2:
                excelDetail.setAssetNum(cellContent);
                break;
            case 3:
                excelDetail.setSpecificationModel(cellContent);
                break;
            case 4:
                excelDetail.setDeviceNum(cellContent);
                break;
            case 5:
                excelDetail.setEquipmentStatus(cellContent);
                break;
            case 6:
                excelDetail.setPurchasingUnit(cellContent);
                break;
            case 7:
                excelDetail.setPhysicalPersonInCharge(cellContent);
                break;
            case 8:
                excelDetail.setPhysicalDeliveryDate(cellContent);
                break;
            case 9:
                if (!StringUtils.isEmptyString(cellContent)) {
                    excelDetail.setPurchasePrice(new BigDecimal(cellContent));
                } else {
                    excelDetail.setPurchasePrice(new BigDecimal(0));
                }
                break;
            case 10:
                if (!StringUtils.isEmptyString(cellContent)) {
                    excelDetail.setNetBookValue(new BigDecimal(cellContent));
                } else {
                    excelDetail.setNetBookValue(new BigDecimal(0));
                }
                break;
            case 11:
                if (!StringUtils.isEmptyString(cellContent)) {
                    excelDetail.setResiduaValue(new BigDecimal(cellContent));
                } else {
                    excelDetail.setResiduaValue(new BigDecimal(0));
                }
                break;
            case 12:
                cellContent = replaceDate(cellContent);
                excelDetail.setFinancialTransferDate(cellContent);
                break;
            case 13:
                cellContent = replaceDate(cellContent);
                excelDetail.setInspectionDate(cellContent);
                break;
            case 14:
                excelDetail.setAssetManagementModel(cellContent);
                break;
            case 15:
                excelDetail.setBrand(cellContent);
                break;
            case 16:
                excelDetail.setSerialNum(cellContent);
                break;
            case 17:
                excelDetail.setManufacturer(cellContent);
                break;
            case 18:
                excelDetail.setStorageLocation(cellContent);
                break;
            case 19:
                excelDetail.setCurrentPhysicalTagNum(cellContent);
                break;
            case 20:
                excelDetail.setAssetManagementModel(cellContent);
                break;
            case 21:
                excelDetail.setNotesAndInstructions(cellContent);
                break;

            default:
                break;
            }

    }

    /**
     * 添加方法注释.
     * 
     * @param cellContent
     * @return .
     */
    private String replaceDate(String cellContent) {

        if (!(cellContent.split("-").length > 2)) {
            return cellContent;
        }

        switch (cellContent.split("-")[1])
            {
            case "一月":
                return cellContent.replace("一月", "01");
            case "二月":
                return cellContent.replace("二月", "02");
            case "三月":
                return cellContent.replace("三月", "03");
            case "四月":
                return cellContent.replace("四月", "04");
            case "五月":
                return cellContent.replace("五月", "05");
            case "六月":
                return cellContent.replace("六月", "06");
            case "七月":
                return cellContent.replace("七月", "07");
            case "八月":
                return cellContent.replace("八月", "08");
            case "九月":
                return cellContent.replace("九月", "09");
            case "十月":
                return cellContent.replace("十月", "10");
            case "十一月":
                return cellContent.replace("十一月", "11");
            case "十二月":
                return cellContent.replace("十二月", "12");
            default:
                return cellContent;
            }
    }

    /**
     * 提示前台方法提示层.
     * 
     * @param response
     *            响应 .
     * @param message
     *            信息 .
     * @param type
     *            类型 .
     * @throws IOException
     *             IO异常 .
     */
    public void tipInfo(HttpServletResponse response, String message, Integer type) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        // if (type == 1) {
        // response.getWriter().write("<script>parent.layer.closeAll('loading');parent.layer.msg('"
        // + message + "',2,1,function(){if (parent.UA.isChrome() &&
        // parent.UA.getVersion() <= 32) "
        // + "{history.go(-2)} else {history.back()}});</script>");
        // } else {
        response.getWriter().write("<script>parent.layer.closeAll('loading');parent.layer.alert('" + message + "', function(index){parent.layer.closeAll();}); </script>");
        // }
        
        //parent.layer.alert('" + message + "', function(index){parent.layer.closeAll();}); 
    }
}
