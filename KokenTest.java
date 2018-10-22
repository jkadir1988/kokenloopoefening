package Loops;

import java.util.ArrayList;
import java.util.List;

public class KokenTest {

	public static void main(String[] args) {
		List<String> gerechten = new ArrayList();
		gerechten.add("Nasi goreng");
		gerechten.add("Saté");
		gerechten.add("Gado-Gado");
		gerechten.add("Sambal");
		gerechten.add("Bami");
		gerechten.add("Rendang");
		gerechten.add("Tjap-Toi");
		gerechten.add("Ayam pedis");
		
		System.out.println("====for loop====");
		for (int lijst = 0 ; lijst < gerechten.size(); lijst++) {
			System.out.println(gerechten.get(lijst));
		}
		System.out.println();
		System.out.println("====enhanced for loop====");
		for (String element : gerechten) {
			System.out.println(element);
		}
		System.out.println();
		System.out.println("====for each loop====");
		gerechten.forEach(gerecht -> System.out.println("Ik ga vanavond "+ gerecht + " koken"));
		
	}
}