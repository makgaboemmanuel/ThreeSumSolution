package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<<<<<<<<<<<<<<<< LeetCode: 3 Sum Solution >>>>>>>>>>>>>>>>");
		int [] testMethod = {-1,0,1,2,-1,-4};// {0, 0, 0} ; 
		
		System.out.println( getTriplets( testMethod ));
	}
	
	/*   
	 *   Problem Statement: 
	 * 	 Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that 
	 *   i != j, i != k, and j != k, 
	 *   and nums[i] + nums[j] + nums[k] == 0.
	 *  
	 *   ###########################################################################################
	 *   Input: nums = [-1,0,1,2,-1,-4]
	 *   Output: [[-1,-1,2],[-1,0,1]]
	 *   ###########################################################################################
	 *  */
	
	public static String getTriplets(int [] arrayValues) {
		int [] zeroSum = new int [3]; /* initializing an array */
		boolean check_value = false;
		for(int i = 0; i < arrayValues.length; i++) {
			for(int j = 0; j < arrayValues.length; j++) {
				for(int k = 0; k < arrayValues.length; k++) {
					if( i != j && j !=k && i != k ) {
						if( arrayValues[i] + arrayValues[j] + arrayValues[k] == 0 ) {
							zeroSum[0] = arrayValues[i] ;
							zeroSum[1] =arrayValues[j];
							zeroSum[2] =arrayValues[k];	
							check_value = true;
						}
					}
				}
			}
		}
		
		ArrayList<String> myvals = new ArrayList<String>();
		
		if( check_value == true ) {
			myvals.add( String.valueOf( zeroSum[0])) ;
			myvals.add( String.valueOf( zeroSum[1])) ;
			myvals.add( String.valueOf( zeroSum[2])) ;
		}

		return  myvals.toString();
	}
	

}
