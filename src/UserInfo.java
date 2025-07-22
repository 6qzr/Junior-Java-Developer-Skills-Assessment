public class UserInfo {
    // Create these variables with proper access modifiers
    // - name (String)
    private String name;
    // - age (int)
    private int age;
    // - email (String)
    private String email;
    // - isActive (boolean)
    private boolean isActive;
    // Create constructor that takes all parameters
    public UserInfo(String name, int age, String email, boolean isActive) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }
    // Create getter and setter methods for all variables

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Create a method that displays user info nicely formatted
    public void displayInfo() {
        // Print user information in a nice format
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("email: " + email);
        System.out.println("isActive: " + isActive + "\n");
    }
    // Main method for testing
    public static void main(String[] args) {
        // Create 3 different users
        UserInfo mohammedInfo = new UserInfo("Mohammed", 22, "mohammed@email.com", true);
        UserInfo omarInfo = new UserInfo("Omar", 19, "omar@hotmail.com", false);
        UserInfo HibaInfo = new UserInfo("Hiba", 7, "pinkyHiba@icloud.com", true);
        // Display their information
        mohammedInfo.displayInfo();
        omarInfo.displayInfo();
        HibaInfo.displayInfo();
        // Test your getters and setters
        mohammedInfo.setName("MohammedAlAbri");
        mohammedInfo.setAge(23);
        mohammedInfo.setEmail("moha.abri@gmail.com");
        mohammedInfo.setActive(false);
        System.out.println("getName Test: " + mohammedInfo.getName());
        System.out.println("getAge Test: " + mohammedInfo.getAge());
        System.out.println("getEmail Test: " + mohammedInfo.getEmail());
        System.out.println("isActive Test: " + mohammedInfo.isActive());
    }
}
