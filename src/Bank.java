import java.util.ArrayList;
import java.util.List ;

public class Bank {

    public static List<Client> clients  = new ArrayList<>();
    public static List<BankAccount> accounts = new ArrayList<>();


    public void addNewClient()
    {

    }


    // adds the user to database
    public void asignBankAccount()
    {

    }

    // returns the bankaccount insrance
    public BankAccount openAccount(Client client, double balance) throws Exception
    {

        if (client == null ) throw new Exception("Cant create an account with no client ");
        if (balance < 100 ) throw new Exception("ony amounts higher then 100 DH are allowed ");
        return  new BankAccount(client, balance);
    }
}
