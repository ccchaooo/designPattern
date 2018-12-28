package com.dps.snapshot.mcp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengchao
 * @date 2018/12/13 11:42
 * 备忘录角色类，这个实现可以存储任意多的状态，外界可以使用检查点指数index来取出检查点上的状态。　　
 */
public class Memento {

    private List<String> states;
    private int index;
    /**
     * 构造函数
     */
    public Memento(List<String> states , int index){
        this.states = new ArrayList<String>(states);
        this.index = index;
    }
    public List<String> getStates() {
        return states;
    }
    public int getIndex() {
        return index;
    }

}