//import java.util.Scanner;
//
//public class QuadraticProbingHashTable
//{
//    public QuadraticProbingHashTable(int nextInt) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Hash Table Test\n\n");
//        System.out.println("Enter size");
//        /** maxSizeake object of QuadraticProbingHashTable **/
//        QuadraticProbingHashTable qpht = new QuadraticProbingHashTable(scan.nextInt());
// 
//        char ch;
//        /**  Perform QuadraticProbingHashTable operations  **/
//        do    
//        {
//            System.out.println("\nHash Table Operations\n");
//            System.out.println("1. insert ");
//            System.out.println("2. remove");
//            System.out.println("3. get");            
//            System.out.println("4. clear");
//            System.out.println("5. size");
// 
//            int choice = scan.nextInt();            
//            switch (choice)
//            {
//            case 1 : 
//                System.out.println("Enter key and value");
//                qpht.insert(scan.next(), scan.next() ); 
//                break;                          
//            case 2 :                 
//                System.out.println("Enter key");
//                qpht.remove( scan.next() ); 
//                break;                        
//            case 3 : 
//                System.out.println("Enter key");
//                System.out.println("Value = "+ qpht.get( scan.next() )); 
//                break;                                   
//            case 4 : 
//                qpht.makeEmpty();
//                System.out.println("Hash Table Cleared\n");
//                break;
//            case 5 : 
//                System.out.println("Size = "+ qpht.getSize() );
//                break;         
//            default : 
//                System.out.println("Wrong Entry \n ");
//                break;   
//            }
//            /** Display hash table **/
//            qpht.printHashTable();  
//            System.out.println("\nDo you want to continue (Type y or n) \n");
//            ch = scan.next().charAt(0);                        
//        } while (ch == 'Y'|| ch == 'y');  
//    }
//}
//
