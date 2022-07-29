package day5.assignment1.model;

import java.util.List;

public class Account {

    private int accountNumber;
    private String accountHolderName;
    private int balance;
    private List<Policy> policies;
    private ContactDetails contactDetails;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public List<Policy> getPolicies() {
        return policies;
    }
    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }
    public ContactDetails getContactDetails() {
        return contactDetails;
    }
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", policies=" + policies +
                ", contactDetails=" + contactDetails +
                '}';
    }
}