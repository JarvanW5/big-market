package cn.bugstack.trigger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: JarvanW
 * @Date: 2024/12/18
 * @Description: 抽奖奖品列表，请求对象
 * @Requirements:
 */
@Data

public class RaffleAwardListRequestDTO {

    // 抽奖策略ID
    private Long strategyId;

}
