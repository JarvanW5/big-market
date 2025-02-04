package cn.bugstack.domain.activity.service.rule;

/**
 * @Author: JarvanW
 * @Date: 2025/2/3
 * @Description: 下单规则责任链抽象类
 * @Requirements:
 */

public abstract class AbstractActionChain implements IActionChain{

    private IActionChain next;

    @Override
    public IActionChain next() {
        return next;
    }

    @Override
    public IActionChain appendNext(IActionChain next) {
        this.next = next;
        return next;
    }

}
