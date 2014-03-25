package anticake;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class AntiCake {
  
    public static void main(String args[]) {
        File homedir = new File("./");
        ArrayList<String> names = new ArrayList<String>(Arrays.asList(homedir.list()));
        int cent = names.size()/100;
        JFrame frame = new JFrame("AntiCake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        frame.add(progressBar);
        frame.pack();
        frame.setVisible(true);
        
        for (int x = 0; x < names.size(); x++) {
            if (names.get(x).startsWith("Cake")) {
                (new File("./" + names.get(x))).delete();
            }
            if ((x % cent) == 0) {
                progressBar.setValue(x/cent);
            }
		}
        
        frame.dispose();
    }
}
