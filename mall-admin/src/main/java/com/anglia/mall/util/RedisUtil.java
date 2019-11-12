package com.anglia.mall.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.concurrent.TimeUnit;

/**
 * redis的工具类
 */
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 设置key的过期时间，单位为秒
     * @param key
     * @param time
     * @return
     */
    public boolean expire(String key,long time){
        try {
            if(time > 0){
                redisTemplate.expire(key,time, TimeUnit.SECONDS);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 获取key的过期时间，单位为秒
     * @param key
     * @return
     */
    public long getExpire(String key){
        return redisTemplate.getExpire(key,TimeUnit.SECONDS);
    }

    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public boolean hasKey(String key){
        try {
            return redisTemplate.hasKey(key);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 删除多个key
     * @param key
     */
    public void delKey(String... key){
        if(key != null && key.length > 0){
            if(key.length == 1){
                redisTemplate.delete(key[0]);
            }else {
                redisTemplate.delete(CollectionUtils.arrayToList(key));
            }
        }
    }

    /**
     * 根据key获取值
     * @param key
     * @return
     */
    public Object get(String key){
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

    /**
     * 存入value,并设置key的过期时间
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key,Object value,long time){
        try {
            redisTemplate.opsForValue().set(key,value,time,TimeUnit.SECONDS);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 设置key递增
     * @param key
     * @param index
     * @return
     */
    public long incr(String key,long index){
        if(index < 0){
            throw  new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key,index);
    }

    /**
     * 设置key递减
     * @param key
     * @param index
     * @return
     */
    public long decr(String key,long index){
        if(index < 0){
            throw  new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.opsForValue().decrement(key,index);
    }

    /**
     * 其他类型的key待补充
     */

}
