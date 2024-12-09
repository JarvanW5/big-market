package cn.bugstack.domain.strategy.service.rule.chain;

/**
 * @Author: JarvanW
 * @Date: 2024/12/5
 * @Description:
 * @Requirements:
 */

public abstract class AbstractLogicChain implements ILogicChain{

    private ILogicChain next;

    @Override
    public ILogicChain appendNext(ILogicChain next) {
        this.next = next;
        return next;
    }

    @Override
    public ILogicChain next() {
        return next;
    }

    protected abstract String ruleModel();
}
