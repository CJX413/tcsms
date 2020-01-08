package com.example.tcsms.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public interface RedisService {
    Jedis getRedis();
}
