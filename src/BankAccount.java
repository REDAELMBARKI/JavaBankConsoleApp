import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {


    public static int current_account_id  = 0;


    public int account_id ;
    public Client client ;
    public double balance ;

    public long accountNumber ;

    private List<Long> takenAccounts = new ArrayList<>();



    public BankAccount(Client client, double balance)
    {
        if (client == null) return;

        BankAccount.current_account_id++;
        this.account_id = BankAccount.current_account_id;


        this.client = client;

        this.balance = balance;

        this.accountNumber = this.getRandomAccount();

        client.addAccount(this);

    }

    public void deposite(double amount)
    {
        if (amount <= 0) return;


        this.balance += amount;
    }


    public void withdraw(double amount ) throws Exception
    {
        if (amount <= 0) return;

        if(this.balance < amount ) throw new Exception("the account balance is too small");

        this.balance -= amount;

    }


    public void transfer(Client client , double amount) throws Exception
    {
        if (amount <= 0) return;
        if (amount > this.balance) throw new Exception("your balance is too small");

        client.getAccount().deposite(amount);

        this.balance -= amount;
    }




    public void warn(String message)
    {
        System.out.println(message);
    }
    public long getRandomAccount(){



        StringBuilder numberAcc = new StringBuilder();

        for(int i = 0; i < 4; i++) {
            numberAcc.append(String.valueOf(ThreadLocalRandom.current().nextInt(1000, 9999)));
        }


        return   Long.parseLong(numberAcc.toString());

    }

}
