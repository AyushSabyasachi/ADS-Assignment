
public class QuickSort
{
	public static void main(String[]args)
	{
		int []arr= {12,56,7,34,89};
		int left=0;
		int right=arr.length-1;
		quickSort(arr,left,right);
		display(arr);
	}
	static void quickSort(int []arr,int left,int right)
	{
		if(left<right)
		{
			int pivot=partition(arr,left,right);
			quickSort(arr,left,pivot-1);
			quickSort(arr,pivot+1,right);
		}
	}
	static int partition(int []arr,int left,int right)
	{
		int i=left-1;
		int temp;
		for(int j=left;j<right;j++)
		{
			if(arr[j]<arr[right])
			{
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp=arr[i+1];
		arr[i+1]=arr[right];
		arr[right]=temp;
		return i+1;
	}
	static void display(int []arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+",");
	}

}
