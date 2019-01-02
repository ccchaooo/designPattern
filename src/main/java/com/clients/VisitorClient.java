package com.clients;

import com.dps.visitor.visitor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dengchao
 * @date 2018/11/30 15:14
 */
@Service
public class VisitorClient implements Client {
    @Autowired
    ObjectStructure objectStructure;
    public void clientInterface() {
        //创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        //给结构增加一个节点
        os.add(new NodeA());
        //给结构增加一个节点
        os.add(new NodeB());
        //创建一个访问者A
        Visitor visitora = new VisitorA();
        os.action(visitora);
        System.out.println("-----------------------------");
        //创建一个访问者B
        Visitor visitorb = new VisitorB();
        os.action(visitorb);
    }
}
