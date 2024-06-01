package org.dog.domain.strategy.respository;

import org.dog.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Odin
 * @Date: 2024/5/31 18:58
 * @Description:策略服务仓储接口
 */
public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(Long strategyId, int rateRange, Map<Integer, Integer> shuffleStrategyAwardSearchRateTable);

    int getRateRange(Long strategyId);

    Integer getStrategyAwardAssemble(Long strategyId, int rateKey);
}
