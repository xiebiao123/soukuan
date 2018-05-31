package com.soukuan.config.lite;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.soukuan.config.base.LiteJobConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class StockSimpleJobConfig extends LiteJobConfig {

    @Resource
    @Qualifier("stockSimpleJob")
    private SimpleJob stockSimpleJob;

    @Value("${stock.simple.cron}")
    private String cron;

    @Value("${stock.simple.shardingTotalCount}")
    private int shardingTotalCount;

    @Value("${stock.simple.shardingItemParameters}")
    private String shardingItemParameters;

    @Bean(initMethod = "init")
    public JobScheduler simpleJobScheduler() {
        return new SpringJobScheduler(stockSimpleJob, regCenter,
                getLiteJobConfiguration(stockSimpleJob.getClass(), cron, shardingTotalCount, shardingItemParameters)
        );
    }


}