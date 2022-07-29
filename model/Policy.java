package day5.assignment1.model;

import java.time.LocalDate;

public class Policy {

    private int policyNumber;
    private String policyName;
    private int premiumAmount;
    private int sumAssuredAmount;
    private LocalDate premiumDate;

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(int premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public int getSumAssuredAmount() {
        return sumAssuredAmount;
    }

    public void setSumAssuredAmount(int sumAssuredAmount) {
        this.sumAssuredAmount = sumAssuredAmount;
    }

    public LocalDate getPremiumDate() {
        return premiumDate;
    }

    public void setPremiumDate(LocalDate premiumDate) {
        this.premiumDate = premiumDate;
    }

    public Policy(int policyNumber, String policyName, int premiumAmount, int sumAssuredAmount, LocalDate premiumDate) {
        this.policyNumber = policyNumber;
        this.policyName = policyName;
        this.premiumAmount = premiumAmount;
        this.sumAssuredAmount = sumAssuredAmount;
        this.premiumDate = premiumDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber=" + policyNumber +
                ", policyName='" + policyName + '\'' +
                ", premiumAmount=" + premiumAmount +
                ", sumAssuredAmount=" + sumAssuredAmount +
                ", premiumDate=" + premiumDate +
                '}';
    }
}