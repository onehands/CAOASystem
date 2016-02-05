package com.ca.model;

import java.math.BigDecimal;
import java.util.Date;

public class MAssetsSystemVo {
    /**
     * @主键
     */
    private String keyID;

    /**
     * @数据日期
     */
    private Date dataDate;

    /**
     * @序号
     */
    private Integer sequenceNum;

    /**
     * @实物编号
     */
    private String physicalNum;

    /**
     * @资产编号
     */
    private String assetNum;

    /**
     * @设备名称
     */
    private String deviceNum;

    /**
     * @规格型号
     */
    private String specificationModel;

    /**
     * @设备状态
     */
    private String equipmentStatus;

    /**
     * @采购单位
     */
    private String purchasingUnit;

    /**
     * @实物负责人
     */
    private String physicalPersonInCharge;

    /**
     * @实物交付日期
     */
    private String physicalDeliveryDate;

    /**
     * @采购单价
     */
    private BigDecimal purchasePrice;

    /**
     * @帐面净值
     */
    private BigDecimal netBookValue;

    /**
     * @残值
     */
    private BigDecimal residuaValue;

    /**
     * @财务转固日期
     */
    private String financialTransferDate;

    /**
     * @验货日期
     */
    private String inspectionDate;

    /**
     * @资产管理模式
     */
    private String assetManagementModel;

    /**
     * @品牌
     */
    private String brand;

    /**
     * @序列号
     */
    private String serialNum;

    /**
     * @制造商
     */
    private String manufacturer;

    /**
     * @存放地点
     */
    private String storageLocation;

    /**
     * @现行实物标签号
     */
    private String currentPhysicalTagNum;

    /**
     * @备注及说明
     */
    private String notesAndInstructions;

    /**
     * 设置keyID.
     * 
     * @return 返回keyID.
     */
    public String getKeyID() {
        return keyID;
    }

    /**
     * 获取keyID.
     * 
     * @param keyID
     *            要设置的keyID.
     */
    public void setKeyID(String keyID) {
        this.keyID = keyID;
    }

    /**
     * 设置dataDate.
     * 
     * @return 返回dataDate.
     */
    public Date getDataDate() {
        return dataDate;
    }

