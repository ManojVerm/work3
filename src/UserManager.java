class User {
    private int userId;
    private String dateOfBirth;
    private String userName;
    private char gender;
    private String guardianName;

    // Parameterized constructor
    public User(int userId, String dateOfBirth, String userName, char gender, String guardianName) {
        this.userId = userId;
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
        this.gender = gender;
        this.guardianName = guardianName;
    }

    // Getter methods
    public int getUserId() {
        return userId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public String getGuardianName() {
        return guardianName;
    }
}

public class UserManager {
    public void createUser(User user) {
        // Save user details or perform necessary operations
    
        System.out.println("User created successfully!");
    }

    public void showUserDetails(User user) {
        System.out.println("User Details:");
        System.out.println("User ID: " + user.getUserId());
        System.out.println("Date of Birth: " + user.getDateOfBirth());
        System.out.println("Username: " + user.getUserName());
        System.out.println("Gender: " + user.getGender());
        System.out.println("Guardian Name: " + user.getGuardianName());
    }

    public static void main(String[] args) {
        User user1 = new User(1, "2000-01-01", "John Doe", 'M', "Jane Doe");

        UserManager userManager = new UserManager();
        userManager.createUser(user1);
        userManager.showUserDetails(user1);
    }
}


