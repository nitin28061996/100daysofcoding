package day1;

public class maxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int global_max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			int local_max=0;
			for(int j=i;j<arr.length;j++){
				
				local_max+=arr[j];
				
				if(local_max>global_max){
					global_max=local_max;
				}
				
				
				
			}
			
		}
        System.out.println(global_max);
	}

}
