package com.dps.visitor.visitor;

/**
 * @author dengchao
 * @date 2019/1/2 14:37
 * 抽象访问者角色为每一个具体节点都准备了一个访问操作。由于有两个节点，因此，对应就有两个访问操作。
 */
public interface Visitor {
    /**
     * 对应于NodeA的访问操作
     */
    public void visit(NodeA node);
    /**
     * 对应于NodeB的访问操作
     */
    public void visit(NodeB node);
}
