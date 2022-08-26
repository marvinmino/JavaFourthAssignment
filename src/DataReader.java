import java.sql.SQLException;

public interface DataReader {
    boolean HasNew() throws SQLException;
    Person ReadNext() throws SQLException;
}
