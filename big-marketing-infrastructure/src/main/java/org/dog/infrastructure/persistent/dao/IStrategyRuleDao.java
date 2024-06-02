package org.dog.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dog.infrastructure.persistent.po.StrategyRule;

import java.util.List;

/**
 * @Author: Odin
 * @Date: 2024/5/12 13:49
 * @Description:
 */
@Mapper
public interface IStrategyRuleDao {

    List<StrategyRule> queryStrategyRuleList();

    StrategyRule queryStrategyRule(StrategyRule strategyRuleReq);
}
