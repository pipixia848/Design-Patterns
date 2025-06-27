package d17_中介者模式;


import java.util.ArrayList;
import java.util.List;

// 1. 中介者接口
interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

// 2. 具体中介者 - 聊天室
class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        // 向除发送者外的所有用户发送消息
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}

// 3. 同事类抽象
abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addUser(this); // 注册到中介者
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

// 4. 具体同事类 - 普通用户
class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " 发送消息: " + message);
        mediator.sendMessage(message, this); // 通过中介者发送
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " 收到消息: " + message);
    }
}

// 5. 客户端使用
public class MediatorPatternDemo {
    public static void main(String[] args) {
        // 创建中介者（聊天室）
        ChatMediator chatRoom = new ChatRoom();

        // 创建用户
        User alice = new ChatUser(chatRoom, "Alice");
        User bob = new ChatUser(chatRoom, "Bob");
        User charlie = new ChatUser(chatRoom, "Charlie");

        System.out.println("--- 聊天开始 ---");
        alice.send("大家好，我是Alice！");
        bob.send("Hello，我是Bob！");
        charlie.send("大家好，我是Charlie！");

        System.out.println("\n--- 私聊测试 ---");
        // 创建私聊中介者
        ChatMediator privateChat = new ChatRoom();
        User dave = new ChatUser(privateChat, "Dave");
        User eve = new ChatUser(privateChat, "Eve");

        dave.send("Eve，这是我们的私密对话");
        eve.send("明白，Dave，其他人看不到这条消息");
    }
}


