/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedprogramming;

/**
 *
 * @author Charvi
 */
import java.util.*;
public class Account{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        AccountDetails ob=new AccountDetails();
        System.out.println("Your account balance is :"+ob.balance);
        System.out.println("Please enter the amount to add in your balance: ");
        int amount=sc.nextInt();
        try{
           ob.deposit(amount);
        }
        catch(BalanceException e){
            
        }
    }
}

class AccountDetails 
{
    int balance = 15000;
    
      
    public void deposit(int amt)throws BalanceException{
        balance+=amt;
        if(balance>20000){
            throw new BalanceException(amt,balance);
        }
        else{
            System.out.println("Total account balance: "+balance);
        }
    }

}
class BalanceException extends Exception{
    BalanceException(int amt,int balance){
        System.out.println("Your account balance is more than 20K now, so creating FD of amount: "+(balance-20000));    
}
} 

