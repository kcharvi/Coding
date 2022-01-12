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
class Generic<T1,T2,T3>{
    T1 ob1;
    T2 ob2;
    T3 ob3;
    Generic(T1 o1,T2 o2,T3 o3){
        ob1=o1;
        ob2=o2;
        ob3=o3;
        genericDisplay(o1,o2,o3);
    }
    public static <T1,T2,T3> void genericDisplay (T1 o1,T2 o2,T3 o3) 
		    { 
		        System.out.println(o1 +"         " +o2+"          "+o3); 
                        
		    } 
    
}

public class Generics {
		  
		    public static void main(String[] args) {
		        // TODO code application logic here
		        //Scanner sc=new Scanner(System.in);
		        //System.out.println("Enter the number of rows you would like to enter: ");
		        //int n=sc.nextInt();
                        //System.out.println("Enter the row : ");
                         Generic first=new Generic<>(18,10861,"Virat");
                         Generic second=new Generic<>("Sachin",10,18426);
                         Generic third=new Generic<>(7,"Dhoni",10534);
                         Generic fourth=new Generic<>(10201,333,"Gayle");
                         Generic fifth=new Generic<>("ABD",9577,17);
		
      }
	}
/*        for (int i=0; i<n; i++){
                            
                            Generic o=new Generic<>(sc.next(),sc.next(),sc.next());
		         //  Generic.genericDisplay(o);
		        }
		  */
  /*      Generic<Integer,Integer,String> firstline=new Generic<Integer,Integer,String>(18,10861,"Virat");
        System.out.println(firstline.getob1()+"      "+firstline.getob2()+"    "+firstline.getob3());
        
        Generic<String,Integer,Integer> secondline=new Generic<String,Integer,Integer>("Sachin",10,18426);
        System.out.println(secondline.getob1()+"  "+secondline.getob2()+"       "+secondline.getob3());
        
        Generic<Integer,String,Integer> thirdline=new Generic<Integer,String,Integer> (7,"Dhoni",10534);
        System.out.println(thirdline.getob1()+"       "+thirdline.getob2()+"    "+thirdline.getob3());
        
        Generic<Integer,Integer,String> fourthline=new Generic<Integer,Integer,String>(10201,333,"Gayle");
        System.out.println(fourthline.getob1()+"   "+fourthline.getob2()+"      "+fourthline.getob3());
        
        Generic<String,Integer,Integer> fifthline=new Generic<String,Integer,Integer>("ABD",9577,17);
        System.out.println(fifthline.getob1()+"     "+fifthline.getob2()+"     "+fifthline.getob3());
    */