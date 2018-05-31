package com.soukuan.simple;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.soukuan.domain.Foo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("stockDataFlowJob")
public class StockDataFlowJob implements DataflowJob<Foo> {

    @Override
    public List<Foo> fetchData(ShardingContext shardingContext) {
        List<Foo> result = new ArrayList<>();
        result.add(new Foo());
        System.out.println("抓取数据成功！");
        return result;
    }

    @Override
    public void processData(ShardingContext shardingContext, List<Foo> data) {
        System.out.println(String.format("------流式作业 Thread ID: %s, 任务总片数: %s, " +
                        "当前分片项: %s.当前参数: %s," +
                        "当前任务名称: %s.当前任务参数: %s"
                ,
                Thread.currentThread().getId(),
                shardingContext.getShardingTotalCount(),
                shardingContext.getShardingItem(),
                shardingContext.getShardingParameter(),
                shardingContext.getJobName(),
                shardingContext.getJobParameter()
        ));
    }
}