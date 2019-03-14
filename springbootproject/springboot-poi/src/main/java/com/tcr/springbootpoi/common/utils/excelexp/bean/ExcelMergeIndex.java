package com.tcr.springbootpoi.common.utils.excelexp.bean;

/***
 * 合并excel的位置信息
 * @author DP
 *
 */
public class ExcelMergeIndex implements Cloneable {
    /**需要合并的开始行*/
    private int mergeStartRowNum;

    /**需要合并的开始列*/
    private int mergeStartColNum;

    /**需要合并的结束行*/
    private int mergeEndRowNum;

    /**需要合并的结束列*/
    private int mergeEndColNum;

    /***
     * 构造函数
     */
    public ExcelMergeIndex() {

    }

    /**
     * 构造函数
     * @param mergeStartRowNum 合并开始行
     * @param mergeStartColNum 合并开始列
     * @param mergeEndRowNum 合并结束行
     * @param mergeEndColNum 合并结束列
     */
    public ExcelMergeIndex(int mergeStartRowNum, int mergeStartColNum, int mergeEndRowNum, int mergeEndColNum) {
        this.mergeEndColNum = mergeEndColNum;
        this.mergeEndRowNum = mergeEndRowNum;
        this.mergeStartColNum = mergeStartColNum;
        this.mergeStartRowNum = mergeStartRowNum;
    }

    /**
     * @return the mergeStartRowNum
     */
    public int getMergeStartRowNum() {
        return mergeStartRowNum;
    }

    /**
     * @param mergeStartRowNum the mergeStartRowNum to set
     */
    public void setMergeStartRowNum(int mergeStartRowNum) {
        this.mergeStartRowNum = mergeStartRowNum;
    }

    /**
     * @return the mergeStartColNum
     */
    public int getMergeStartColNum() {
        return mergeStartColNum;
    }

    /**
     * @param mergeStartColNum the mergeStartColNum to set
     */
    public void setMergeStartColNum(int mergeStartColNum) {
        this.mergeStartColNum = mergeStartColNum;
    }

    /**
     * @return the mergeEndRowNum
     */
    public int getMergeEndRowNum() {
        return mergeEndRowNum;
    }

    /**
     * @param mergeEndRowNum the mergeEndRowNum to set
     */
    public void setMergeEndRowNum(int mergeEndRowNum) {
        this.mergeEndRowNum = mergeEndRowNum;
    }

    /**
     * @return the mergeEndColNum
     */
    public int getMergeEndColNum() {
        return mergeEndColNum;
    }

    /**
     * @param mergeEndColNum the mergeEndColNum to set
     */
    public void setMergeEndColNum(int mergeEndColNum) {
        this.mergeEndColNum = mergeEndColNum;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ExcelMergeIndex index = (ExcelMergeIndex) super.clone();
        index.setMergeStartRowNum(this.getMergeStartRowNum());
        index.setMergeStartColNum(this.getMergeStartColNum());
        index.setMergeEndRowNum(this.getMergeEndRowNum());
        index.setMergeEndColNum(this.getMergeEndColNum());
        return index;
    }
}
