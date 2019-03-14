package com.tcr.springbootpoi.common.utils.excelexp.bean;

//import org.apache.commons.lang.ObjectUtils;

/***
 * excel头部信息抽象类
 * @author DP
 *
 */
public class ExcelHeader {
    /***名称*/
    private String headName;

    /**开始行*/
    private Integer fromRow;

    /**结束行*/
    private Integer toRow;

    /**开始列*/
    private Integer fromCol;

    /**结束列*/
    private Integer toCol;

    /***
     * 构造函数---将会根据fromRow,toRow,fromCol,ToCol进行合并
     * @param headName 头部名称
     * @param fromRow 开始行
     * @param toRow 结束行
     * @param fromCol 开始列
     * @param toCol 结束列
     */
    public ExcelHeader(String headName, Integer fromRow, Integer toRow, Integer fromCol, Integer toCol) {
        this.headName = headName;
        this.fromRow = fromRow;
        this.toRow = toRow;
        this.fromCol = fromCol;
        this.toCol = toCol;
    }

    /***
     * 根据所占用的行数和列数判断是否需要合并
     * @return
     */
    public boolean isMerge() {
        return true;
        //return !(ObjectUtils.equals(fromRow, toRow) && ObjectUtils.equals(fromCol, toCol));
    }

    /**
     * @return the headName
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * @param headName the headName to set
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * @return the fromRow
     */
    public Integer getFromRow() {
        return fromRow;
    }

    /**
     * @param fromRow the fromRow to set
     */
    public void setFromRow(Integer fromRow) {
        this.fromRow = fromRow;
    }

    /**
     * @return the toRow
     */
    public Integer getToRow() {
        return toRow;
    }

    /**
     * @param toRow the toRow to set
     */
    public void setToRow(Integer toRow) {
        this.toRow = toRow;
    }

    /**
     * @return the fromCol
     */
    public Integer getFromCol() {
        return fromCol;
    }

    /**
     * @param fromCol the fromCol to set
     */
    public void setFromCol(Integer fromCol) {
        this.fromCol = fromCol;
    }

    /**
     * @return the toCol
     */
    public Integer getToCol() {
        return toCol;
    }

    /**
     * @param toCol the toCol to set
     */
    public void setToCol(Integer toCol) {
        this.toCol = toCol;
    }
}
