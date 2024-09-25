public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        if(db.equals(db2)) {
            System.out.println("Database is equal");
        }
        else {
            System.out.println("Database is not equal");
        }
    }
}