package sorting_algorithms;
import java.util.ArrayList;

public class insertion_sort {
	public static void main(String args[]) {
		ArrayList unsortedList = new ArrayList();
		for(int i = 0 ; i < 10 ;i++) {
			unsortedList.add(createRondomNum(100));
		}
		System.out.println("The unsorted list : "+unsortedList );
		ArrayList result = insertion_sort(unsortedList);
		System.out.println("The sorted list : "+result);
	}
	
	private static ArrayList insertion_sort(ArrayList list) {
		for(int i = 1;i<list.size();i++) {
			int key = (int) list.get(i);
			int j = i-1;
			while( j >= 0 && key < (int) list.get(j)) {
				list.set(j+1, (int) list.get(j));
				j--;
			}
			list.set(j+1,key);
		}
		return list;
	}

	private static int createRondomNum(int i) {
		int number = (int) ( i*Math.random()) ;
		return number;
	}

}
