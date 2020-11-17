public class Matrix {
//test in bluej
	public void rowSums(int [] [] arr)
	{
		for(int i =0;i<arr.length;i++) //selects a row
		{
			int total =0;
			for(int j=0;j<arr[0].length;j++) //columns present - 0{
			{
				total = total+arr[i][j];
			}
			System.out.println("the row sum is: "+ total);
			}
			//return "";
	}
	//ask for help
	//loop through twice:once through the length of the array and once through the index of the array length
	//if [j][i]<min then min equals that
	//void method
	public void columnMins(int[][]arr)
	{
		
		for(int i = 0;i<arr.length;i++)
		{
			int min = Integer.MAX_VALUE;
			for(int j = 0;j<arr[i].length;j++)
				if(arr[j][i]<min)
					min = arr[j][i];
				System.out.println("the minimum of column number " + i + " is " + min);
			
		}
		//return "";
	
	}
	public static void main(String[] args) {
		Matrix x = new Matrix();
		int [][] a = 
			{
					{1,8,6},
					{4,5,3,},
					{7,2,9},
			};
}
}