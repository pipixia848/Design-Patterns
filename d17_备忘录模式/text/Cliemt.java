package d17_备忘录模式.text;

public class Cliemt {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState(" 状态1");
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 状态2");
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 状态3");
        caretaker.add(originator.saveStateMemento());

        System.out.println(originator.getState());

        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println(originator.getState());


    }
}
