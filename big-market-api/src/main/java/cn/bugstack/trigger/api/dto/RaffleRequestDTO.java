package cn.bugstack.trigger.api.dto;

import lombok.Data;

/**
 * @Author: JarvanW
 * @Date: 2024/12/18
 * @Description: 抽奖请求参数
 * @Requirements:
 */
@Data
public class RaffleRequestDTO {

    // 抽奖策略ID
    private Long strategyId;

}
