package Banking_System;

// Design classes: BankAccount, SavingsAccount, CurrentAccount
// Features: deposit(), withdraw(), calculateInterest(), displayBalance()
// Add: Transaction class to track all transactions
// Inheritance: BankAccount → SavingsAccount (interest rate), CurrentAccount (overdraft limit)
// Encapsulation: Private fields with getters/setters

public class Bank {
    
}

abstract class BankAccount{
    String Account_no;
    String Account_Holder;
    double Balance;
    enum Transaction{Deposite, Withdarw, CheckBalance};

    public void Deposite(int Amount){
        Balance = Balance + Amount;
        System.out.println("Succesfully deposited the amount of " + Amount);
    }

    public Boolean Withdarw(int Amount){
        if(Amount<=Balance){
            Balance = Balance-Amount;
            System.out.println("Succesfully Withdrawn the amount of " + Amount);
            System.out.println("Remaning Balance is " + Balance);
            return true;
        }
        System.out.println("Insuffiencient Balance");
        return false;
    }

    public void CheckBalance(){
        System.out.println("Available Balance of : "+ Balance);
    }


}

class SavingsAccount extends BankAccount{
    double Interest;
    SavingsAccount(String Account_no,String Account_Holder,double Balance, double Interest){
        this.Account_Holder = Account_Holder;
        this.Account_no = Account_no;
        this.Balance = Balance;
        this.Interest = Interest;
    }

    public double calculateInterest(int time){
        return (Balance*time*Interest)/365;
    }
}

class CurrentAccount extends BankAccount{
    double OverDue;
    CurrentAccount(String Account_no,String Account_Holder,double Balance, double OverDue){
        this.Account_Holder = Account_Holder;
        this.Account_no = Account_no;
        this.Balance = Balance;
        this.OverDue = OverDue;
    }

}