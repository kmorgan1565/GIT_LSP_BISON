package howard_lsp_assignments.org.howard.edu.lsp.assignment5;

import java.util.*;

class IntegerSetException extends Exception{

}
public class IntegerSet {
	private ArrayList<Integer> list = new ArrayList<>();

	public IntegerSet(ArrayList list) {
		this.list=list;
	}

public void clear(){	//clears internal representation
	list.clear();
}

public int length() {  //returns length of set
	return list.size();
	
}

public boolean equals(IntegerSet b) { //checks if 2 list are equal, returns true or false
	ArrayList<Integer>list2 = b.list;
	
	if(list.size()!=list2.size()) {
		return false;
	}
	ArrayList<Integer> temp1=list;		//sorts and goes through list by value to check if they are all the same
	ArrayList<Integer> temp2 =list2;
	
	Collections.sort(temp1);
	Collections.sort(temp2);
	
	for(int i=0;1<temp1.size();i++) {  
		if(temp1.get(i)!=temp2.get(i)) {
			return false;
		}
	}
	
	
	return true;
}
	
public int largest() throws IntegerSetException{	//return largest item, throws exception if list is empty
	if(list.size()==0) {
		IntegerSetException e = new IntegerSetException();
		throw e;
	}
	int max=0;
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i)>max) {
			max=list.get(i);
		}
		
	}
	
	return max;
	
}


public int smallest()throws IntegerSetException{	//return largest item, throws exception if list is empty
	if(list.size()==0) {
		IntegerSetException e = new IntegerSetException();
		throw e;
	}
	
	int min = Integer.MAX_VALUE;
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i)<min) {
			min=list.get(i);
		}
	}

	return min;
}


public void addItem(int item){	//adds item to list if it is not in there already, otherwise do nothing
	boolean exist = false;
	
	for(int i=0;i<list.size();i++) {
		
		if(list.get(i)==item) {
			exist = true;
			
		}
	}
	if(exist==false) {
		list.add(item);
	}
}
	

public void removeItem(int item) {	//removes item from list if it is there, otherwise do nothing
	for(int i=0;i<list.size();i++) {
		if(list.get(i)==item) {
			list.remove(i);
		}
	}
}


public IntegerSet union(IntegerSet list2) {	//return the union of 2 sets
	
	ArrayList<Integer>temp=list2.getlist();
	
	Set<Integer>set = new HashSet<>();
	set.addAll(list);
	set.addAll(temp);
	
	ArrayList<Integer>list3 = new ArrayList<>(set);
	IntegerSet list4 = new IntegerSet(list3);
	
	return list4;
			
}


public IntegerSet intersection(IntegerSet list2) {	//return the intersection of 2 sets
	
	ArrayList<Integer>temp = list2.getlist();
	
	list.retainAll(temp);
	
	IntegerSet list4 = new IntegerSet(list);
	
	return list4;
}


public IntegerSet diff (IntegerSet list2) {	//return the difference of 2 sets
	
	ArrayList<Integer>temp = list2.getlist();
	

	list.removeAll(temp);
	
	IntegerSet list4 = new IntegerSet(list);
	
	return list4;
}

public ArrayList<Integer> getlist(){
	return list;
}

	
	public void complement(IntegerSet intSeta) {  	//find complement of sets
		for (int i =0; i < intSeta.length(); i++) {
			int item = intSeta.list.get(i);
			list.remove(Integer.valueOf(item));
		}
	}
	
	public boolean isEmpty() {		//return true if set is empty, false otherwise
		return list.isEmpty();
	}
	
	public String toString() {		//return string representation of set
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i < list.size() - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}

