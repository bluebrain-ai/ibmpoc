package com.bluescript.demo.entity;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("MqControl")
@Data
public class ksdsCustEntity {
    @Id
    private long customerNum;
    private String customerData;
}
