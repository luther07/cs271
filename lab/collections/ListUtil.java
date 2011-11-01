package cs271.lab.collections;

import java.util.List;

public class ListUtil <T extends Comparable<T>> {
	
	public T findMax(List<T> myList) {
		
		T max = mylist.get(0);
			for(T current:myList) {
				if(current.compareTo(max)>0) {
				max=current;
		}
			}
return max;
	}}

	
//	public Comparable findMax(List myarray) {
//		Comparable max = (Comparable)myarray.get(0);
//			for(Object currentObject: myarray) {
//				Comparable current = (Comparable) currentObject;
//			if(current.compareTo(max)>0) {
//				max=current;
//			}
//			}
//		return max;
//	}
//}
