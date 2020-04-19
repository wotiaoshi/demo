package com.example.demo1.service;

import org.redisson.api.RLock;
import org.redisson.api.RReadWriteLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Service
public class RedissonService {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    RedissonClient redissonClient;
    public void insertRedis() throws InterruptedException {
        RLock lock = redissonClient.getLock("lock");
        RReadWriteLock lock1 = redissonClient.getReadWriteLock("lock");
        boolean b = lock.tryLock(30, TimeUnit.MINUTES);
        RLock readLock = lock1.readLock();
        RLock writeLock = lock1.writeLock();
        ThreadLocal threadLocal = new ThreadLocal();
        lock.lock();
        for(int i = 0;i<10;i++)
        redisTemplate.opsForValue().increment("num");
        lock.unlock();
    }
}
