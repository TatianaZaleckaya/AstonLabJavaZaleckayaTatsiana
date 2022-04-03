package task2;

import java.util.Scanner;

public class Task2 {

    private static final String NAME = "Вячеслав";

    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Введите имя: ");
            checkName(scn.nextLine());
        }
    }

    private static void checkName(String inputName) {
        // Если важно учитывать регист вводимых данных, то метод equalsIgnoreCase необходимо заменить на метод equals
        if (NAME.equalsIgnoreCase(inputName)) {
            System.out.println("Привет, " + NAME);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}



