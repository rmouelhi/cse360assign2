/** Description: Test file for Analytics.java and OrderedIntList.java
 * @author Ramzi Mouelhi
 * @pin 36
 */

package cse360assign2;

import java.util.Scanner;

public class TestAnalytics
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		System.out.println("Enter an integer, enter -1 to exit.");
		while (input != -1)
		{
			input = scan.nextInt();
			OrderedIntList.insert(input);
		}
		
		System.out.println("Mean: " + Analytics.mean(OrderedIntList.a));
		System.out.println("Median: " + Analytics.median(OrderedIntList.a));
		System.out.println("High: " + Analytics.high(OrderedIntList.a));
		System.out.println("Low: " + Analytics.low(OrderedIntList.a));
		System.out.println("Number of Integers: " + Analytics.numInts(OrderedIntList.a));
	}
}
