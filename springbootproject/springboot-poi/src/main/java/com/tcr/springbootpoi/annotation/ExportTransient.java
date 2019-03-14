package com.tcr.springbootpoi.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/***
 * 导出的时候排除的bean的类型
 * @author DP
 *
 */
@Retention(RUNTIME) @Target({FIELD, METHOD, TYPE})
public @interface ExportTransient {}
