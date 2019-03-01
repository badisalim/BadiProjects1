package ButterflyBusiness;

import challenge.katabank.Account;
import challenge.katabank.AccountReader;

import java.util.List;

public class AccountApp {


    public static void main(String[] args) {
        AccountReader reader = new AccountReader();
        List<Account> accounts = reader.read("ButterflyBusiness/buterfly-business.txt");
        accounts.forEach(System.out::println);



    }

}
