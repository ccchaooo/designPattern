package com.dps.visitor.mozidemo;

import org.springframework.stereotype.Component;

/**
 * @author dengchao
 * @date 2018/12/28 17:08
 */
@Component
public class StaticDispatch {
    /**
     * 运行测试
     */
    public void dosth(){
        System.out.println("StaticDispatch:重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了");
        Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(wh);
        mozi.ride(bh);
        System.out.println("    显然，Mozi类的ride()方法是由三个方法重载而成的。这三个方法分别接受马(Horse)、白马(WhiteHorse)、黑马(BlackHorse)等类型的参数。\n" +
                "\n" +
                "            　　那么在运行时，程序会打印出什么结果呢？结果是程序会打印出相同的两行“骑马”。换言之，墨子发现他所骑的都是马。\n" +
                "\n" +
                "            　　为什么呢？两次对ride()方法的调用传入的是不同的参数，也就是wh和bh。它们虽然具有不同的真实类型，但是它们的静态类型都是一样的，均是Horse类型。\n" +
                "\n" +
                "            　　重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。");
    }
}
