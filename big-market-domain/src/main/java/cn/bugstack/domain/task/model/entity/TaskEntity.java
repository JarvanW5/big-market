package cn.bugstack.domain.task.model.entity;

import lombok.Data;

/**
 * @Author: JarvanW
 * @Date: 2025/2/7
 * @Description:
 * @Requirements:
 */
@Data
public class TaskEntity {

    /**
     * 活动ID
     */
    private String userId;
    /**
     * 消息主题
     */
    private String topic;
    /**
     * 消息编号
     */
    private String messageId;
    /**
     * 消息主体
     */
    private String message;

}
