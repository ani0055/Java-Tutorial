public class Ex12 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAccNumber(101);
        b1.setHolderName("Krishna Jadhav");
        b1.deposit(12000);
        b1.withdraw(20000);
        b1.deposit(16000);
        b1.withdraw(20000);

    }
}
class BankAccount{
    private int accNumber;
    private String holderName;
    private double balance;

    public int getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Balance : " + balance);
        }  
        else System.out.println("Amount should be greater than 0");
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Balance : " + balance);
        } 
        else System.out.println("Insufficent balance");
    }

    
}