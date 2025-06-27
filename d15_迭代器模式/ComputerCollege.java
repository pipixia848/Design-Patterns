package d15_迭代器模式;

import java.util.Iterator;

public class ComputerCollege implements College{

    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java", "java");
        addDepartment("PHP", "PHP");
        addDepartment("C++", "C++");
    }


    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {

        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
