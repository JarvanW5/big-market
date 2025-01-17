package cn.bugstack.test.infrastructure;

import cn.bugstack.domain.strategy.model.entity.StrategyAwardEntity;
import cn.bugstack.domain.strategy.model.vo.RuleTreeVO;
import cn.bugstack.domain.strategy.repository.IStrategyRepository;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/12/10
 * @Description: 仓储数据查询
 * @Requirements:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyRepositoryTest {

    @Resource
    private IStrategyRepository strategyRepository;

    @Test
    public void queryRuleTreeVOByTreeId() {

        RuleTreeVO ruleTreeVO = strategyRepository.queryRuleTreeVOByTreeId("tree_lock_1");
        log.info("测试结果：{}", JSON.toJSONString(ruleTreeVO));

    }

}
