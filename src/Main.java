import java.util.List;

public class Main {

    public static void main(String[] args) {
        OracleDbConnection dbConnection1 = new OracleDbConnection();
        DatabaseConnection dbConnection2 = new SqlServerDbConnection();

        accessConnection(dbConnection1);
        accessConnection((OracleDbConnection) dbConnection2);

        List<DatabaseConnection> connections = List.of(dbConnection1, dbConnection2);

        for (DatabaseConnection connection : connections) {
            System.out.println(connection);
        }

        connections.forEach(connection -> {
                    System.out.println(connection);
                }
        );
    }

    static void accessConnection(OracleDbConnection dbConnection) {

    }
}
