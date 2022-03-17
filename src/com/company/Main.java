package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main extends Menu{

    public static void main(String[] args) throws IllegalAccessException {

//      Перше завдання
        Integer[] array = {22, 10, 20, 675, 99, 1002, 4323, 754};

        /*Відсортування в порядку спадання*/
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Відсортування в порядку спадання : " + Arrays.toString(array));

        /*Відсортування в порядку зростання*/
        Arrays.sort(array);
        System.out.println("Відсортування в порядку зростання : " + Arrays.toString(array));

        System.out.println();
//     Друге завдання
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            switch (scanner.next()) {
                case "1": {
                    Car[][] car = new Car[getRandomValue(1, 6)][getRandomValue(1, 6)];
                    carDeepToString(car);
                    System.out.println(Arrays.deepToString(car));
                }
                case "2": {
                    Car[][] car = new Car[getRandomValue(1,6)][getRandomValue(1,6)];
                    carDeepToString(car);
                    System.out.println();

                    Car carObject = new Car(getRandomValue(10, 100), getRandomValue(10, 100));

                    for (Car[] a : car){
                        Arrays.fill(a,carObject);
                    }
                    System.out.println(Arrays.deepToString(car));
                }
            }
        }
    }

    public static void carDeepToString(Car[][] car) throws IllegalAccessException {
        for (int i = 0; i < car.length; i++) {
            for (int j = 0; j < car[i].length; j++) {
                car[i][j] = new Car(getRandomValue(10, 100), getRandomValue(10, 100));
            }
        }
    }

    public static int getRandomValue(int min, int max) throws IllegalAccessException {
        if (min >= max) {
            throw new IllegalAccessException("Не правильне твердження");
        }

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
