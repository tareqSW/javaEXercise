import java.util.Date;

public class Account {
    private int id =0 ;
    private double balance =0;
    private static double annualInterestRate =0;
    private Date dateCreated;

    public Account() {
         dateCreated = new Date();
    }

    public Account(double balance, int id) {
        this.balance = balance;
        this.id = id;
        dateCreated = new Date();
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }
    public double  getMonthlyInterest(){
        return (balance*getMonthlyInterestRate());
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void  deposit(double amount){
        balance+=amount;
    }

}
