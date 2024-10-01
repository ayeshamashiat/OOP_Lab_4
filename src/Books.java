import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Books {
    public void booksRead(){ //
        String line = "";
        int booksCnt = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("E:\\3rd Semester Labs\\OOC - II\\Lab 1\\task1\\Goodreads.csv"))) {

            while ((line = br.readLine()) != null){
                booksCnt++;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        // Output the result
        System.out.println("Books read: " + booksCnt);
    }