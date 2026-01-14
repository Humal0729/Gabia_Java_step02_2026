package chapter14.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Mycompare implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return (o1.compareToIgnoreCase(o2)*-1);
	}
}

public class TreeSetMain02 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new Mycompare());
		
		set.add("aaa");
		set.add("zzz");
		set.add("ggg");
		set.add("kkk");
		set.add("ccc");

		System.out.println(set);

	}

}
