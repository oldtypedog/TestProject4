package classesandobjects;

public class AccountHolderObjects {
    public static void main(String[]args){

   AccountHolder tom = new AccountHolder();
   AccountHolder henry = new AccountHolder();
   AccountHolder sarah = new AccountHolder();
      tom.firstName="Tom";
      tom.lastName="Smith";
      tom.age=25;
      tom.accountBalance=10000;
      tom.testEligibityForCreditCard();
      System.out.println("Is Tom eligible for CC : "+tom.eligibleForCreditCard);

       henry.firstName="Henry";
       henry.lastName="Jones";
       henry.age=30;
       henry.accountBalance=200000;
       henry.testEligibityForCreditCard();
       System.out.println("Is Henry eligible for CC : "+henry.eligibleForCreditCard);

       sarah.firstName="Sarah";
       sarah.lastName="Lakadaly";
       sarah.age=35;
       sarah.accountBalance=100000;
       sarah.testEligibityForCreditCard();
       System.out.println("Is Sarah eligible for CC : "+sarah.eligibleForCreditCard);}

}
