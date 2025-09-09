import java.util.ArrayList;
import java.util.List ;
import java.util.Scanner;

public abstract class Bank {


   public String name ;
   public Double additions;

   public Bank(String name , double additions ){
       this.name = name;
       this.additions = additions;
   }

   public String getName(){
       return this.name;
   }

    public String setName(String name){
        this.name = name ;
    }

    // handleClientCreation
    public static void  handleClientCreation(){
         // get an  email exist
        String email = "" ;
        System.out.println("enter the client email :");
        boolean isValidEmail = false ;

        while(! isValidEmail){

            email = Bank.input.next() ;

            if(! email.equals("") && email.contains("@") && email.contains(".") ){
                isValidEmail = true;
            }
        }

    }



}
