public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int totalSpends = 0;
        for (int i : arr) {
            totalSpends += i;
        }
        System.out.println("Сумма трат за месяц составила " + totalSpends + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int minimalSpend = 200_000;
        int maximalSpend = 100_000;
        for (int i : arr) {
            if (i > maximalSpend) {
                maximalSpend = i;
            }
            if (i < minimalSpend) {
                minimalSpend = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimalSpend + " рублей\n" +
                "Максимальная сумма трат за день составила " + maximalSpend + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        int totalSpends = 0;
        for (int i : arr) {
            totalSpends += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (float) totalSpends / arr.length + " рублей");
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
