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
public class Test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        final Customers c = new Customers();
        System.out.println("Enter the withdrawal amount");
        int withdrawal=sc.nextInt();
        new Thread()
        {
            public void run()
            {
                c.withdraw(withdrawal);
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                c.deposit(10000);
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                c.deposit(10000);
            }
        }.start();    
    }
}
class Customers
{
    int balance = 10000;

    synchronized void withdraw(int amount)
    {
        System.out.println("Available Balance " + this.balance);
        System.out.println("About to withdraw." + amount);

        if (this.balance < amount)
        {
            System.out.println("Insufficient Balance – Need to Deposit.");
            try
            {
                wait();
            } catch (Exception e)
            {
                System.out.println("Interruption Occured");
            }
        }
        this.balance -= amount;
        System.out.println("Detected amaount: " + balance);
        System.out.println("Balance amount : " + this.balance);
    }

    synchronized void deposit(int amount)
    {
        System.out.println("About to deposit " + amount);
        this.balance += amount;
        System.out.println("Available Balance " + this.balance);
        System.out.println("Transaction completed.");
        notify();
    }
}