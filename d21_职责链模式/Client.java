package d21_职责链模式;

public class Client {

    /**
     * 职责链模式，
     * 定义一个抽象类，抽象类聚合本身
     * 具体实现类层层递进， 若自身不能处理，则交给下一级来处理
     * 如此变成一个环 
     * @param args
     */
    public static void main(String[] args) {

        // 创建一个请求
        PurchaseRequest request = new PurchaseRequest(1, 30001, 1);


        // 创建相关的审批人
        DepartmentApprover depart = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover(" 院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");


        // 设置层级 即set
        depart.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);

        depart.processRequest(request);

    }
}
