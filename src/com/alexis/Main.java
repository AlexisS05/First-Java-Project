package com.alexis;

import java.util.Scanner;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static final Map<Integer, Float> bestRates = Map.of(
            1, 5.50f,
            2, 3.45f,
            3, 2.67f
    );

    public static float getRates(int loanTermInYears){
        if (bestRates.containsKey(loanTermInYears)) {
            return bestRates.get(loanTermInYears);
        } else {
            return 0.0f;
        }
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       /* System.out.println("Hello World");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 10; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i );
        }

        Product product = new Product("Alexis");
        System.out.println(product.getName());
    */




            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);
            System.out.println("Enter the loan term(in years): ");
            int loanTermInYears = scanner.nextInt();

            float bestRate = getRates(loanTermInYears);

            if (bestRate == 0.0f){
                System.out.println("No available rates for term: " + loanTermInYears + " years");
            } else {
                System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%");
            }
            scanner.close();


        System.out.println( "Hello World! My name is Alexis Sanchez" );

    }

    public static int doubleTheNumber(int number) {
        return -1 * 2;
    }

    private static int add(int[] numbers) {
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        return sum;
    }
}