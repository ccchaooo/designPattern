package com.dps.observer.pull;

/**
 * @author dengchao
 * @date 2018/12/4 23:22
 * 拉模型通常都是把主题对象当做参数传递
 */
public interface Observer {
    /**
     * 更新接口
     * @param subject 传入主题对象，方面获取相应的主题对象的状态
     */
    public void update(Subject subject);
}
