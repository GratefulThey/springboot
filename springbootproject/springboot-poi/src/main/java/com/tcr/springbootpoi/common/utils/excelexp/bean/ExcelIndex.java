package com.tcr.springbootpoi.common.utils.excelexp.bean;

/***
 * excel 位置信息
 * @author DP
 *
 */
public class ExcelIndex {
    /**开始行*/
    private int startRowNum;

    /**开始列*/
    private int startColNum;

    /**当前行*/
    private int currentRowNum;

    /**当前列*/
    private int currentColNum;

    /***
     * 构造函数
     * @param startRowNum 开始行
     * @param startColNum 开始列
     * @param currentRowNum 当前行
     * @param currentColNum 当前列
     */
    public ExcelIndex(int startRowNum, int startColNum, int currentRowNum, int currentColNum) {
        this.startRowNum = startRowNum;
        this.startColNum = startColNum;
        this.currentRowNum = currentRowNum;
        this.currentColNum = currentColNum;
    }

    /**
     * @return the startRowNum
     */
    public int getStartRowNum() {
        return startRowNum;
    }

    /**
     * @param startRowNum the startRowNum to set
     */
    public void setStartRowNum(int startRowNum) {
        this.startRowNum = startRowNum;
    }

    /**
     * @return the startColNum
     */
    public int getStartColNum() {
        return startColNum;
    }

    /**
     * @param startColNum the startColNum to set
     */
    public void setStartColNum(int startColNum) {
        this.startColNum = startColNum;
    }

    /**
     * @return the currentRowNum
     */
    public int getCurrentRowNum() {
        return currentRowNum;
    }

    /**
     * @param currentRowNum the currentRowNum to set
     */
    public void setCurrentRowNum(int currentRowNum) {
        this.currentRowNum = currentRowNum;
    }

    /**
     * @return the currentColNum
     */
    public int getCurrentColNum() {
        return currentColNum;
    }

    /**
     * @param currentColNum the currentColNum to set
     */
    public void setCurrentColNum(int currentColNum) {
        this.currentColNum = currentColNum;
    }
}
