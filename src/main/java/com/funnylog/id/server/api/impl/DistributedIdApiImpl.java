package com.funnylog.id.server.api.impl;

import com.funnylog.id.server.api.DistributedIdApi;
import com.funnylog.id.server.service.CustomSnowflakeService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author FangYunLong
 * on 2020/8/24
 */
@Slf4j
@Data
@DubboService
public class DistributedIdApiImpl implements DistributedIdApi {

    private final CustomSnowflakeService customSnowflakeService;

    public DistributedIdApiImpl(CustomSnowflakeService customSnowflakeService) {
        this.customSnowflakeService = customSnowflakeService;
    }

    @Override
    public Long getSegmentId(String key) {
        return null;
    }

    @Override
    public Long getSnowflakeId(String key) {
        return customSnowflakeService.getId(key);
    }
}
