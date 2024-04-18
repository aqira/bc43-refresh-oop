public class OracleDbConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Menggunakan oracle");
    }

    @Override
    public String toString() {
        return "Oracle";
    }
}
