import java.io.File; 
import java.util.Scanner; 
import java.util.ArrayList;
public class ReadFile{ 
  public static String[] readFile(String fileName) {

    ArrayList<String> lines = new ArrayList<String>();
        Scanner scan = null;
        try {
            scan = new Scanner(new File(fileName));
            while (scan.hasNext()) {
                lines.add(scan.nextLine());
            }
            String linesArray[] = lines.toArray(new String[lines.size()]);
            return linesArray;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (scan != null)
                scan.close();
        }
        return null;
    }
} 