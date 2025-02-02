package cn.bugstack.domain.activity.service;

import cn.bugstack.domain.activity.repository.IActivityRepository;
import org.springframework.stereotype.Service;

/**
 * @Author: JarvanW
 * @Date: 2025/2/3
 * @Description: 抽奖活动服务
 * @Requirements:
 */
@Service
public class RaffleActivityService extends AbstractRaffleActivity {
    public RaffleActivityService(IActivityRepository activityRepository) {
        super(activityRepository);
    }
}
