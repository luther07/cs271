package cs271.hw.methodsforlists;
import java.util.ArrayList;
import java.util.List;

/*Mark Johnson, HW-4, Recursive and Iterative methods
 * 03/18/2008
 */

public class Lists {
/*Recursive sum method
 * @return sum of the integer values in the list.
 * It works.
 * What does the function do to its arguments: it repeatedly counts the first entry and returns a sublist
 * as the new argument in additional method calls.
 * It is not tail recursive.
 */
	public static int sumRecursive(List<Integer> myList)
	{
		if (myList.size()==0)
			return 0;
		else return first(myList) + sumRecursive(rest(myList));
	}

	public static int count(List<Integer> list) {
		if (list.size()==0)	
			return 0;
		else
			return 1+count(rest(list));
	}
	
	/*Iterative sum method.
	 * @return sum of the integer values in the list.
	 * It works.
	 * It iterates over the argument and counts the data.
	 */
	
	public static int sumIterative(List<Integer>myList){
		int listSum=0;
		int current=0;
		int mySize=myList.size();
		int i=0;
		do{
			current = myList.get(i);
			listSum += current;
			i++;
		}
		while (i<(mySize));
		return listSum;
		}
	
	/*Iterative equal-to method
	 * @return true if two lists are logically equal and false otherwise.
	 * It works.
	 * What does the method do to its arguments: it iterates over the arguments and compares values within
	 * the arguments.
	 */
	static boolean listEqualTo(List<Integer>myList, List<Integer>yourList)
	{
		int mySize=count(myList);
		int yourSize=count(yourList);
		if(mySize!=yourSize){
			return false;
		}

		for(int i =0; i<(mySize-1); i++){
			if(myList.get(i)!=yourList.get(i))
				return false;
			}
		return true;
		}
	
	/*Iterative reverse-list method
	 * @return mutated list, with the elements of the list in reverse order.
	 * It works.
	 * What does the method do to its arguments: it mutates the argument, repeatedly removing the entry
	 * at the end of the list and adding it elsewhere.
	 */
	static List<Integer> reverseIterative(List<Integer>myList)
	{
		int mySize=myList.size();
		int removeInteger=0;
		for(int i=0; i<(mySize-1); i++)
		{
			removeInteger=myList.remove(mySize-1);
			myList.add(i, removeInteger);
		}
		return myList;
	}
	
	/*Recursive reverse list method
	 * @ return a list that is in the reverse order of the list in the argument.
	 * It works.
	 * It sends it's arguments to the helper method. The helper method mutates or makes changes to its
	 * arguments, but that will have no affect on the arguments of the first method.
	 * This method is tail recursive.
	 */
	static List<Integer> reverseRecursive(List<Integer>myList)
	{
		int mySize=count(myList);
		if ((count(myList))==1)
			return myList;
		return reverseHelper(myList, mySize);
	}

	private static List<Integer> reverseHelper(List<Integer> myList, int mySize) {
		if(mySize==0)
			return myList;
		else{
			int i = myList.remove(0);
			myList.add((mySize-1), i);
		}
		return reverseHelper(myList, (mySize-1));		
		}

	/*Recursive equal-to method
	 * @return true if two lists are logically equal and false otherwise.
	 * It works.
	 * What does the method do to its arguments: it repeatedly compares the first entry in the argument's lists
	 * and calls itself with arguments of "rest of list".
	 * The method is not tail recursive.
	 */
	static boolean recursiveListEqualTo(List<Integer>myList, List<Integer>yourList)
	{
		if((count(myList))!=(count(yourList))){
			return false;
		}
		
		if(((count(myList))==0)&&((count(yourList))==0))
			{
			return true;
			}
		
		return (((first(myList))==(first(yourList))) && (recursiveListEqualTo((rest(myList)),rest(yourList))));
		
	}
	
	/*Matt Bone's recursive sum method
	 * 
	 */
	public static int sum(List<Integer> list) {
		if (list.size()==0)	
			return 0;
		else
			return first(list)+sum(rest(list));
	}
	
	public static int first(List<Integer> list) {
		return list.get(0);
	}
	
	public static int last(List<Integer> list) {
		return list.get((count(list))-1);
	}
	
	public static List<Integer> rest(List<Integer> list) {
		return list.subList(1, list.size());
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2); list.add(3); list.add(4);
		
		List<Integer> listto = new ArrayList<Integer>();
		listto.add(1); listto.add(2); listto.add(3); listto.add(4);		
		System.out.println(first(list));
		System.out.println(rest(list));
		System.out.println(rest(rest(list)));
		System.out.println(rest(rest(rest(list))));
		System.out.println(rest(rest(rest(rest(list)))));
		System.out.println(reverseRecursive(list));
		System.out.println(reverseRecursive(list));
		System.out.println("Count: " + count(list));
		System.out.println("Sum: " + sumIterative(list));
		System.out.println("Sum: " + sum(list));
	}
}