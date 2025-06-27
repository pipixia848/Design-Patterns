package d15_迭代器模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College{

    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("xinxigongchen", "aaa");
        addDepartment("wangluo", "aaa");
        addDepartment("jui", "aaa");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {

        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}
