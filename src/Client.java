

public class Client {

    private static int Id = 0;
    private int id;
    protected String fullName;
    protected String email;
    private String password;
    private BankAccount account;
    protected int age;

    // constructor
    public Client(String fullName, int age , String email, String password) {
        if (age < 18) {
            throw new IllegalArgumentException("The age must be at least 18");
        }
        Id++;
        this.id = Id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    // --- Account ---
    public void addAccount(BankAccount bankAccount) {
        this.account = bankAccount;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    // --- Id (read-only, no setter) ---
    public int getId() {
        return id;
    }

    // --- FullName ---
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // --- Age ---
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("The age must be at least 18");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "client id: " + id + " fullName: " + fullName + " email: " + email + " age: " + age;
    }
}
