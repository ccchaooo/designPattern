package com.dps.visitor.multidispatch;

/**
 * @author dengchao
 * @date 2019/1/2 11:50
 */
public class SubEast1 extends East{
    @Override
    public void goEast(West west) {
        west.goWest1(this);
    }

    public String myName1(){
        return "SubEast1";
    }
}