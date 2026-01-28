public class Main {
    public static void main(String[] args) {
        OperationStrategy add = new Add();
        OperationStrategy subtract = new Subtract();
        OperationStrategy multiply = new Multiply();
        OperationStrategy divide = new Divide();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add.execute(a, b));
        System.out.println("Subtraction: " + subtract.execute(a, b));
        System.out.println("Multiplication: " + multiply.execute(a, b));
        System.out.println("Division: " + divide.execute(a, b));
    }
}