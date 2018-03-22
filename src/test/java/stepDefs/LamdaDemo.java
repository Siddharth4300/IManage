package stepDefs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 23, 4, 5, 6, 7);
		list.forEach(number -> System.out.println(number));
		
		String s1 = new String("test");
		String s2 = new String("test");
		if(s1==s2)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
