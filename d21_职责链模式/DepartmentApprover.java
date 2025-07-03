package d21_职责链模式;

public class DepartmentApprover extends Approver{

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {

        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println(purchaseRequest.getId() +
                    this.name);
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
