package com.jiang.sharding.config;


import java.util.Collection;
import java.util.LinkedHashSet;
import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;
import com.google.common.collect.Range;
/**
 * @description: 依据单一字段分表算法实现类
 * @author:
 * @create: 2019-06-04 13:03
 */
public class UserOrderSingleKeyShardingAlgorithm implements SingleKeyTableShardingAlgorithm<String> {



    @Override
    public Collection<String> doBetweenSharding(Collection<String> tableNames, ShardingValue<String> shardingValue) {
        Collection<String> result = new LinkedHashSet<String>(tableNames.size());
        Range<String> range = (Range<String>) shardingValue.getValueRange();
        for (long i = Long.parseLong(range.lowerEndpoint()); i <= Long.parseLong(range.upperEndpoint()); i++) {
            for (String each : tableNames) {
                String tableIdx = String.valueOf(i % 4);
                if (each.endsWith(tableIdx)) {
                    result.add(each);
                }
            }
        }
        return result;
    }
    @Override
    public String doEqualSharding(Collection<String> tableNames, ShardingValue<String> shardingValue) {
        String tableIdx = String.valueOf(Long.parseLong(shardingValue.getValue()) % 4);
        for (String each : tableNames) {
            if (each.endsWith(tableIdx)) {
                return each;
            }
        }
        throw new IllegalArgumentException();
    }





    @Override
    public Collection<String> doInSharding(Collection<String> tableNames, ShardingValue<String> shardingValue) {
        Collection<String> result = new LinkedHashSet<String>(tableNames.size());
        for (String value : shardingValue.getValues()) {
            for (String tableName : tableNames) {
                String tableIdx = String.valueOf(Long.parseLong(value) % 4);
                if (tableName.endsWith(tableIdx)) {
                    result.add(tableName);
                }
            }
        }
        return result;
    }
}