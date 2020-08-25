package com.funnylog.id.server.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author FangYunLong
 * on 2020/8/25
 */
@Data
@Configuration
@ConfigurationProperties("leaf.snowflake")
public class SnowflakeConfig {
    private Boolean enable;
    private Integer port;
    private String address;

}
