package d21_职责链模式;

public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 10000 && purchaseRequest.getPrice() >= 5000) {
            System.out.println(purchaseRequest.getId() +
                    this.name);
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
