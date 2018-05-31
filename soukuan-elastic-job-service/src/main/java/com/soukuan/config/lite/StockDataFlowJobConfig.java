package com.soukuan.config.lite;

import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.soukuan.config.base.LiteJobConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class StockDataFlowJobConfig extends LiteJobConfig {

    @Resource
    @Qualifier("stockDataFlowJob")
    private DataflowJob stockDataFlowJob;

    @Value("${stock.data.flow.cron}")
    private String cron;

    @Value("${stock.data.flow.shardingTotalCount}")
    private int shardingTotalCount;

    @Value("${stock.data.flow.shardingItemParameters}")
    private String shardingItemParameters;

    @Bean(initMethod = "init")
    public JobScheduler dataFlowJobScheduler() {
        return new SpringJobScheduler(stockDataFlowJob, regCenter,
                getLiteDataFlowJobConfiguration(stockDataFlowJob.getClass(), cron, shardingTotalCount, shardingItemParameters)
        );
    }


}