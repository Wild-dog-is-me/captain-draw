package org.dog.domain.strategy.service.armory;

/**
 * @Author: Odin
 * @Date: 2024/6/1 20:43
 * @Description:策略抽奖调度
 */
public interface IStrategyDispatch {


    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);
}
