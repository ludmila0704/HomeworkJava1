package lesson1;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Решение 1-й задачи:");

        boolean getSum = task1(13, 6);
        System.out.println(getSum);
        System.out.println("Решение 2-й задачи:");
        task2(-12);
        System.out.println("Решение 3-й задачи:");

        boolean v=task3(-10);
        System.out.println(v);
        System.out.println("Решение 4-й задачи:");
        task4("Все будет хорошо!",7);
        System.out.println("Решение 5-й задачи:");
        boolean year=task5(2100);
        System.out.println(year);
        System.out.println("Решение 6-й задачи:");
        task6();
        System.out.println("Решение 7-й задачи:");
        task7();
        System.out.println("Решение 8-й задачи:");
        task8();
        System.out.println("Решение 9-й задачи:");
        task9();
        System.out.println("Решение 10-й задачи:");

        int[] arrayValue = task10(10,8);
        System.out.println(Arrays.toString(arrayValue));
        System.out.println("Решение 11-й задачи:");
        task11();
    }


    private static boolean task1(int num1, int num2) {
    /*Написать метод, принимающий на вход два целых числа и проверяющий,
     что их сумма лежит в пределах от 10 до 20 (включительно), если да –
      вернуть true, в противном случае – false.*/
        return (num1 + num2 >= 10 && num1 + num2 <= 20);
    }

    private static void task2(int number) {
    /*Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.*/
        if (number >= 0) System.out.println("Число " + number + " положительное");
        else System.out.println("Число " + number + " отрицательное");

    }

    private static boolean task3(int number) {
    /*Написать метод, которому в качестве параметра передается целое число. Метод должен
    вернуть true, если число отрицательное, и вернуть false если положительное.*/
        return (number <= 0);
    }

    private static void task4(String s, int number) {
    /*Написать метод, которому в качестве аргументов передается строка и число,
     метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
        if (number > 0) {
            while (number > 0) {
                System.out.println(s);
                number--;
            }
        } else System.out.println("Введенное число или 0 или отрицательное! Попробуйте заново!");
    }

    private static boolean task5(int year) {
    /*Написать метод, который определяет, является ли год високосным, и возвращает
     (високосный - true, не високосный - false). Каждый 4-й год является високосным,
      кроме каждого 100-го, при этом каждый 400-й – високосный. */
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static void task6() {
        /* Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
         [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
        }
        System.out.println(Arrays.toString(array));

    }

    private static void task7() {
        /* Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
         значениями 1 2 3 4 5 6 7 8 … 100;
         */
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task8() {
    /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
    */
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task9() {
        /*Создать квадратный двумерный целочисленный массив (количество строк
                и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
        диагональные элементы единицами (можно только одну из диагоналей, если
                обе сложно). Определить элементы одной из диагоналей можно по
        следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
        int[][] array = new int[7][7];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) array[i][j] = 1;
                if (j == array.length - 1 - i) array[i][j] = 1;
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }

    }

    private static int[] task10(int len, int initialValue) {
        /* Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue; */
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    private static void task11() {
        /*  Задать одномерный массив и найти в нем минимальный и максимальный элементы ; */
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(array));
        int arrayMin = array[0];
        int arrayMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > arrayMax) arrayMax = array[i];
            else if (array[i] < arrayMin) arrayMin = array[i];
        }
        System.out.println("Минимальное значение массива:  " + arrayMin);
        System.out.println("Максимальное значение массива:  " + arrayMax);


    }
}


