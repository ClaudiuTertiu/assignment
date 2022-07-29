package day5.assignment1.repository;

import day5.assignment1.model.Account;
import day5.assignment1.model.ContactDetails;
import day5.assignment1.model.Policy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AccountRepository {
    public static ArrayList<Account> accountDB = new ArrayList<>();

    public static void initializeDB() {
        Policy p1 = new Policy(new Random().nextInt(6000),"Medical Policy-1",2000,1500000, LocalDate.now());
        Policy p2 = new Policy(new Random().nextInt(6000),"Car Policy-1",2000,1500000, LocalDate.now());
        Policy p3 = new Policy(new Random().nextInt(6000),"Medical Policy-2",2500,1800000, LocalDate.now());
        Policy p4 = new Policy(new Random().nextInt(6000),"Term Policy-1",2000,15000000, LocalDate.now());

        ContactDetails c1 = new ContactDetails("123-New Delhi","Delhi",1212122,"abc@gmail.com");
        ContactDetails c2 = new ContactDetails("454-New Delhi","Delhi",45412122,"xyz@gmail.com");
        ContactDetails c3 = new ContactDetails("A1-Gurgoan","Delhi-NCR",45412122,"a@gmail.com");
        ContactDetails c4 = new ContactDetails("A2-Gurgoan","Delhi-NCR",45412122,"b@gmail.com");
        ContactDetails c5 = new ContactDetails("A2-Gurgoan","Delhi-NCR",45412123,"john@gmail.com");


        addAccount("Ramesh",Arrays.asList(p1, p2, p3), 5000, c1);
        addAccount("Mike", Arrays.asList(p1,p4), 15000, c2);
        addAccount("Kirti", Arrays.asList(p1), 25000, c3);
        addAccount("Ajay", Arrays.asList(p1,p4), 17000, c4);
        addAccount("John", null, 17000, c5);
    }

    public static void addAccount(String name, List<Policy> policyList, int balance, ContactDetails contactDetails) {
        Account a = new Account();
        a.setAccountHolderName(name);
        a.setBalance(balance);
        a.setPolicies(policyList);
        a.setContactDetails(contactDetails);
        accountDB.add(a);
    }
}
