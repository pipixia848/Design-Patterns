package d11_代理模式.静态代理;

public class Cliemt {


    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象，同时将被代理对象传给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }

}
