package patterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("15-13+6*1");
        System.out.println(expression.interpret());
    }
}
