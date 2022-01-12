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
class Holiday
{
    private String name;
    private int day;
    private String month;
// your code goes here
 public Holiday(String nm, int d, String mnth){
    name=nm;
    day=d;
    month=mnth;
 }
 public static boolean inSameMonth(Holiday a, Holiday b){
    if(a.month.equals(b.month)){
        return true;
    }
    else{
        return false;
    }
 }
 public static double avgDate(Holiday[] days){
     int length = days.length;
     int sum=0;
     for(int i=0; i<length;i++){
         sum=days[i].day +sum;
     }
     return (double)sum/length;
 }
}
public class HolidayLab1{
    public static void main(String args[]){
        Holiday ob = new Holiday("Independence Day",15, "August");
        Holiday ob1 = new Holiday("SecondSat",20,"August");
        boolean result = Holiday.inSameMonth(ob1,ob);
        System.out.println(result);
        Holiday[] holis=new Holiday[3];
        holis[0]=new Holiday("GandhiJayanthi",2,"October");
        holis[1]=new Holiday("Diwali",14,"November");
        holis[2]=new Holiday("RepublicDay",26,"January");
        double res=Holiday.avgDate(holis);
        System.out.println(res);
        
    }
}
