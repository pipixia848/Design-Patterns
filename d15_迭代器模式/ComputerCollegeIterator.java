package d15_迭代器模式;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    //这里我们要知道Department是以怎样的方式实现
    Department[] departments;
    int position; // 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {

            return false;
        } else {

            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    // remove 空实现
    @Override
    public void remove() {

    }
}
