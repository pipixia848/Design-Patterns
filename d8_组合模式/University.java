package d8_组合模式;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponentss = new ArrayList<OrganizationComponent>();

    // 构造器
    public University(String name, String des) {
        super(name, des);
        this.organizationComponentss = organizationComponentss;
    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentss.add(organizationComponent);
    }

    //
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentss.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {

        System.out.println(getName());
        for (OrganizationComponent organizationComponent : organizationComponentss){
            organizationComponent.print();
        }
    }
}
