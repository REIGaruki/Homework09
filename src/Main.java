public class Main {
    public static void main(String[] args) {
        int minimalSpend = 100_000; //входные данные, минимально-возможная трата за один день
        int maximalSpend = 200_000; //входные данные, максимально-возможная трата за один день
        int currentYear = 2024;//входные данные, текущий год
        int currentMonth = 2;//входные данные, текущий месяц
        task1(daysInMonth(currentYear, currentMonth), minimalSpend, maximalSpend);
        task2(daysInMonth(currentYear, currentMonth), minimalSpend, maximalSpend);
        task3(daysInMonth(currentYear, currentMonth), minimalSpend, maximalSpend);
        task4();
    }
    public static int[] generateRandomArray(int length, int min, int max) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = max - random.nextInt(min);
        }
        return arr;
    }
    public static void task1(int days, int minimalSpend, int maximalSpend) {
        int[] spends = generateRandomArray(days, minimalSpend, maximalSpend);
        int totalSpends = 0;
        for (int i : spends) {
            totalSpends += i;
        }
        System.out.println("Сумма трат за месяц составила " + totalSpends + " рублей");
    }
    public static void task2(int days, int minimalSpend, int maximalSpend) {
        int[] spends = generateRandomArray(days, minimalSpend, maximalSpend);
        int b = maximalSpend;//меняем местами верхнюю и нижнюю границы с помощью буферной переменной
        maximalSpend = minimalSpend;
        minimalSpend = b;
        for (int i : spends) {
            if (i > maximalSpend)
                maximalSpend = i;
            if (i < minimalSpend)
                minimalSpend = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + minimalSpend + " рублей\n" +
                "Максимальная сумма трат за день составила " + maximalSpend + " рублей");
    }
    public static void task3(int days, int minimalSpend, int maximalSpend) {
        int[] spends = generateRandomArray(days, minimalSpend, maximalSpend);
        int totalSpends = 0;
        for (int i : spends) {
            totalSpends += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (float) totalSpends / spends.length + " рублей");
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int daysInMonth(int year, int month) {
        int dayCount;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayCount = 31;
                break;
            case 2:
                if (year >= 1584 && year % 4 == 0 && year % 100 != 0  || year % 400 == 0) {
                    dayCount = 29;
                } else {
                    dayCount = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayCount = 30;
                break;
            default:
                dayCount = 0;
        }
        return dayCount;
    }
}
