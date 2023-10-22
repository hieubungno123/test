package JavaEncapsulation.Test2;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 =new BankAccount("SB-09876", 20000);
        BankAccount ba2 = new BankAccount("BD-263", 50000);

        System.out.println("Account Number: " + ba1.getAccountNumber());
        System.out.println("Balance: " + ba1.getBalance());
        System.out.println();

        System.out.println("Account Number: " + ba2.getAccountNumber());
        System.out.println("Balance: " + ba2.getBalance());
        System.out.println();


        BankAccount ba3 = new BankAccount(null, 0);
        ba3.setAccountNumber("BH-362");
        ba3.setBalance(80000);
        System.out.println("Account Number: " + ba2.getAccountNumber());
        System.out.println("Balance: " + ba2.getBalance());

        
    }
}
