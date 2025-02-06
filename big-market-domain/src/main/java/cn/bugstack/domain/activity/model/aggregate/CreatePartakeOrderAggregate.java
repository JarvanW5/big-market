package cn.bugstack.domain.activity.model.aggregate;

import cn.bugstack.domain.activity.model.entity.ActivityAccountDayEntity;
import cn.bugstack.domain.activity.model.entity.ActivityAccountEntity;
import cn.bugstack.domain.activity.model.entity.ActivityAccountMonthEntity;
import cn.bugstack.domain.activity.model.entity.UserRaffleOrderEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: JarvanW
 * @Date: 2025/2/6
 * @Description: 参与活动订单聚合对象
 * @Requirements:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreatePartakeOrderAggregate {
    private String userId;
    private Long activityId;
    private ActivityAccountEntity activityAccountEntity;
    private boolean isExistAccountMonth = true;
    private boolean isExistAccountDay = true;
    private ActivityAccountMonthEntity activityAccountMonthEntity;
    private ActivityAccountDayEntity activityAccountDayEntity;
    private UserRaffleOrderEntity userRaffleOrderEntity;

}
