package cn.bugstack.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: JarvanW
 * @Date: 2024/12/2
 * @Description: 抽奖奖品实体
 * @Requirements:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleAwardEntity {

    /**
     * 奖品ID
     **/
    private Integer awardId;
    /**
     * 奖品配置信息
     **/
    private String awardConfig;
    /**
     * 奖品顺序号
     **/
    private Integer sort;

}
