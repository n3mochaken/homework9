// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    /**
     * Бухгалтеры попросили посчитать сумму всех выплат за месяц.
     * <p>
     * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
     */
    public static void task1() {
        int[] taskArr = generateRandomArray();
        int sum = 0;
        for (int i : taskArr) {
            sum += i;
        }
        System.out.printf("Сумма затрат за месяц составила %d", sum);
    }

    /**
     * Также бухгалтерия попросила найти минимальную и максимальную трату за день.
     * <p>
     * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
     */
    public static void task2() {
        int max = -1, min;
        int[] taskArr = generateRandomArray();
        /**
         * for (int i : taskArr) { //
         *   System.out.println(i);
         *}
         */
        for (int i : taskArr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Максимальная сумма затрат составила %d рублей\n", max);
        min = max;
        for (int i : taskArr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Минимальная сумма составила %d рублей\n", min);
    }

    /**
     * Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
     * <p>
     * Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
     * <p>
     * Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
     */
    public static void task3() {
        int[] taskArr = generateRandomArray();
        float sum = 0;
        for (int i : taskArr) {
            sum += i;
        }
        sum /= taskArr.length;
        System.out.printf("Средняя сумма трат за месяц составляет %.2f", sum);
    }

    /**
     *В бухгалтерской книге появился баг. Что-то пошло не так: фамилии и имена сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов
     * char[ ]
     * .
     *
     * Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
     *
     * char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
     * В результате в консоль должно быть выведено: Ivanov Ivan.
     *
     * Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
     */
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i != -1; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}

