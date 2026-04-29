package chapter8;
	import java.util.Scanner;
public class CI245_HW2_Adriana {

	public static void main(String[] args) {

				System.out.println("Homework 2 by Adriana ");

				        String[] NAMES = {"Tom ", "Jane", "Mark"};
				        String[] DAYS = {"MON", "TUE", "WED", "THU", "FRI"};

				        // Create a double type array named as hours.
				        double[][] hours = new double[NAMES.length][DAYS.length];

				        // Invoke methods
				        input_hours(hours, NAMES, DAYS);
				        display_hours(hours, NAMES, DAYS);
				        
				        System.out.println("---------------------------------------");
				        System.out.println("Total hours    :   " + totalHours(hours, NAMES, DAYS));
				        
				        totalHoursByEmployee(hours, NAMES, DAYS);
				    }

				    // 1) Method to enter work hours
				    public static void input_hours(double[][] hours, String[] NAMES, String[] DAYS) {
				        Scanner sc = new Scanner(System.in);
				        for (int i = 0; i < NAMES.length; i++) {
				            System.out.println("Enter the work hours for " + NAMES[i].trim());
				            for (int j = 0; j < DAYS.length; j++) {
				                System.out.print(DAYS[j] + " : ");
				                hours[i][j] = sc.nextDouble();
				            }
				        }
				        System.out.println();
				    }

				    // 2) Method to display all work hours in a table format
				    public static void display_hours(double[][] hours, String[] NAMES, String[] DAYS) {
				        System.out.println("Display Weekly Work Hours");
				        // Print header
				        System.out.print("           ");
				        for (String day : DAYS) {
				            System.out.print(day + "    ");
				        }
				        System.out.println("\n---------------------------------------");

				        // Print rows
				        for (int i = 0; i < NAMES.length; i++) {
				            System.out.printf("%-8s | ", NAMES[i].trim());
				            for (int j = 0; j < DAYS.length; j++) {
				                System.out.printf("%-6.1f", hours[i][j]);
				            }
				            System.out.println();
				        }
				    }

				    // 3) Method to compute the grand total of all hours
				    public static double totalHours(double[][] hours, String[] NAMES, String[] DAYS) {
				        double total = 0;
				        for (int i = 0; i < hours.length; i++) {
				            for (int j = 0; j < hours[i].length; j++) {
				                total += hours[i][j];
				            }
				        }
				        return total;
				    }

				    // 4) Show total hours by each employee
				    public static void totalHoursByEmployee(double[][] hours, String[] NAMES, String[] DAYS) {
				        System.out.println("\nTotal Hours By Employee");
				        System.out.println("---------------------------------------");
				        
				        // Note: The provided output example shows a running sum 
				        // (13.0, 25.0, 37.0). I will follow that specific visual pattern.
				        double runningTotal = 0;
				        for (int i = 0; i < NAMES.length; i++) {
				            double employeeSum = 0;
				            for (int j = 0; j < DAYS.length; j++) {
				                employeeSum += hours[i][j];
				            }
				            runningTotal += employeeSum;
				            System.out.printf("%-8s |   %.1f\n", NAMES[i].trim(), runningTotal);
				        }
				    }
	}