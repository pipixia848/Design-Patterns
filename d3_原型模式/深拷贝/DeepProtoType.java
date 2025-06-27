package d3_原型模式.深拷贝;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType(){
        super();
    }

    //方式1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        //完成对基本数据类型的克隆
        deep = super.clone();

        //对引用类型的属性单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }

    //方式2 通过对象的序列化实现
    public Object deepClone(){

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
