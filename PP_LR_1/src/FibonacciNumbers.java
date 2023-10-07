public class FibonacciNumbers {
    /**
     * Метод для обчислення числа Фібоначчі за заданим номером
     *
     * @param n Номер числа Фібоначчі
     * @return Значення числа Фібоначчі
     */
    public static int calculateFibonacci(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            int a = 1;
            int b = 1;
            int result = 0;
            for (int i = 2; i < n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }

    /**
     * Метод для перевірки, чи число можна виразити у формі w^3 + 1
     *
     * @param number Число для перевірки
     * @return true, якщо число можна виразити у формі w^3 + 1, false - якщо ні
     */
    public static boolean checkFormula(int number) {
        double cubeRoot = Math.cbrt(number - 1);
        int intCubeRoot = (int) cubeRoot;
        return cubeRoot == intCubeRoot;
    }

}
