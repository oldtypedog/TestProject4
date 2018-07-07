package classesandobjects;

public class AccountHolder {
   String firstName;
   String lastName;
   Integer age;
   Integer accountBalance;
   boolean eligibleForCreditCard;
   public void testEligibityForCreditCard(){
       if(age>25 && accountBalance >= 20000){
       eligibleForCreditCard=true;

        }
   }

}
