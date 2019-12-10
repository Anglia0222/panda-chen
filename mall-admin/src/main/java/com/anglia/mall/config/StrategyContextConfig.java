package com.anglia.mall.config;

import com.anglia.mall.interfaceImpl.ReportBehaviorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class StrategyContextConfig {

    @Autowired
    private final Map<String, ReportBehaviorService> strategyMap = new ConcurrentHashMap<String, ReportBehaviorService>();


    public StrategyContextConfig(){

    }
    public String getService(String serviceName){

        return this.strategyMap.get(serviceName).generate();
    }



}
