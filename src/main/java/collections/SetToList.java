package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetToList {

	public static void main(String[] args) {

		Set<String> cmp = new LinkedHashSet<String>();

		cmp.add("KLA");
		cmp.add("Amazon");
		cmp.add("Paypal");
		cmp.add("Microsoft");

		for (String string : cmp) {
			System.out.println(string);
		}
		
		List<String> lst = new ArrayList<String>();		
		lst.addAll(cmp);

		// Sort alphabetic
		Collections.sort(lst);
		System.out.println(lst);
		for (int i =lst.size()-1; i >=0; i--) {
			System.out.println(lst.get(i));
		}
}
}