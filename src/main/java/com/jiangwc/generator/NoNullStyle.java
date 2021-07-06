package com.jiangwc.generator;

import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 功能描述：重写ToStringStyle，不打印出对象的空属性字段
 *
 * @author jiangwc
 * @since 2021-05-16
 */
public class NoNullStyle extends ToStringStyle implements Serializable {

    private static final long serialVersionUID = 2347542971151578670L;

    @Override
    public void append(StringBuffer buffer, String fieldName, Object value, Boolean fullDetail) {
        if (value != null) {
            super.append(buffer, fieldName, value, fullDetail);
        }
    }
}

