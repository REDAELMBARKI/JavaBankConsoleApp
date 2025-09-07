public class AppController 
{
    public void menu()
    {
        System.out.println("=== Welcome to Simple Bank System ===");
        System.out.println("Please choose an option:");
        System.out.println("1. Create a new client");
        System.out.println("2. Create a bank account");
        System.out.println("3. View all clients");
        System.out.println("4. View accounts for a client");
        System.out.println("5. Deposit money");
        System.out.println("6. Withdraw money");
        System.out.println("7. Transfer money between accounts");
        System.out.println("8. View transaction history");
        System.out.println("9. Exit");

    }



    public int userOption(int option)
    {
        if (option < 1 || option > 9) throw new  IllegalArgumentException("the option selected is not correct ");

        return option;

    }


    public boolean middleWare(int option)
    {
        if (option == 1) return true;

        // check if the bank has this user 
        return  true;
    }

}
