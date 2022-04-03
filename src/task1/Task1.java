package task1;


import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        checkNumber();
    }

    private static void checkNumber() {
        try (Scanner cs = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            if (cs.nextInt() > 7) {
                System.out.println("Привет");
            }
        } catch (NoSuchElementException e) {
            System.err.println("Введенные данные не число");
        }
    }
}




