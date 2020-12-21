package basic_algorithms;

import java.util.ArrayList;

public class create_random_sorted_list {
	public static void main(String[] args) {
		ArrayList list = createRandomSortedArray(1000,20);
		System.out.println(list);
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
		return list;
	}
}