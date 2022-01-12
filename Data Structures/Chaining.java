import java.util.Scanner;

class SLLNode {

    SLLNode next;
    int data;

    /* Constructor */
    public SLLNode(int x) {
        data = x;
        next = null;
    }

	public void insert(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	public void remove(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	public void makeEmpty() {
		// TODO Auto-generated method stub
		
	}

	public String getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public String isEmpty() {
		// TODO Auto-generated method stub
		return null;
	}

	public void printHashTable() {
		// TODO Auto-generated method stub
		
	}
}

public class Chaining {

    private SLLNode[] table;    //table is an array of type of SLLNode
    private int size;

    /* Constructor */
    public Chaining(int tableSize) {
        table = new SLLNode[nextPrime(tableSize)];
        size = 0;
    }
    /* Function to check if hash table is empty */

    public boolean isEmpty() {
        return size == 0;   //checking it is empty or not then return true or false
    }
    /* Function to clear hash table */

    public void makeEmpty() {
        int l = table.length;
        table = new SLLNode[l];
        size = 0;
    }
    /* Function to get size */

    public int getSize() {
        return size;
    }
    /* Function to insert an element */

    public void insert(int val) {
        size++;
        int pos = myhash(val);
        SLLNode nptr = new SLLNode(val);
        if (table[pos] == null) {    //if there is no collision(null) and you can store directly on to the head of linked list
            table[pos] = nptr;   
        } else {
            nptr.next = table[pos];   // collison then you have to store it in nptr.next
            table[pos] = nptr;
        }
    }
    /* Function to remove an element */

    public void remove(int val) {
        int pos = myhash(val);
        SLLNode start = table[pos];
        SLLNode end = start;
        if (start.data == val) {
            size--;
            table[pos] = start.next;
            return;
        }
        while (end.next != null && end.next.data != val) {
            end = end.next;
        }
        if (end.next == null) {
            System.out.println("\nElement not found\n");
            return;
        }
        size--;
        if (end.next.next == null) {
            end.next = null;
            return;
        }
        end.next = end.next.next;
        table[pos] = start;
    }
    /* Function myhash */

    private int myhash(Integer x) {
        int hashVal = x;
        System.out.println("hashVal_1:"+hashVal);
        hashVal %= table.length;
         System.out.println("hashVal_2:"+hashVal);
        if (hashVal < 0) {
            hashVal += table.length;
            System.out.println("hashVal_3:"+hashVal);
        }
        return hashVal;
    }
    /* Function to generate next prime number >= n */

    private static int nextPrime(int n) {
        if (n % 2 == 0) {
            n++;
        }
        for (; !isPrime(n); n += 2);

        return n;
    }
    /* Function to check if given number is prime */

    private static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n == 1 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printHashTable() {
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            System.out.print("Bucket " + i + ":  ");
            SLLNode start = table[i];
            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hash Table Test\n\n");
        System.out.println("Enter size");
        /* Make object of HashTableChainingSinglyLinkedList */
        SLLNode htcsll = new SLLNode(scan.nextInt());

        char ch;
        /*  Perform HashTableChainingSinglyLinkedList operations  */
        do {
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. remove");
            System.out.println("3. clear");
            System.out.println("4. size");
            System.out.println("5. check empty");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    htcsll.insert(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to delete");
                    htcsll.remove(scan.nextInt());
                    break;
                case 3:
                    htcsll.makeEmpty();
                    System.out.println("Hash Table Cleared\n");
                    break;
                case 4:
                    System.out.println("Size = " + htcsll.getSize());
                    break;
                case 5:
                    System.out.println("Empty status = " + htcsll.isEmpty());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /* Display hash table */
            htcsll.printHashTable();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        scan.close();
    }

}
