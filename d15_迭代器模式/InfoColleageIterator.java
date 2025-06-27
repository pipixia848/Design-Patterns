package d15_迭代器模式;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator {

    List<Department> departmentList;
    int index = -1;

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list里还有没有下一个元素
    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1){
            return false;
        } else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {

        return departmentList.get(index);
    }

    public void remove() {}

}
