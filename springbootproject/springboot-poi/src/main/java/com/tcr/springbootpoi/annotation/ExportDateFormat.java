package com.tcr.springbootpoi.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/***
 * 导出exceldate类型数据的格式化
 * @author DP
 *
 */
@Retention(RUNTIME) @Target({FIELD, METHOD, TYPE})
public @interface ExportDateFormat {
    /***
     * Date类型的数据格式化的格式
     * @return
     */
    String value() default "yyyy-MM-dd'T'HH:mm:ss";
}
