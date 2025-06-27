package d11_代理模式.动态代理;

public class TeachDao implements ITeachDao {

    @Override
    public void teach() {
        System.out.println("老师授课中 (");
    }
}
