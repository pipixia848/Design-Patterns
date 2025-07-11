package d8_组合模式;

public class Client {
    public static void main(String[] args) {


        // 创建学校
        OrganizationComponent university = new University("清华", "good");

        // 创建学院
        OrganizationComponent computer = new College("计算机学院","good");
        OrganizationComponent college = new College("信息工程", "good");


        //
        computer.add(new Department("软件工程", "good"));
        computer.add(new Department("网络工程", "good"));
        computer.add(new Department("工程", "good"));


        university.add(computer);

        university.print();
    }
}
