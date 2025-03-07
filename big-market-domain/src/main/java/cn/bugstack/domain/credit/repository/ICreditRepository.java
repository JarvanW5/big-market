package cn.bugstack.domain.credit.repository;

import cn.bugstack.domain.credit.model.aggregate.TradeAggregate;
import cn.bugstack.domain.credit.model.entity.CreditAccountEntity;

/**
 * @author @JarvanW
 * @description 用户积分仓储
 * @create 2024-06-01 09:11
 */
public interface ICreditRepository {

    void saveUserCreditTradeOrder(TradeAggregate tradeAggregate);

    CreditAccountEntity queryUserCreditAccount(String userId);

}
