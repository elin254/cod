 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package basics.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ts
 */
public class Bank {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your Account Number : ");
        String a = in.nextLine();
        System.out.print("Please enter your Name : ");
        String n = in.nextLine();
        System.out.print("Please enter your Current Balance : ");
        double b = in.nextDouble();
        System.out.print(" DO you want do any operations (YES / NO ) ");
        Scanner ini = new Scanner(System.in);
        String ch = ini.nextLine();
        BankAccount person = new BankAccount(a, n, b, ch);
        Scanner inn = new Scanner(System.in);
        String op = inn.nextLine();
        if (op.compareTo("Deposite") == 0) {
            System.out.println("Please enter the number of deposite : ");
            double de = inn.nextDouble();
            person.setDepo(op, de);
        } else if (op.compareTo("Withdraw") == 0) {
            System.out.println("Please enter the number of withdrawal : ");
            double wi = inn.nextDouble();
            person.setWith(op, wi);
        } else if (op.compareTo("Transfer") == 0) {
            System.out.println("Please enter the Account of the another user : ");
            String reacc = inn.nextLine();
            System.out.println("Please enter the Amount you want to transfer : ");
            double rebala = inn.nextDouble();
            person.setTrans(op, reacc, rebala);

        }
    }

}
