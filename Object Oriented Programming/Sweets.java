package sweets;

/**
 *
 * @author Charvi
 */
import java.util.*;
class Oldman{
    int children;
    int noOfSweets;
    Oldman(int c, int s){
        try{
          if(s>c&&(s%c==0))
        {
             System.out.println("Each child will get "+ s/c +" sweets ");
        }
          else if(s>c&&(s%c!=0)){
              int gets=(s%c)*c;
              System.out.println(gets+" children will get "+ s/c +" sweets ");
              System.out.println("And "+s%c+" sweet will remain. ");
          }
          else if(s<c)
          {
            System.out.println(s +" children can get 1 sweets but "+ (c-s) +" remaining children will not get any sweet.");
          }
        }
        catch(ArithmeticException ex){
            System.out.println("No child to distribute the sweets. ");
        }
    }
}
public class Sweets {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of children: ");
     int children=sc.nextInt();
     System.out.println("Enter the number of sweeets: ");
     int sweets=sc.nextInt();
     Oldman ob = new Oldman(children,sweets);
    }
    
}
