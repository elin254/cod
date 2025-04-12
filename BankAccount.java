/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics.bank;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Ts
 */
public class BankAccount {
    private String accnum;
    private String name;
    private double balance;
    private double deposite;
    private double withdraw;
    private String check;
    private String opration;
    private String reacc;
    private double rebalance;
    public BankAccount (String a,String n , double b ,String ch ){
        
       accnum = a;
       name = n;
        balance = b;
        check=ch;
        if (ch.compareTo("YES")==0){
            System.out.println("Please enter What is the operation you want (Deposite / Withdraw / Transfer ) " );
        }else {
            System.out.print ("Thanks for your user");
        }
    }
        public void setDepo (String op,double de){
            if (op.toString().compareTo("Deposite")==0){
              
               this.balance = this.balance + de ; 
               System.out.println ("Your current balance after deposite is : " + balance);
               
        }
        }
        public void setWith (String op,double wi){
         withdraw = wi;
         this.balance = this.balance;
         if (wi>this.balance){
           System.out.println ("Your current balance do not allow you to do this opretion ");   
         }else{
            this.balance = this.balance - wi ;  
            System.out.println ("Your current balance after withdrawal is : " + balance); 
    }
        }
         public void setTrans (String op,String reacc , double rebal){
             rebalance = rebal;
             this.balance = this.balance - rebal ;  
             System.out.print("you transfer" + rebal);
            System.out.println (" and Your current balance after transfer is : " + balance); 
    }
   
 /*   public void display () {
    System.out.println("Account Number : " + accnum);
    System.out.println("The Name of User : " + name);
    System.out.println("The Current Balance : " + balance);
     System.out.println ("Your current balance after deposite is : " + balance);
     System.out.println ("Your current balance after withdrawal is : " + balance); 
}*/
    
}
