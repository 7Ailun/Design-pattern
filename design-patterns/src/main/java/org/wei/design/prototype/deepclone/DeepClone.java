package org.wei.design.prototype.deepclone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * 深拷贝
 */

@Data
public class DeepClone implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private String deepCloneName;
    private DeepCloneTarget deepCloneTarget;

    public DeepClone(){
        super();
    }

    public DeepClone(String deepCloneName,DeepCloneTarget deepCloneTarget) {
        this.deepCloneName = deepCloneName;
        this.deepCloneTarget = deepCloneTarget;
    }

    /**
     * 使用 clone 实现 深拷贝
     *
     * @return
     */
    @Override
    public DeepClone clone() {
        try {
            // 拿到拷贝之后的对象，然后对DeepCloneTarget对象进行深拷贝
            DeepClone deep = (DeepClone) super.clone();
            // 对DeepCloneTarget对象进行深拷贝
            deep.setDeepCloneTarget(this.deepCloneTarget.clone());
            return deep;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    /**
     * 使用序列化实现深拷贝
     *
     * @return
     */
    public DeepClone deepClone() throws IOException {
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            // 写入
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 把当前对象以对象流的方式输出

            // 读取
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepClone target = (DeepClone) ois.readObject();
            return target;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            bis.close();
            bos.close();
            ois.close();
            oos.close();
        }
    }
}
