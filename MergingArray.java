import java.util.*;
class MergeArray
{
	public void isMerging()
	{
		int arr1[]=new int[100];
		int arr2[]=new int[100];
		System.out.println("enter the size of arr1 and arr2: ");
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();

        System.out.println("enter elements of arr1: ");
        for(int i=0;i<m;i++)
        {
        	arr1[i]=s.nextInt();
        }
        System.out.println("enter elements of arr2: ");
        for(int i=0;i<n;i++)
        {
        	arr2[i]=s.nextInt();
        }
           int k=0;
        for(int i=m;i<(m+n);i++)
        {
        	arr1[i]=arr2[k];
        	k++;
        }
        
        for(int pass=1;pass<(m+n);pass++)
        {  int temp;
        	for(int j=0;j<(m+n)-pass;j++)
        	{
        		if(arr1[j]>arr1[j+1])
        		{
                    temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
        		}
        	}
        }
        System.out.println("After merging Array:");
        for(int i=0;i<(m+n);i++)
        {
        	System.out.print(arr1[i]+" ");
        }

	}
}
public class MergedSortedArray{
	public static void main(String[] args)
	{
		MergeArray m=new MergeArray();
		m.isMerging();
	}
}
