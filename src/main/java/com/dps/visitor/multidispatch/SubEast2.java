package com.dps.visitor.multidispatch;

/**
 * @author dengchao
 * @date 2019/1/2 11:50
 */
public class SubEast2 extends East{
    @Override
    public void goEast(West west) {
        west.goWest2(this);
    }

    public String myName2(){
        return "SubEast2";
    }
}