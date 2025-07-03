package d17_备忘录模式.game;

import java.util.ArrayList;
import java.util.HashMap;

public class Caretaker {

    private Memento memento;

    //保存多个状态
//    private ArrayList<Memento> mementoList;
//    private HashMap<String, ArrayList<Memento>> mementoHashMap;
//


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
