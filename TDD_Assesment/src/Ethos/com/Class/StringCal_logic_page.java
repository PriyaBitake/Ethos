package Ethos.com.Class;

import java.util.ArrayList;
import java.util.List;

public class StringCal_logic_page {

	List<Integer> list = new ArrayList<Integer>();

	public int add(String num)  {
		if (num.isEmpty()) {
			return 0;
		}

		String[] number_s = num.split("[,\n]");
		int sum_of_String = 0;
		for (String no_String : number_s) {
			sum_of_String += Integer.parseInt(no_String);
		}

		for (String j : number_s) {

			int numb = Integer.parseInt(j);

			list.add(numb);

		}

		

		return sum_of_String;

	}

}