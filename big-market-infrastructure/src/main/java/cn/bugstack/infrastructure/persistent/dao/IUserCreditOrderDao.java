package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.infrastructure.persistent.po.UserCreditAccount;
import cn.bugstack.infrastructure.persistent.po.UserCreditOrder;
import cn.bugstack.middleware.db.router.annotation.DBRouter;
import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author @JarvanW
 * @description 用户积分流水单 DAO
 * @create 2024-06-01 08:55
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserCreditOrderDao {

    void insert(UserCreditOrder userCreditOrderReq);

}
