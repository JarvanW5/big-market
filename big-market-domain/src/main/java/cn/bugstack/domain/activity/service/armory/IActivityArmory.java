package cn.bugstack.domain.activity.service.armory;

/**
 * @author @JarvanW
 * @description 活动装配预热
 * @create 2024-03-30 09:09
 */
public interface IActivityArmory {

    boolean assembleActivitySkuByActivityId(Long activityId);

    boolean assembleActivitySku(Long sku);

}
