package search_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		ArrayList list = createRandomSortedArray(100,10);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to search random list : ");
		int searchNumber = scan.nextInt();
		binarySeach(list,searchNumber);
	}
	private static void binarySeach(ArrayList list, int searchNumber) {
		int max = list.size();
		int min = 0;
		int result = -1;
		
		while((max-min)>=1) {
			int mid = (int)(max+min)/2;
			if((int)list.get(mid) < searchNumber) {
				min = mid;
			}else if((int)list.get(mid) > searchNumber){
				max = mid;
			}else {
				result = mid;
				break;
			}
		}
		if(result >=0) {
			System.out.println("The list is : " +list);
			System.out.println("The digit is : " + result);
		}else {
			System.out.println("Bulunamadư");
		}
	}
	private static ArrayList createRandomSortedArray(int lim,int len) {
		ArrayList list = new ArrayList();
		int min = 0;
		int digit = (int) ( len*Math.random()) ;

		// I created for loop with five parts to prevent the numbers repeating.
		for(int i = 0 ; i < len; i++  ) {
			if(i<(int)len/5) {
				int number = min + (int) ( (lim/5-min)*Math.random()) ;
				min = number;
				list.add(number);
			}else if(i<(int)len/5*2){
				int number = min + (int) ( (lim/5*2-min)*Math.random()) ;
				min = number;
				list.add(number);
			}else if(i<(int)len/5*3){
				int number = min + (int) ( (lim/5*3-min)*Math.random()) ;
				min = number;
				list.add(number);
			}else if(i<(int)len/5*4){
				int number = min + (int) ( (lim/5*4-min)*Math.random()) ;
				min = number;
				list.add(number);
			}else {
				int number = min + (int) ( (lim-min)*Math.random()) ;
				min = number;
				list.add(number);
			}
		}
		System.out.println(list);
		return list;
	}
}
