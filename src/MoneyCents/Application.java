package MoneyCents;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println(GreedyAlgorithm.change(149));

        Scanner scanner = new Scanner((System.in));
        System.out.println(" input number");
        Integer moneyInput = scanner.nextInt();
        //GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();

        System.out.println(GreedyAlgorithm.change(moneyInput));

    }
}
