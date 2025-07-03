package d17_备忘录模式.game;

public class Client {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setDef(100);
        gameRole.setVit(100);

        gameRole.display();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("=======================");

        gameRole.setDef(50);
        gameRole.setVit(50);
        gameRole.display();

        System.out.println("=======================");

        gameRole.restoreMemento(caretaker.getMemento());
        gameRole.display();
    }
}
