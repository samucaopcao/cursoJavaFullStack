package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String text = " alex, curso java, 80, 70, 90, 89";

		String[] valoresArray = text.split(",");

		for (int i = 0; i < valoresArray.length; i++) {
			System.out.println(valoresArray[i]);
		}

		/* Convertendo um Array em uma lista */

		List<String> list = Arrays.asList(valoresArray);

		for (String string : list) {
			System.out.println(string);
		}
		
		/* Convertendo uma Lista para Array */
		
		String[] conversaoArray = list.toArray(new String[6]);
		
		for (int i = 0; i < conversaoArray.length; i++) {
			
			System.out.println(conversaoArray[i]);
		}
	}

}
