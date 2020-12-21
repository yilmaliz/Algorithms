package sorting_algorithms;
import java.util.ArrayList;

public class buble_sort {
	public static void main(String args[]) {
		ArrayList unsortedList = new ArrayList();
		for(int i = 0 ; i < 10 ;i++) {
			unsortedList.add(createRondomNum(100));
		}
		System.out.println("The unsorted list : "+unsortedList );
		ArrayList result = selection_sort(unsortedList);
		System.out.println("The sorted list : "+result);
	}
	
	private static ArrayList selection_sort(ArrayList list) {
		for(int i = 0; i < list.size();i++) {
			for(int j = 0; j < list.size() - i -1;j++) {
				if((int) list.get(j) > (int)list.get(j+1)) {
					int temp = (int) list.get(j);
					list.set(j, (int) list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		return list;
	}
	private static int createRondomNum(int i) {
		int number = (int) ( i*Math.random()) ;
		return number;
	}
}
