package org.wei.design.chain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 66000);
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");
        departmentApprover.setNextApprover(collegeApprover);
        collegeApprover.setNextApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setNextApprover(schoolMasterApprover);
        schoolMasterApprover.setNextApprover(departmentApprover);
        departmentApprover.processRequest(purchaseRequest);
    }
}
