package d3_原型模式.深拷贝;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    //
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;

    }

    //属性都为String，用默认的clone即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
