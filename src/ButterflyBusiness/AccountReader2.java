package ButterflyBusiness;

import challenge.katabank.*;

import java.util.ArrayList;
import java.util.List;

public class AccountReader2 {

    private FileReader fileReader2=new FileReader();
    private AccountBuilder accountBuilder = new AccountBuilder();

    public List<Account> read(String filePath) {
        List<String> rows = readLines(filePath);
        return toAccounts(rows);
    }

    private List<String> readLines(String filePath) {
        return fileReader2.asLines(filePath);
    }

    private List<Account> toAccounts(List<String> rows) {
        List<Account> accounts = new ArrayList<>();
        LineIterator iterator = new LineIterator(rows);
        while (iterator.hasNext()) {
            addOneAccount(accounts, iterator);
        }
        return accounts;
    }

    private void addOneAccount(List<Account> accounts, LineIterator iterator) {
        Line line = iterator.next();
        Account account = accountBuilder.from(line);
        accounts.add(account);
    }
}
