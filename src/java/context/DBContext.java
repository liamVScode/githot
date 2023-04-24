package context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://liamdo.database.windows.net:1433;database=HTBooking;user=DoDucLiem@liamdo;password=25893375Gb;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }
    
}
