package com.dps.visitor.visitor;

/**
 * @author dengchao
 * @date 2019/1/2 14:38
 * 具体节点类NodeB
 */
public class NodeB extends Node{
    /**
     * 接受方法
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeB特有的方法
     */
    public String operationB(){
        return "NodeB";
    }
}