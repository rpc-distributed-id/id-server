package com.funnylog.id.server.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author FangYunLong
 * on 2020/8/25
 */
@Data
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SnowflakeException extends RuntimeException {
    private String message;
}
