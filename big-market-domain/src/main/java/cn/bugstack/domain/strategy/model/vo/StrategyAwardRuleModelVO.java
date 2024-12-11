package cn.bugstack.domain.strategy.model.vo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/12/4
 * @Description: 抽奖策略规则值对象；值对象，没有唯一ID，仅限于从数据库查询对象
 * @Requirements:
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyAwardRuleModelVO {

    private String ruleModels;
}
