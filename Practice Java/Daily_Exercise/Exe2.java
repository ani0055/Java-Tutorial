public class Exe2 {
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount();
        BankAccount B2 = new BankAccount(1215,30000,"Kumar");

        System.out.println(B2.toString());;
    }
}

class BankAccount{
    public int AccNumber;
    private int Balance;
    public String holderName;

    public BankAccount(){
        System.out.println("No Argument Constructor");
    }

    public BankAccount(int AccNumber, int Balance, String holderName){
        this.AccNumber = AccNumber;
        setBalance(Balance);
        this.holderName = holderName;
        System.out.println("Parameterized Constructor");;
    }


    public int getBalance() {
        return Balance;
    }
    public void setBalance(int balance) {
        Balance = balance;
    }
    @Override
    public String toString() {
        return "BankAccount [AccNumber=" + AccNumber + ", Balance=" + Balance + ", holderName=" + holderName + "]";
    }

}

   