package com.soukuan.config.base;

import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;

import javax.annotation.Resource;

/**
 * Lite job 公共配置
 */
public abstract class LiteJobConfig {

    @Resource
    protected ZookeeperRegistryCenter regCenter;

    /**
     * 任务配置类(简单作业)
     */
    protected LiteJobConfiguration getLiteSimpleJobConfiguration(final Class<? extends SimpleJob> jobClass,
                                                           final String cron,
                                                           final int shardingTotalCount,
                                                           final String shardingItemParameters) {
        return LiteJobConfiguration
                .newBuilder(
                        new SimpleJobConfiguration(
                                JobCoreConfiguration.newBuilder(jobClass.getName(), cron, shardingTotalCount)
                                        .shardingItemParameters(shardingItemParameters)
                                        .build()
                                , jobClass.getCanonicalName()
                        )
                )
                .overwrite(true)
                .build();
    }


    /**
     * 任务配置类(流式作业)
     */
    protected LiteJobConfiguration getLiteDataFlowJobConfiguration(final Class<? extends DataflowJob> jobClass,
                                                           final String cron,
                                                           final int shardingTotalCount,
                                                           final String shardingItemParameters) {
        return LiteJobConfiguration
                .newBuilder(
                        new DataflowJobConfiguration(
                                JobCoreConfiguration.newBuilder(jobClass.getName(), cron, shardingTotalCount)
                                        .shardingItemParameters(shardingItemParameters)
                                        .build()
                                , jobClass.getCanonicalName()
                                ,true
                        )
                )
                .overwrite(true)
                .build();
    }

}
