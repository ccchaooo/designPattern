package com.dps.visitor.visitor;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengchao
 * @date 2019/1/2 14:38
 * 结构对象角色类。
 */
@Component
public class ObjectStructure {

    /**
     * 结构对象角色持有一个聚集
     */
    private List<Node> nodes = new ArrayList<Node>();

    /**
     * 执行方法操作
     */
    public void action(Visitor visitor){

        for(Node node : nodes)
        {
            node.accept(visitor);
        }

    }
    /**
     * 向外界提供add()方法作为对聚集的管理操作,通过调用这个方法，可以动态地增加一个新的节点。
     */
    public void add(Node node){
        nodes.add(node);
    }
}