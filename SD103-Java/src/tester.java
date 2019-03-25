public class tester {
    public static void main(String[] args) {
        BankAccount checking = new BankAccount(" Checking ",  90.00 );
        System.out.println("checking = " + checking);

        BankAccount savings = new BankAccount(" Savings ",100.00);
        System.out.println("savings = " + savings);

        BankAccount fakeAccount = new BankAccount(" Checking ",100000000.00);
        System.out.println("fakeAccount2 = " + fakeAccount);

        checking.setOverdraftAccount(savings);

        checking.deposit(5);
        System.out.println("checking = " + checking);

        savings.deposit(0.00);
        System.out.println("savings = " + savings);

        checking.withdraw(120.00);
        System.out.println("checking = " + checking);
        System.out.println("savings = " + savings);

        savings.withdraw(20);
        System.out.println("savings = " + savings);

        System.out.println("my checking balance is: " + checking.getBalance());

        if (checking.getBalance() > savings.getBalance()){
            System.out.println("checking balance is greater by " + (checking.getBalance()- savings.getBalance()));
        }else{
            System.out.println("saving balance is greater by "+ (savings.getBalance() - checking.getBalance()));
        }
        System.out.println(savings.getAccountId());
    }
}
