package org.wei.design.chain;

public abstract class Approver {
    protected Approver approver;
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
