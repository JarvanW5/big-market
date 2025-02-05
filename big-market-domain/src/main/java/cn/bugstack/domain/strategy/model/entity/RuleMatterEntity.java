package cn.bugstack.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: JarvanW
 * @Date: 2024/12/2
 * @Description:
 * @Requirements:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleMatterEntity {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 策略ID
     */
    private Long strategyId;
    /**
     * 抽奖奖品ID 【规则类型为策略，则不需要奖品】
     */
    private Integer awardId;
    /**
     * 抽奖规则类型 【rule_random - 随即值计算、rule_lock - 抽奖几次后解锁、rule_luck_award - 幸运奖（兜底奖品）】
     */
    private String ruleModel;
}
