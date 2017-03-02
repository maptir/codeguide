package codeguide;

import java.util.List;

/**
 * Practice remove YAGNI code.
 * 
 * @author Archawin Tirugsapun
 *
 */
public class Yagni_example {
	static String serie;
	static List<String> serieList;
	static int serieEp;

	// TODO remove all YAGNI code if this class prefer to do only in this main.
	public static void main(String[] args) {
		serie = "The Blacklist";
		serieEp = 10;
		System.out.println(serie + " " + serieEp);
		nextEp();
		System.out.println(serie + " " + serieEp);
	}

	public String getMovie() {
		return serie;
	}

	public static void nextEp() {
		serieEp++;
	}

	public static void previousEp() {
		serieEp--;
	}
}
