public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        int sumResult = calc.sum(5,4);
        System.out.println("Результат сложения: " + sumResult);

        int multResult = calc.mult(3,6);
        System.out.println("Результат умножения: " + multResult);

        int powResult = calc.pow(2,8);
        System.out.println("Результат возведения в степень: " + powResult);
    }
}