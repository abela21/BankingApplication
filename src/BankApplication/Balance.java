package BankApplication;

public class Balance {
    double balance = 1000;
    final int ACCOUNTNUMBER = 100006060;


    void currentBalance(){
        if (balance == 0){
            System.out.println("Your Account is Empty");
            System.out.println("You Have A Deposit Option If You Wish To Deposit An Amount ");
        }else{
            System.out.println("Your Balance Number Is " + balance);
        }
    }
}