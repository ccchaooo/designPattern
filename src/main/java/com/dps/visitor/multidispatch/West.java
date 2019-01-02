package com.dps.visitor.multidispatch;

/**
 * @author dengchao
 * @date 2019/1/2 11:49
 */
public abstract class West {

    public abstract void goWest1(SubEast1 east);

    public abstract void goWest2(SubEast2 east);
}