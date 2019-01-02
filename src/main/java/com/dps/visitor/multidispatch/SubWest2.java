package com.dps.visitor.multidispatch;

/**
 * @author dengchao
 * @date 2019/1/2 11:50
 */
public class SubWest2 extends West{
    @Override
    public void goWest1(SubEast1 east) {

        System.out.println("SubWest2 + " + east.myName1());
    }

    @Override
    public void goWest2(SubEast2 east) {

        System.out.println("SubWest2 + " + east.myName2());
    }
}