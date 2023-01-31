package syntax_and_structure;

public class Records {

    /*
    POJOs - plain old java objects
    a simple data class with only fields
    great modeling simple domain classes
    getter and setter are under the covers
    immutable, fields are final and value cannot be changed once initialized
     */

    public record Account(int id, int customerId, String type, double balance) {

        public static void main(String[] args) {
            Account account = new Account(123, 1212, "SAVINGS", 5000.00);
            double balance = account.balance();
            System.out.println(balance);
        }

        public double balance() {
            return balance;
        }

    }
}
