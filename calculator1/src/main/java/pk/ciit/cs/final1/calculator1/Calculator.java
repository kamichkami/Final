package pk.ciit.cs.final1.calculator1;

public class Calculator {
	/**
	 * 
	 * @param num1 is number1
	 * @param num2 is number2
	 * @param num3 is number3
	 * @return returns the maximum number
	 */
	public int findMax(int num1, int num2, int num3) 
	{  
		int[] arr = { num1, num2, num3 };
		int max = 0;   for (int i = 1; i < arr.length; i++)
		{ 
			if (arr[i] > max)     max = arr[i]; 
			} 
		return max; 
		} 
	/**
	 * 
	 * @param num is number1
	 * @return returns the 
	 * @throws IllegalArgumentException
	 */
	public int square(int num) throws IllegalArgumentException { 
		int result = 0;
		if (num > 0 && num < 10) { 
			result = num * num;  
			}
		else   
			throw new IllegalArgumentException(); 
		return result; 
		}
	public int cube(int num) {
		// TODO Auto-generated method stub
		int result=0;
		if(num > 0 && num <10){
			result = num*num*num;
		}
		return result;
	} 

}
