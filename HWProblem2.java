package chapter8;
import java.util.Random;
public class HWProblem2 {

	public static void main(String[] args) {
	

				        // 1) Create an integer array of size 100
				        int[] scores = new int[100];

				        // 2) Generate 100 integer scores (0 to 99)
				        Random rand = new Random();
				        for (int i = 0; i < scores.length; i++) {
				            scores[i] = rand.nextInt(100); // Generates 0-99
				        }

				        // 3) Invoke method to display the scores
				        displayScores(scores);

				        // 4) Calculate and display average and scores above/equal to average
				        analyzeAverage(scores);

				        // 5) Bonus: Determine number of scores in each range
				        displayRangeCounts(scores);
				    }

				    /** Method to display scores (10 scores per line) */
				    public static void displayScores(int[] scores) {
				        System.out.println("Scores --------------------------");
				        for (int i = 0; i < scores.length; i++) {
				            System.out.printf("%-3d ", scores[i]);
				            if ((i + 1) % 10 == 0) {
				                System.out.println();
				            }
				        }
				        System.out.println();
				    }

				    /** Method to determine how many scores are above or equal to average */
				    public static void analyzeAverage(int[] scores) {
				        double total = 0;
				        for (int score : scores) {
				            total += score;
				        }
				        double average = total / scores.length;

				        int count = 0;
				        for (int score : scores) {
				            if (score >= average) {
				                count++;
				            }
				        }

				        System.out.printf("Average Scores: %.2f\n", average);
				        System.out.println("Above average Scores: " + count + "\n");
				    }

				    /** Bonus: Method to determine number of scores in each range */
				    public static void displayRangeCounts(int[] scores) {
				        int[] ranges = new int[10]; // To store counts for 0-9, 10-19, etc.

				        // Count occurrences by using integer division to find the index
				        for (int score : scores) {
				            ranges[score / 10]++;
				        }

				        System.out.println("Counts of scores in each range");
				        System.out.println("------------------------------");
				        for (int i = 0; i < ranges.length; i++) {
				            int lower = i * 10;
				            int upper = lower + 9;
				            System.out.printf("%d--%d : %d\n", lower, upper, ranges[i]);
				        }
				    }		


	}
