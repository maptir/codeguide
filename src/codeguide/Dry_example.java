package codeguide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Practice fix DRY code.
 * 
 * @author Archawin Tirugsapun
 *
 */
public class Dry_example {
	static List<String> countryList;

	// TODO Change all code that DRY.
	public static void main(String[] args) {
		countryList = new ArrayList<>();
		countryList.add("Thailand");
		countryList.add("Singapore");
		countryList.add("Laos");
		Collections.sort(countryList);
		printCountry("asd");
	}

	public static void sortCountry() {
		Collections.sort(countryList);
	}

	public static boolean isCountry(String country) {
		return countryList.contains(country);
	}

	public static void printCountry(String country) {
		if (countryList.contains(country))
			System.out.println("Country: " + country);
		else
			System.out.printf("Not have country %s in the list", country);
	}

}
