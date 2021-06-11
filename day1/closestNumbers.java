package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class closestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{1,6,5,3,10,13,14};
		Arrays.sort(arr);
		List<Integer> list=new ArrayList<Integer>();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int currDiff=arr[i]-arr[i-1];
            if(currDiff<min){
                min=currDiff;
                list.clear();
               
                list.add(arr[i-1]);
                 list.add(arr[i]);
                
            }else if(currDiff==min){
                
                list.add(arr[i-1]);
                list.add(arr[i]);
            }
        }
        System.out.println(list.toString());
	}

}
