public class App {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        for (MathOperations op : MathOperations.values()) {
            System.out.print(op.name() + ": " + x + " " + op + " " + y + " = ");
            System.out.println(op.executarOperacao(10, 5));
        }
    }
}