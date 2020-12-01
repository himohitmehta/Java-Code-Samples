package SequentialFiles;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

//Maintains a List<Account>
public class Accounts {
    @XmlElement(name = "account")
    private List<Account> accounts = new ArrayList<>();//stores accounts

    //returns the List<Account>
    public List<Account> getAccounts() {
        return accounts;
    }
}
