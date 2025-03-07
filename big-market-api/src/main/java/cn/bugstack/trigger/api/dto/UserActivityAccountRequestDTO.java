package cn.bugstack.trigger.api.dto;

import lombok.Data;

/**
 * @author @JarvanW
 * @description 用户活动账户请求对象
 * @create 2024-05-03 07:17
 */
@Data
public class UserActivityAccountRequestDTO {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}
