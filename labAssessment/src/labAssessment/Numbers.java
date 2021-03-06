
package labAssessment;



public class Numbers {
	/** @param num is a positive non-decimal value
	* Precondition : num &gt;= 0
	* @return true if the sum of digit divisors of num is odd
	@return false if the sum of the digit divisors of num is even
	*/
	public static boolean isGoofy(int num)
	{
		int goofy = 0;
		int nums[] = new int[10];
		if (num >0){
			for (int i = 10000; i>0 ; i= i/10){
				int j = 0;
				if (num%i < num){
					nums[j] = num%i;
					j++;
				}
				if (num%10*10 >0){
					nums[j] = num%10;
					j++;
				}
				
			}
			for(int k = 0; k<nums.length; k++){
				int number = nums[k];
				if (num%(number) == 0){
					goofy = goofy + nums[k];
				}
			}
			if (goofy %2 == 0){
				return false;
			}
		
		}
		return true;
		
	/* to be implemented in part(a) */
	}
	public static int[] getSomeGoofyNumbers(int count)
	{
		int nums[] = new int[count];
		int number = 1;
		
			for(int i = 0; i<count; i++){
				nums[i] = number;
				number = number + 2;
			}
		return nums;
	}
	


public static void main (String[] args){
	Numbers number = new Numbers();
	System.out.println(isGoofy(12));
	System.out.println(getSomeGoofyNumbers(3));
}
}