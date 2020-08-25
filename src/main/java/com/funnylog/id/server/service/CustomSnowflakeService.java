package com.funnylog.id.server.service;

/**
 * @author FangYunLong
 * on 2020/8/24
 */
public interface CustomSnowflakeService {

    /**
     * 获取id
     * @param key 业务key
     * @return id
     */
    Long getId(String key);
}
