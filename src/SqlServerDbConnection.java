public class SqlServerDbConnection extends OracleDbConnection implements DatabaseConnection{

    @Override
    public void connect() {
        System.out.println("Menggunakan SQL Server");
    }

    @Override
    public String toString() {
        return "Sql Server";
    }
}
