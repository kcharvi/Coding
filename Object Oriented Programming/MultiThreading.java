package objectorientedprogramming;

/**
 *
 * @author Charvi
 */

public class MultiThreading/* extends Thread*/{
    public static void main(String args[]){
    NewThread nt1= new NewThread("First",2);
    NewThread nt2= new NewThread("Second",2);
    NewThread nt3= new NewThread("Third",1);
    nt1.t.start();
    nt2.t.start();
    nt3.t.start();
    
    try{
    Thread.sleep(10000);
    }
    catch(InterruptedException e){
    System.out.println("Main thread Interrupted");
    }
    System.out.println("Main Thread Exiting.");
    }
    
}

class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String tname,int n){
        
        name=tname;
        t=new Thread(this,name);
        t.setPriority(n);
        System.out.println("New Thread: "+t+" with priority: "+t.getPriority());
    }
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println (name+" : "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(name+ " Interrupted");
        }
        System.out.println(name+" Exiting.");
    }
}