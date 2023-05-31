package lip.deb;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Traverse {
	
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		
		for( Integer num : al) {
			System.out.println(num);
		}
	}
	

}
