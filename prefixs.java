import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Prefixs {
	
	

	public static void main(String[] args) {
		
		
		
		String[] string1 = {"gang","gangster","kangaroo","kanada"};
		
		Arrays.sort(string1);
		
		ArrayList numArray = new ArrayList();
		
		
		for(int i=1;i<string1.length;i++)
		{
			int counter = 0;
			String str1 = string1[i-1];
			String str2 = string1[i];
			for(int j=0;(j<str1.length())&&(j<str2.length());j++)
			{
				if(str1.charAt(j)==str2.charAt(j))
				{
					counter++;
				}
				
			}
			
			numArray.add(new Integer(counter));
		//	System.out.println("Counter : "+counter);
			
		}
		
		int[] arrayInt = new int[numArray.size()];
		
		for(int i=0;i<numArray.size();i++)
		{
			arrayInt[i]=((Integer) numArray.get(i)).intValue();
		}
		
		int maxCountIndex = numArray.indexOf(Collections.max(numArray));
		
		System.out.println("Maximum prefix value = "+string1[maxCountIndex].substring(0, arrayInt[maxCountIndex]));

	}

}
