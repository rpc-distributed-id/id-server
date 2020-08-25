package com.funnylog.id.server.component;

import com.sankuai.inf.leaf.exception.InitException;
import com.sankuai.inf.leaf.service.SnowflakeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author FangYunLong
 * on 2020/8/25
 */
@Slf4j
@Component
public class SnowflakeComponent {

    private final SnowflakeConfig snowflakeConfig;

    public SnowflakeComponent(SnowflakeConfig snowflakeConfig) {
        this.snowflakeConfig = snowflakeConfig;
    }

    @Bean
    @ConditionalOnExpression(value = "${leaf.snowflake.enable}")
    public SnowflakeService snowflakeService() throws InitException {
        log.info("snowflakeService ....  bean");
        return new SnowflakeService(snowflakeConfig.getAddress(), snowflakeConfig.getPort());
    }
}
