package sorting_algorithms;
import java.util.ArrayList;
public class selection_sort {
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
		for (int i = 0; i < list.size();i++) {
			int minIndex = i;
			for (int j = i+1;j<list.size();j++) {
				if( (int) list.get(minIndex) > (int) list.get(j) ) {
					minIndex = j;
				}		
			}
			int temp = (int) list.get(minIndex);
			list.set(minIndex, list.get(i));
			list.set(i, temp);
		}
		return list;
	}


	private static int createRondomNum(int i) {
		int number = (int) ( i*Math.random()) ;
		return number;
	}

}
