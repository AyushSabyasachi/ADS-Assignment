
public class MergeSort 
{
	public static void main(String []args)
	{
	int [] arr= {20,3,16,45,67};
	int low=0;
	int high=arr.length-1;
    divide(arr,low,high);
	}
	static void divide(int[]arr,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			divide(arr,low,mid);
			divide(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	static void merge(int[]arr,int low,int mid,int high)
	{
		int []leftArr=new int[mid];
		int []rightArr=new int[high-mid];
		for(int i=0;i<mid;i++)
		{
			leftArr[i]=arr[i];
			
		}
		for(int i=mid+1;i<high;i++)
		{
			rightArr[i]=arr[i];
		}
		for(int i=0;i<mid;i++)
		{
			if(rightArr[i]>leftArr[i])
				arr[i]=leftArr[i];
			else
				arr[i]=rightArr[i];
		}
		System.out.println(arr);
	}
}
