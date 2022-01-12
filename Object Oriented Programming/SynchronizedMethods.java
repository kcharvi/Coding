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
public class SynchronizedMethods extends Thread{
    static int n;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
         ThreadA a = new ThreadA(100); //For prime numbers
         ThreadB b = new ThreadB(1000); //For Composite numbers
         
         a.start();        
         b.start();
         
         try{
             a.join();
             b.join();
         }
         catch(InterruptedException e){
             System.out.println("Interrupted");
         }
         
    }
}
class ThreadA extends Thread{
    int num;
    ThreadA(int n){
        num=n;
    }
     public void run( ) {
         System.out.println("From Thread A ");
         prime();
         System.out.println("Exiting from Thread A ...");
     }
     synchronized void prime(){
        int flag=0;       
        System.out.println("Prime Numbers before "+num+" are ");
        for(int i = 10; i <= num; i++) {
           
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
     }
}


class ThreadB extends Thread {
    int num;
    ThreadB(int n){
        num=n;
    }
    public void run( ) {
       System.out.println("From Thread B ");
       composite();
       System.out.println("Exiting from Thread B ...");  
	}
    synchronized void composite(){
        System.out.println("Palindrome "+num+" are ");
        for(int i = 10; i <= num; i++) {
             int r,sum=0,temp;    
             int n=i;//It is the number variable to be checked for palindrome  
  
             temp=n;    
             while(n>0){    
                r=n%10;  //getting remainder  
                sum=(sum*10)+r;    
                 n=n/10;    
             }    
             if(temp==sum)    
                  System.out.println(i);    
          }
    }
}
