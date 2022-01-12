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
public class ExamQuestion {
    
}
abstract class Base {
   //Overridden method
    Base(){
        hello();
    }
   abstract void hello();
   
}
class Derived extends Base{
    int a=900;
    
   //Overriding method
   public void hello(){
      System.out.println(a);
   }
   public static void main( String args[]) {
      Derived obj = new Derived();
      
      obj.hello();
   }
}