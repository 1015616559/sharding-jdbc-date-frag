package org.zero.shardingjdbcdate.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

public class TblPreShardAlgo implements PreciseShardingAlgorithm<String> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        for (String str: collection) {
            return str+preciseShardingValue.getValue();
        }
        throw new IllegalArgumentException();
    }
}
