package d21_职责链模式;

// 职责抽象类
public abstract class Approver {

    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    // 设置下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    // 处理审批请求方法，得到一个抽象类
    public abstract void processRequest(PurchaseRequest purchaseRequest);


}
