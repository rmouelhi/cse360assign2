/** Description: Takes an ordered list of integers and returns the values mean, median, highest, and lowest as well as the number of values entered.
 * @author Ramzi Mouelhi
 * @pin 36
 */

package cse360assign2;

public class Analytics
{
	/** Returns the mean of the array as a double.
	 * 
	 * @param a
	 * @return
	 */
	public static double mean(int a[])
	{
		double mean;
		double sum = 0;
		int size = numInts(a);
		
		if (size != 0)
		{	
			for (int index = 0; index < size; index++)
				sum = sum + a[index];
			
			mean = sum / size;
		}
		else
			mean = -1;
		
		return mean;
	}
	
	/** Returns the median of the array as an integer.
	 * 
	 * @param a
	 * @return
	 */
	public static int median(int a[])
	{
		int median = 0;
		int size = numInts(a);
		
		if (size != 0)
		{
			if ((size % 2) == 0)
				median = a[size / 2];
			else
				median = (a[size / 2] + a[size / 2 + 1]) / 2;
		}
		else
			median = -1;
		
		return median;
	}
	
	/** Returns the highest value in the array as an integer.
	 * 
	 * @param a
	 * @return
	 */
	public static int high(int a[])
	{
		int high;
		
		if (numInts(a) != 0)
			high = a[numInts(a) - 1];
		else
			high = -1;
		
		return high;
	}
	
	/** Returns the lowest value in the array as an integer.
	 * 
	 * @param a
	 * @return
	 */
	public static int low(int a[])
	{
		int low;
		
		if (numInts(a) != 0)
			low = a[0];
		else
			low = -1;
		
		return low;
	}
	
	/** Returns the number of values in the array as an integer.
	 * 
	 * @param a
	 * @return
	 */
	public static int numInts(int a[])
	{
		int size = a.length;
		
		return size;
	}
}
