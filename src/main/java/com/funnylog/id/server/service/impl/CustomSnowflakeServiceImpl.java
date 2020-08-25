package com.funnylog.id.server.service.impl;

import com.funnylog.id.server.exceptions.SnowflakeException;
import com.funnylog.id.server.service.CustomSnowflakeService;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;
import com.sankuai.inf.leaf.service.SnowflakeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author FangYunLong
 * on 2020/8/24
 */
@Slf4j
@Service
public class CustomSnowflakeServiceImpl implements CustomSnowflakeService {
    private final SnowflakeService snowflakeService;

    public CustomSnowflakeServiceImpl(SnowflakeService snowflakeService) {
        this.snowflakeService = snowflakeService;
    }

    @Override
    public Long getId(String key) {
        log.info("getId for key ... [{}]", key);
        Result result = snowflakeService.getId(key);
        if (result.getStatus().equals(Status.EXCEPTION)) {
            throw new SnowflakeException(result.toString());
        }
        return result.getId();
    }
}
