import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String fileToRead = "emp.csv"; //specifying filename
        String line=""; //variable to hold each line of scanned csv file
        System.out.println("Reading the file...");
        try (BufferedReader br = new BufferedReader(new FileReader(fileToRead))) {
            
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); //5 values per line
            
                if (values[3].equals("Pune")) { //check city value for Pune
                    System.out.println(values[1]); //print name of employee, if matched
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}