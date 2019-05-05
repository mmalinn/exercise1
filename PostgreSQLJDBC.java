import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLJDBC {

        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("localhost:5432/Exercise1",
                            "postgres", "");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Database opened successfully");
}


