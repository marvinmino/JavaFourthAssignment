import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        try{
            DbReader dbReader = new DbReader();
            FileReader fileReader = new FileReader("C:\\Users\\marvi\\IdeaProjects\\secondAssigment\\src\\file.txt");
            PerformCalculations calculator= new PerformCalculations();

            System.out.println("File Calculations: ");
            calculator.Perform(fileReader);

            System.out.println("Database Calculations: ");
            calculator.Perform(dbReader);

        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (SQLException e){
            System.out.println("There was an error with the database");
        }
        catch (Exception e){
            System.out.printf("There was an error with the system");
        }
    }
}
