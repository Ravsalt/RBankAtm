class User {
    private String username;
    private String password;
    private double balance;  // Changed from String to double

    public User() {
        username = "Nikko";
        password = "12345";
        balance = 100000;  // Initial balance as a double
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {  // Returns balance as a double
        return balance;
    }

    public void setBalance(double balance) {  // Accepts balance as a double
        this.balance = balance;
    }
}
