package d17_备忘录模式.game;

public class GameRole {

    private int vit;
    private int def;

    // 创建Memento 即根据当前的状态得到Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    // 从备忘录中恢复
    public void restoreMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    //显示
    public void display() {
        System.out.println("Vit: " + this.vit);
        System.out.println("Def: " + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
