package org.dog.domain.strategy.service.armory;

/**
 * @Author: Odin
 * @Date: 2024/5/31 18:54
 * @Description: 策略装配工厂，负责初始化策略计算
 */
public interface IStrategyArmory {

    /**
     * 装配抽奖策略配置「触发的时机可以为活动审核通过后进行调用」
     *
     * @param strategyId 策略ID
     * @return 装配结果
     */
    boolean assembleLotteryStrategy(Long strategyId);

}