    /**
     * 获取dataDate.
     * 
     * @param dataDate
     *            要设置的dataDate.
     */
    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }

    /**
     * 设置sequenceNum.
     * 
     * @return 返回sequenceNum.
     */
    public Integer getSequenceNum() {
        return sequenceNum;
    }

    /**
     * 获取sequenceNum.
     * 
     * @param sequenceNum
     *            要设置的sequenceNum.
     */
    public void setSequenceNum(Integer sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    /**
     * 设置physicalNum.
     * 
     * @return 返回physicalNum.
     */
    public String getPhysicalNum() {
        return physicalNum;
    }

    /**
     * 获取physicalNum.
     * 
     * @param physicalNum
     *            要设置的physicalNum.
     */
    public void setPhysicalNum(String physicalNum) {
        this.physicalNum = physicalNum;
    }

    /**
     * 设置assetNum.
     * 
     * @return 返回assetNum.
     */
    public String getAssetNum() {
        return assetNum;
    }

    /**
     * 获取assetNum.
     * 
     * @param assetNum
     *            要设置的assetNum.
     */
    public void setAssetNum(String assetNum) {
        this.assetNum = assetNum;
    }

    /**
     * 设置deviceNum.
     * 
     * @return 返回deviceNum.
     */
    public String getDeviceNum() {
        return deviceNum;
    }

    /**
     * 获取deviceNum.
     * 
     * @param deviceNum
     *            要设置的deviceNum.
     */
    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum;
    }

    /**
     * 设置specificationModel.
     * 
     * @return 返回specificationModel.
     */
    public String getSpecificationModel() {
        return specificationModel;
    }

    /**
     * 获取specificationModel.
     * 
     * @param specificationModel
     *            要设置的specificationModel.
     */
    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
    }

    /**
     * 设置equipmentStatus.
     * 
     * @return 返回equipmentStatus.
     */
    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    /**
     * 获取equipmentStatus.
     * 
     * @param equipmentStatus
     *            要设置的equipmentStatus.
     */
    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    /**
     * 设置purchasingUnit.
     * 
     * @return 返回purchasingUnit.
     */
    public String getPurchasingUnit() {
        return purchasingUnit;
    }

    /**
     * 获取purchasingUnit.
     * 
     * @param purchasingUnit
     *            要设置的purchasingUnit.
     */
    public void setPurchasingUnit(String purchasingUnit) {
        this.purchasingUnit = purchasingUnit;
    }

    /**
     * 设置physicalPersonInCharge.
     * 
     * @return 返回physicalPersonInCharge.
     */
    public String getPhysicalPersonInCharge() {
        return physicalPersonInCharge;
    }

    /**
     * 获取physicalPersonInCharge.
     * 
     * @param physicalPersonInCharge
     *            要设置的physicalPersonInCharge.
     */
    public void setPhysicalPersonInCharge(String physicalPersonInCharge) {
        this.physicalPersonInCharge = physicalPersonInCharge;
    }

    /**
     * 设置physicalDeliveryDate.
     * 
     * @return 返回physicalDeliveryDate.
     */
    public String getPhysicalDeliveryDate() {
        return physicalDeliveryDate;
    }

    /**
     * 获取physicalDeliveryDate.
     * 
     * @param physicalDeliveryDate
     *            要设置的physicalDeliveryDate.
     */
    public void setPhysicalDeliveryDate(String physicalDeliveryDate) {
        this.physicalDeliveryDate = physicalDeliveryDate;
    }

    /**
     * 设置purchasePrice.
     * 
     * @return 返回purchasePrice.
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * 获取purchasePrice.
     * 
     * @param purchasePrice
     *            要设置的purchasePrice.
     */
    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * 设置netBookValue.
     * 
     * @return 返回netBookValue.
     */
    public BigDecimal getNetBookValue() {
        return netBookValue;
    }

    /**
     * 获取netBookValue.
     * 
     * @param netBookValue
     *            要设置的netBookValue.
     */
    public void setNetBookValue(BigDecimal netBookValue) {
        this.netBookValue = netBookValue;
    }

    /**
     * 设置residuaValue.
     * 
     * @return 返回residuaValue.
     */
    public BigDecimal getResiduaValue() {
        return residuaValue;
    }

    /**
     * 获取residuaValue.
     * 
     * @param residuaValue
     *            要设置的residuaValue.
     */
    public void setResiduaValue(BigDecimal residuaValue) {
        this.residuaValue = residuaValue;
    }

    /**
     * 设置financialTransferDate.
     * 
     * @return 返回financialTransferDate.
     */
    public String getFinancialTransferDate() {
        return financialTransferDate;
    }

    /**
     * 获取financialTransferDate.
     * 
     * @param financialTransferDate
     *            要设置的financialTransferDate.
     */
    public void setFinancialTransferDate(String financialTransferDate) {
        this.financialTransferDate = financialTransferDate;
    }

    /**
     * 设置inspectionDate.
     * 
     * @return 返回inspectionDate.
     */
    public String getInspectionDate() {
        return inspectionDate;
    }

    /**
     * 获取inspectionDate.
     * 
     * @param inspectionDate
     *            要设置的inspectionDate.
     */
    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    /**
     * 设置assetManagementModel.
     * 
     * @return 返回assetManagementModel.
     */
    public String getAssetManagementModel() {
        return assetManagementModel;
    }

    /**
     * 获取assetManagementModel.
     * 
     * @param assetManagementModel
     *            要设置的assetManagementModel.
     */
    public void setAssetManagementModel(String assetManagementModel) {
        this.assetManagementModel = assetManagementModel;
    }

    /**
     * 设置brand.
     * 
     * @return 返回brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 获取brand.
     * 
     * @param brand
     *            要设置的brand.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 设置serialNum.
     * 
     * @return 返回serialNum.
     */
    public String getSerialNum() {
        return serialNum;
    }

    /**
     * 获取serialNum.
     * 
     * @param serialNum
     *            要设置的serialNum.
     */
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    /**
     * 设置manufacturer.
     * 
     * @return 返回manufacturer.
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 获取manufacturer.
     * 
     * @param manufacturer
     *            要设置的manufacturer.
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * 设置storageLocation.
     * 
     * @return 返回storageLocation.
     */
    public String getStorageLocation() {
        return storageLocation;
    }

    /**
     * 获取storageLocation.
     * 
     * @param storageLocation
     *            要设置的storageLocation.
     */
    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * 设置currentPhysicalTagNum.
     * 
     * @return 返回currentPhysicalTagNum.
     */
    public String getCurrentPhysicalTagNum() {
        return currentPhysicalTagNum;
    }

    /**
     * 获取currentPhysicalTagNum.
     * 
     * @param currentPhysicalTagNum
     *            要设置的currentPhysicalTagNum.
     */
    public void setCurrentPhysicalTagNum(String currentPhysicalTagNum) {
        this.currentPhysicalTagNum = currentPhysicalTagNum;
    }

    /**
     * 设置notesAndInstructions.
     * 
     * @return 返回notesAndInstructions.
     */
    public String getNotesAndInstructions() {
        return notesAndInstructions;
    }

    /**
     * 获取notesAndInstructions.
     * 
     * @param notesAndInstructions
     *            要设置的notesAndInstructions.
     */
    public void setNotesAndInstructions(String notesAndInstructions) {
        this.notesAndInstructions = notesAndInstructions;
    }

}