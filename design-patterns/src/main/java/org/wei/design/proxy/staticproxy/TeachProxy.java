package org.wei.design.proxy.staticproxy;

public class TeachProxy implements ITeachDao {
    private final ITeachDao teachDao;
    public TeachProxy(ITeachDao teachDao) {
        this.teachDao = teachDao;
    }
    @Override
    public void teach() {
        System.out.println("代理开始");
        teachDao.teach();
        System.out.println("代理结束");
    }
}
