package cn.bugstack.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: JarvanW
 * @Date: 2024/12/16
 * @Description: 策略奖品库存key标识值对象
 * @Requirements:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyAwardStockKeyVO {

    // 策略ID
    private Long strategyId;

    // 奖品ID
    private Integer awardId;
}
