public class main {
    public static void main(String[] args) {
        Account account = new Account(20000,1122);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance ="+account.getBalance());
        System.out.println("the monthly interest ="+account.getMonthlyInterest());
        System.out.println("date created account :"+account.getDateCreated());
    }
}
