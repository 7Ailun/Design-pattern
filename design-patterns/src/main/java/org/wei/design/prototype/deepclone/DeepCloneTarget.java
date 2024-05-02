package org.wei.design.prototype.deepclone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 深度拷贝目标类
 */
@Data
public class DeepCloneTarget implements Serializable,Cloneable {
    // String 类型默认都是深拷贝
    private String targetName;
    private static final long serialVersionUID = 1L;

    public DeepCloneTarget(String targetName) {
        this.targetName = targetName;
    }
    @Override
    public DeepCloneTarget clone() {
        try {
            DeepCloneTarget deepCloneTarget = (DeepCloneTarget) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return deepCloneTarget;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
