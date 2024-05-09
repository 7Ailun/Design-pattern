package org.wei.design.chain;

public class ViceSchoolMasterApprover extends Approver{
    private String name;
    public ViceSchoolMasterApprover(String name) {
        this.name = name;
    }

    public void setNextApprover(Approver approver) {
        super.approver = approver;
    }
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 5000) {
            System.out.println("请求编号 id= " + purchaseRequest.getNumber() + " 被 " + this.name + " 处理");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
