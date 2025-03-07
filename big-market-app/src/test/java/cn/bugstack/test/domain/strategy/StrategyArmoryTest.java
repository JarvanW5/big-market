package cn.bugstack.test.domain.strategy;

import cn.bugstack.domain.strategy.service.armory.IStrategyArmory;
import cn.bugstack.domain.strategy.service.armory.IStrategyDispatch;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: JarvanW
 * @Date: 2024/11/26
 * @Description:
 * @Requirements:
 */


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyArmoryTest {

    @Resource
    private IStrategyArmory strategyArmory;

    @Resource
    private IStrategyDispatch strategyDispatch;


    @Test
    public void test_strategyArmory() {
        strategyArmory.assembleLotteryStrategy(100002L);
    }

    @Test
    public void test_getAssembleRandomVal() {
        log.info("测试结果: {} - 奖品ID值", strategyDispatch.getRandomAwardId(100002L));
        log.info("测试结果: {} - 奖品ID值", strategyDispatch.getRandomAwardId(100002L));
        log.info("测试结果: {} - 奖品ID值", strategyDispatch.getRandomAwardId(100002L));
        log.info("测试结果: {} - 奖品ID值", strategyDispatch.getRandomAwardId(100002L));
        log.info("测试结果: {} - 奖品ID值", strategyDispatch.getRandomAwardId(100002L));
        log.info("测试结果: {} - 奖品ID值", strategyDispatch.getRandomAwardId(100002L));
        log.info("测试结果: {} - 奖品ID值", strategyDispatch.getRandomAwardId(100002L));
    }
}
