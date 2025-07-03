package d17_备忘录模式.text;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
