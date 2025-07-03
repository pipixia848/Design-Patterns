package d18_解释器模式;

import java.util.Map;

// 1. 抽象表达式
interface Expression {
    boolean interpret(Map<String, Boolean> context);
}

// 2. 终结符表达式
class VariableExpression implements Expression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return context.getOrDefault(name, false);
    }
}

// 3. 非终结符表达式（AND）
class AndExpression implements Expression {
    private Expression left;
    private Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return left.interpret(context) && right.interpret(context);
    }
}

// 4. 非终结符表达式（OR）
class OrExpression implements Expression {
    private Expression left;
    private Expression right;

    public OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return left.interpret(context) || right.interpret(context);
    }
}

// 5. 非终结符表达式（NOT）
class NotExpression implements Expression {
    private Expression expression;

    public NotExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return !expression.interpret(context);
    }
}

// 6. 客户端使用
public class InterpreterDemo {
    public static void main(String[] args) {
        // 创建上下文（变量值）
        Map<String, Boolean> context = Map.of(
            "A", true,
            "B", false,
            "C", true
        );

        // 构建表达式： (A AND B) OR (NOT C)
        Expression expr = new OrExpression(
            new AndExpression(new VariableExpression("A"), 
                              new VariableExpression("B")),
            new NotExpression(new VariableExpression("C"))
        );

        // 解释执行
        boolean result = expr.interpret(context);
        System.out.println("Result: " + result);  // 输出: false
    }
}