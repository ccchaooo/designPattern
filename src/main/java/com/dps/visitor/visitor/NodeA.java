package com.dps.visitor.visitor;

/**
 * @author dengchao
 * @date 2019/1/2 14:38
 * 具体节点类NodeA
 */
public class NodeA extends Node{
    /**
     * 接受操作
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeA特有的方法
     */
    public String operationA(){
        return "NodeA";
    }

}
