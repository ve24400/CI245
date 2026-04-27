package chapter8;
import java.util.Scanner;
public class HWProblem1 {

	public static void main(String[] args) {
		
				        Scanner input = new Scanner(System.in);

				        // 1) Ask user to enter the number of elements
				        System.out.print("Enter the number of elements: ");
				        int size = input.nextInt();

				        // 2) Create two arrays
				        int[] list1 = new int[size];
				        int[] list2 = new int[size];

				        // 3) Ask user to enter numbers for list 1
				        System.out.println("Enter numbers for list 1");
				        System.out.println("-------------------------");
				        for (int i = 0; i < list1.length; i++) {
				            System.out.print("Enter number " + (i + 1) + " : ");
				            list1[i] = input.nextInt();
				        }

				        // 4) Ask user to enter numbers for list 2
				        System.out.println("\nEnter numbers for list 2");
				        System.out.println("-------------------------");
				        for (int i = 0; i < list2.length; i++) {
				            System.out.print("Enter number " + (i + 1) + " : ");
				            list2[i] = input.nextInt();
				        }

				        // 5) Use method to display all numbers
				        displayList("List 1", list1);
				        displayList("List 2", list2);

				        // 7) Invoke equals method and display the result
				        System.out.println("-------------------------");
				        if (equals(list1, list2)) {
				            System.out.println("Two lists are identical");
				        } else {
				            System.out.println("Two lists are not strictly identical");
				        }
				    }

				    /** 6) Method to compare each number */
				    public static boolean equals(int[] list1, int[] list2) {
				        // If lengths are different, they cannot be strictly identical
				        if (list1.length != list2.length) {
				            return false;
				        }

				        // Check if corresponding elements are equal
				        for (int i = 0; i < list1.length; i++) {
				            if (list1[i] != list2[i]) {
				                return false;
				            }
				        }

				        return true;
				    }

				    /** 5) Helper method to display the lists as shown in the sample output */
				    public static void displayList(String label, int[] list) {
				        System.out.println(label + " -------------------------");
				        for (int value : list) {
				            System.out.print(value + "  ");
				        }
				        System.out.println();
				    }		
	}
