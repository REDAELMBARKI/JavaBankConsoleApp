import java.io.BufferedReader;
import java.util.Scanner;

public  class AppController
{


    public static void router(int option) throws Exception{
        switch (option){
            // create a CLIENT request
            case 1 :
                Bank.handleClientCreation() ;
                break;


            // create a BANK ACCOUNT request
            case 2 :
                Bank.handleAccountCreation() ;
                break;
            // create a View All Clients request
            case 3 :
                System.out.println("VIEW ALL CLIENTS");
                break;

            default:
                throw  new Exception(" please choose a valid option !!");
        }
    }

    public static int startProgram(){
        int option = -1 ;
        Scanner sc = new Scanner(System.in);
        // show menu
        AppController.menu();
        while(option < 1 || option > 9){
            System.out.print("type an option : ");
            String iput = sc.nextLine();

            try{
               option =  Integer.parseInt(iput) ;
            }catch(Exception e){
                continue;
            }

        }
        return  option ;

    }



    public static void menu()
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






    public static boolean middleWare(int option)
    {
        if (option == 1) return true;

        // check if the bank has this user 
        return  true;
    }

}
