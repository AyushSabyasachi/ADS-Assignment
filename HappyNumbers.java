import java.util.Scanner;
public class HappyNumbers 
{
	int count; 

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		HappyNumbers hn=new HappyNumbers();
		System.out.println("Enter starting number and ending number");
		
		//start and end of the range between which we need to find happy numbers
		
		int start=s.nextInt();
		int end=s.nextInt();
		hn.range(hn, start, end);
		s.close();
		

	}
	
	//function to iterate between the range and find happy numbers
	void range(HappyNumbers hn,int start,int end)
	{
		while(start<=end)
		{
			hn.count=0;
			if(hn.findHappyNumbers((start)))
				System.out.println(start+" is a happy number and the it took "+(count+1)+" iterations to determine it");
			start++;
			
		}
	}
	
	//function to find happy numbers
	
	boolean findHappyNumbers(int n)
	{
		int sumOfDigits=0;
		if(n==1)
			return true;
		else if(this.count>10)
			return false;
		//loop to separate each digit and compute its square and then add them
		while(n>0)
		{
			int mod=n%10;
			sumOfDigits +=mod*mod;
			n=n/10;
			
		}
		++this.count;
		return findHappyNumbers(sumOfDigits);
	}

}
