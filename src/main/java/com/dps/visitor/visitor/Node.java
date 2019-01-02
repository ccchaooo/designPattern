package com.dps.visitor.visitor;

/**
 * @author dengchao
 * @date 2019/1/2 14:37
 * 抽象节点类
 */
public abstract class Node {
    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}
