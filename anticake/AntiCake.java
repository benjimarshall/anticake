package anticake;
  
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class AntiCake {
	public static void main(String args[]) {
		File homedir = new File("./");
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(homedir.list()));
		
		for (int x = 0; x < names.size(); x++) {
			if (names.get(x).startsWith("Cake")) {
				(new File("./" + names.get(x))).delete();
			}
		}
	}
}