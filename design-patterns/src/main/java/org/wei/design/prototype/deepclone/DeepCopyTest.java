package org.wei.design.prototype.deepclone;

import java.io.IOException;

public class DeepCopyTest {
    public static void main(String[] args) throws IOException {
        DeepCloneTarget deepCloneTarget = new DeepCloneTarget("DeepCloneTarget");
        DeepClone deepClone = new DeepClone("深拷贝DeepClone",deepCloneTarget);
        DeepClone clone1 = deepClone.clone();
        System.out.println(deepClone.getDeepCloneTarget() == clone1.getDeepCloneTarget()); // false
        System.out.println(deepClone == clone1); // false
        System.out.println(deepClone.equals(clone1));
        System.out.println("deepClone = " + deepClone.hashCode());
        System.out.println("clone1 = " + clone1.hashCode());
        System.out.println("clone1 = " + clone1.hashCode() +  " HashCode = " + clone1.getDeepCloneTarget().hashCode());


        System.out.println("-----------------------------------");
        DeepClone deepClone1 = deepClone.deepClone();
        DeepClone deepClone2 = deepClone.deepClone();
        System.out.println(deepClone1 == deepClone2); //false
        System.out.println(deepClone1.getDeepCloneTarget() == deepClone2.getDeepCloneTarget()); // false

        System.out.println("deepClone1 = " + deepClone1.getDeepCloneTarget().hashCode());
        System.out.println("deepClone2 = " + deepClone2.getDeepCloneTarget().hashCode());
    }
}
