package com;

public class Question3 {
	public static <T> void swap(T[] array, int left, int right){
		T temp = array[right];
		array[right] = array[left];
		array[left] = temp;


	}

	public static void main(String[] args){

		Integer[] nums = {5, 12, 3, 7, 2};
		swap(nums, 3, 1);
		
		for(Integer i:nums) {
			System.out.println(i);
		}

	}	
}
