package day5.assignment1.service;

import day5.assignment1.model.Account;
import day5.assignment1.model.Policy;
import day5.assignment1.repository.AccountRepository;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class AccountServiceImpl implements AccountService {
    /*
     *   Requirement (to be done by stream API only )
     *   1. Update email on the basis of accountNumber
     *   2. display Account based on maximum sumAssuredAmount
     *   3. update premium amount of all medical policies by 10%
     *   4. filter accounts based on following
     *      4.a) state and policyname
     *      4.b) state and premiumAmount (higher than certain amount) and total balance
     *   5. count accounts where premium date is over
              Note :- use setter method to Set premium date
                 LocalDate.of()  // is used to create date
                 LocalDate.now() // is used to get current date
     *   6. Store account's email in a Set<String> where policy is null
     *
     *   Note:- Add couple of more records based on requirement
     * */

    @Override
    public void updateEmail(int accountNumber, String newEmail) {
        AccountRepository.accountDB = (ArrayList<Account>) AccountRepository.accountDB
                .stream()
                .map(a -> {
                    if(a.getAccountNumber() == accountNumber) a.getContactDetails().setEmail(newEmail);
                    return a;
                })
                .collect(Collectors.toList());
    }

    @Override
    public int displayMaxAssuredAmount() {
        List<Integer> listOfMaxes = new ArrayList<>();
        for (Account a: AccountRepository.accountDB) {
            if(a.getPolicies() != null) {
                listOfMaxes.add(a.getPolicies()
                        .stream()
                        .map(p -> p.getSumAssuredAmount())
                        .max(Comparator.comparing(Integer::valueOf))
                        .get());
            }
        }

        return listOfMaxes
                .stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
    }

    @Override
    public void updatePremiumAmount(double percentage, String policyName) {
        AccountRepository.accountDB = (ArrayList<Account>) AccountRepository.accountDB
                .stream()
                .filter(a -> a.getPolicies() != null)
                .map(a -> {
                    a.getPolicies()
                            .stream()
                            .filter(p-> p.getPolicyName().equals(policyName))
                            .forEach(p-> {
                                p.setPremiumAmount((int) (p.getPremiumAmount() * percentage));
                            });
                    return a;
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<Account> filterAccount(String state, String policyName) {
        return AccountRepository.accountDB
                .stream()
                .filter(a -> a.getContactDetails().getState().equals(state)
                        && a.getPolicies()
                                .stream()
                                .anyMatch(p-> p.getPolicyName().equals(policyName)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Account> filterAccount(String state, int premiumAmount, int balance) {
        return AccountRepository.accountDB
                .stream()
                .filter(a -> a.getBalance() == balance
                        && a.getContactDetails().getState().equals(state)
                        && a.getPolicies()
                                .stream()
                                .allMatch(p-> p.getPremiumAmount() > premiumAmount))
                .collect(Collectors.toList());
    }

    @Override
    public int noOfExpiredPremiumAccounts(Account account) {
        return (int) account.getPolicies()
                .stream()
                .filter(p-> p.getPremiumDate().compareTo(LocalDate.now()) < 0)
                .count();
    }

    @Override
    public Set<String> extractEmailsWithoutPolicy() {
        return AccountRepository.accountDB
                .stream()
                .filter(a -> a.getPolicies() == null)
                .map(a-> a.getContactDetails().getEmail())
                .collect(Collectors.toSet());
    }
}
