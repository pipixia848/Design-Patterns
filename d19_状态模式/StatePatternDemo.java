package d19_状态模式;

// 1. 抽象状态接口
interface State {
    void handleSwitch(Context context);
}

// 2. 具体状态：开状态
class OnState implements State {
    @Override
    public void handleSwitch(Context context) {
        System.out.println("⚡️ 关灯操作");
        context.setState(new OffState()); // 状态转换
    }
}

// 3. 具体状态：关状态
class OffState implements State {
    @Override
    public void handleSwitch(Context context) {
        System.out.println("💡 开灯操作");
        context.setState(new OnState()); // 状态转换
    }
}

// 4. 上下文类（电灯）
class Context {
    private State currentState;

    public Context() {
        this.currentState = new OffState(); // 初始状态：关
    }

    // 设置新状态
    public void setState(State state) {
        this.currentState = state;
    }

    // 委托给当前状态处理
    public void pressSwitch() {
        currentState.handleSwitch(this);
    }
}

// 5. 客户端使用
public class StatePatternDemo {
    public static void main(String[] args) {
        Context light = new Context(); // 初始状态：Off
        
        light.pressSwitch(); // Off → On (输出：💡 开灯操作)
        light.pressSwitch(); // On → Off (输出：⚡️ 关灯操作)
        light.pressSwitch(); // Off → On (输出：💡 开灯操作)
    }
}