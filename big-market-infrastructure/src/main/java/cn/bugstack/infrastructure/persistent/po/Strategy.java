package cn.bugstack.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @Author: JarvanW
 * @Date: 2024/11/21
 * @Description: 抽奖策略
 * @Requirements:
 */

@Data
public class Strategy {

    /** 自增ID */
    private Long id;
    /** 抽奖策略ID */
    private Long strategyId;
    /** 抽奖策略描述 */
    private String strategyDesc;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}
