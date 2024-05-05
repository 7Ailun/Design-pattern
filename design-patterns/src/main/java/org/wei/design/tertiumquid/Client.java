package org.wei.design.tertiumquid;

public class Client {
    public static void main(String[] args) {
        MarriageAgency marriageAgency = new MarriageAgencyImpl();

        // 创建新郎和新娘
        Person zzh = new Person("周子豪", 20, "男", 21, marriageAgency);
        Person ldh = new Person("刘丹慧", 20, "女", 22, marriageAgency);
        Person zrn = new Person("章若楠",21,"女",20,marriageAgency);

        // 安排婚礼
        marriageAgency.register(zzh);
        marriageAgency.register(ldh);
        marriageAgency.register(zrn);
        marriageAgency.pair(zzh);
    }
}
