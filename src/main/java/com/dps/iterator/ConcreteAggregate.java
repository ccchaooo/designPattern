package com.dps.iterator;

/**
 * @author dengchao
 * @date 2018/12/14 09:54
 * 定义具体容器角色(ConcreteAggregate)
 */

public class ConcreteAggregate implements List{

    private Object[] list;
    private int size=0;
    private int index=0;
    public ConcreteAggregate(){
        index=0;
        size=0;
        list=new Object[100];
    }
    @Override
    public void add(Object obj) {
        list[index++]=obj;
        size++;
    }

    @Override
    public Iterator iterator() {

        return new ConcreteIterator(this);
    }
    @Override
    public Object get(int index) {

        return list[index];
    }
    @Override
    public int getSize() {

        return size;
    }

}