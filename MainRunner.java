package day5.assignment1;

import day5.assignment1.model.Account;
import day5.assignment1.repository.AccountRepository;
import day5.assignment1.service.AccountService;
import day5.assignment1.service.AccountServiceImpl;

import java.util.*;

public class MainRunner {
    public static ArrayList<Account> accountsDB = new ArrayList<>();
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

    public static void main(String[] args) {

        AccountRepository.initializeDB();
        AccountService accountService = new AccountServiceImpl();

//      System.out.println(AccountRepository.accountDB);
//      accountService.updateEmail(0, "testEmail@gmail.com");
//      System.out.println(AccountRepository.accountDB); //works

//      System.out.println(accountService.filterAccount("Delhi", "Medical Policy-1").size()); //works

//      System.out.println(accountService.extractEmailsWithoutPolicy()); //works

//        System.out.println(AccountRepository.accountDB);
//        accountService.updatePremiumAmount(1.1, "Medical Policy-1"); //works
//        System.out.println(AccountRepository.accountDB);

//        System.out.println(accountService.displayMaxAssuredAmount()); //works
    }
}