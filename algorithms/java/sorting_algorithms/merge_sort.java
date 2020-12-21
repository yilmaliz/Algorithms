package sorting_algorithms;
import java.util.ArrayList;

public class merge_sort {

	public static void main(String args[]) {

		ArrayList unsortedList = new ArrayList();
		for(int i = 0 ; i < 10 ;i++) {
			unsortedList.add(createRondomNum(100));
		}
		System.out.println("The unsorted list : "+unsortedList);
		merge_sort(unsortedList);
		System.out.println("The sorted list : "+unsortedList);
	}
	
	private static void merge_sort(ArrayList list) {
		if(list.size()>1) {
			int x = (int)list.size()/2;
			
			ArrayList leftList = new ArrayList();
			for(int i = 0 ;i < x;i++) {
				leftList.add(list.get(i));
			}
			//System.out.println(leftList);
			
			ArrayList rightList = new ArrayList();
			for(int i = x ;i < list.size();i++) {
				rightList.add(list.get(i));
			}
			//System.out.println(rightList);
			
			merge_sort(leftList);
			merge_sort(rightList);
			
			int indexLeft = 0;
			int indexRight = 0;
			int indexMain = 0;
			
			while(indexLeft < leftList.size() & indexRight < rightList.size()) {
				if ((int)leftList.get(indexLeft) < (int)rightList.get(indexRight)) {
					list.set(indexMain, (int)leftList.get(indexLeft));
					indexLeft++;
				}else {
					list.set(indexMain, (int)rightList.get(indexRight));
					indexRight++;
				}
				indexMain++;
			}
			
			while(indexLeft < leftList.size()) {
				list.set(indexMain, (int)leftList.get(indexLeft));
				indexLeft++;
				indexMain++;
			}
			while(indexRight < rightList.size()) {
				list.set(indexMain, (int)rightList.get(indexRight) );
				indexRight++;
				indexMain++;
			}
		}
	}
	private static int createRondomNum(int i) {
		int number = (int) ( i*Math.random()) ;
		return number;
	}
}
