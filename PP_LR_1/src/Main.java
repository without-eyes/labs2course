import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввід номера числа Фібоначчі з клавіатури
        System.out.print("Введіть номер числа Фібоначчі: ");
        int n = scanner.nextInt();

        // Вивід на екран
        System.out.print("Числа, які можна виразити як \"w^3 + 1\": ");
        for (int i = 1; i < n; i++) {
            int fibonacci = FibonacciNumbers.calculateFibonacci(i);
            if (FibonacciNumbers.checkFormula(fibonacci) && fibonacci != 0)
                System.out.print(fibonacci + " ");
        }

        scanner.close();
    }
}