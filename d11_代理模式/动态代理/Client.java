package d11_代理模式.动态代理;

import d11_代理模式.静态代理.ITeacherDao;
import d11_代理模式.静态代理.TeacherDao;

public class Client {

    public static void main(String[] args) {

        //创建目标对象
        TeacherDao target = new TeacherDao();

        //给目标对象创建代理对象，可以转成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactor(target).getProxyInstance();


        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();

    }
}
