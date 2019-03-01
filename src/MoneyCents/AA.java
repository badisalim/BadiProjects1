//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package MoneyCents;

import java.util.Scanner;

public class AA {
    public AA() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input number");
        Integer answerNo = scanner.nextInt();
        System.out.println(answerNo);
        Integer coin50 = new Integer(answerNo / 50);
        Integer nmoney = coin50 * 50;
        Integer money2 = answerNo - nmoney;
        Integer coin20 = new Integer(money2 / 20);
        Integer nmoney2 = coin20 * 20;
        Integer money3 = money2 - nmoney2;
        Integer coin10 = new Integer(money3 / 10);
        Integer nmoney3 = coin10 * 10;
        Integer money4 = money3 - nmoney3;
        Integer coin5 = new Integer(money4 / 5);
        Integer nmoney4 = coin5 * 5;
        Integer money5 = money4 - nmoney4;
        Integer coin2 = new Integer(money5 / 2);
        Integer nmoney5 = coin2 * 2;
        Integer money6 = money5 - nmoney5;
        Integer coin1 = new Integer(money6 / 1);
        //Integer nmoney6 = coin1 * 1;
        //money6 - nmoney6;
        System.out.println("No.of coins 50 is: " + coin50);
        System.out.println("No.of coins 20 is: " + coin20);
        System.out.println("No.of coins 10 is: " + coin10);
        System.out.println("No.of coins 5 is: " + coin5);
        System.out.println("No.of coins 2 is: " + coin2);
        System.out.println("No.of coins 1 is: " + coin1);
    }
}
