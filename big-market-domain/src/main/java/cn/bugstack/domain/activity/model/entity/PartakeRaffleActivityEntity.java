package cn.bugstack.domain.activity.model.entity;

import lombok.Data;

/**
 * @Author: JarvanW
 * @Date: 2025/2/6
 * @Description: 参与抽奖活动实体对象
 * @Requirements:
 */
@Data
public class PartakeRaffleActivityEntity {


    /**
     * 用户 ID
     */
    private String userId;

    /**
     * 活动 ID
     */
    private Long activityId;


}
