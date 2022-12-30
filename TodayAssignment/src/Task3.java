
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		int k=6;
		int count=0;
		int arr[] = {1,5,7,1};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==k)
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
