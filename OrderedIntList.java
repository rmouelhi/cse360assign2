/** Description: Takes a number of integers and prints out the values in order.
 * @author Ramzi Mouelhi
 * @pin 36
 */

package cse360assign2;

public class OrderedIntList
{
	protected static int[] a;
	private static int c;
	private boolean debugging;
	
	/** Create an array to store 10 integers.
	 * 
	 */
	OrderedIntList()
	{
		a = new int[10];
	}
	
	/** Insert integers into array in order.
	 * 
	 * @param v		inserted integer
	 */
	public static void insert(int v)
	{
		if (c == a.length)
			grow();
		
		if (c == 0)
		{
			a[0] = v;
			c++;
		}
		else
		{
			int j = 0;
			for (int i = 0; i < c; i++, j++)
				if (v < a[i])
					break;
			for (int i = c; i > j; i--)
				a[i] = a[i - 1];
			a[j] = v;
			c++;
		}
	}
	
	/** Adjust size of array.
	 * 
	 */
	protected static void grow()
	{
		int []t = new int [c * 2];
		for (int i = 0; i < c; i++ )
			t[i] = a[i];
		a = t;
	}
	
	/** Print integers from array in order.
	 * 
	 */
	public void print()
	{
		for (int i = 0; i < c; )
		{
			if (i % 5 == 0)
				System.out.println();
			System.out.print(a[i++] + "\t");
		}
		System.out.println();
	}
}