package sorting_algorithms;
import java.util.ArrayList;

public class quick_sort {
	public static void main(String args[]) {

		ArrayList unsortedList = new ArrayList();
		for(int i = 0 ; i < 10 ;i++) {
			unsortedList.add(createRondomNum(100));
		}
		System.out.println("The unsorted list : "+unsortedList);
		quick_sort(unsortedList,0,unsortedList.size()-1);
		System.out.println("The sorted list : "+unsortedList);
	}	
	private static void quick_sort(ArrayList list, int low, int high) {
		if(high> low) {
			int keyDigit = low;
			int key = (int)list.get(keyDigit);
			int first = keyDigit + 1;
			int last = high;
			int otherKey = last;
			boolean okl = true;
			for (int i = low; i<high;i++) {
				if(okl == true) {
					if(key > (int)list.get(otherKey)) {
						int temp = (int) list.get(keyDigit);
						list.set(keyDigit, (int)list.get(otherKey));
						list.set(otherKey, temp);
						last--;
						keyDigit = otherKey;
						otherKey=first;
						okl = false;
					}else {
						last--;
						otherKey = last;
					}
					
				}else {
					if(key <(int) list.get(otherKey)) {
						int temp = (int) list.get(keyDigit);
						list.set(keyDigit, (int)list.get(otherKey));
						list.set(otherKey, temp);
						first++;
						keyDigit = otherKey;
						otherKey = last;
						okl = true;
					}else {
						first++;
						otherKey = first;
					}
				}
			}
			quick_sort(list,low,keyDigit-1);
			quick_sort(list,keyDigit+1,high);			
		}	
	}
	private static int createRondomNum(int i) {
		int number = (int) ( i*Math.random()) ;
		return number;
	}
}
