
package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        if(oldPassword.equals(getPassword())){
            if(isValidPassword(newPassword)){
                setPassword(newPassword);
                System.out.println("Password changed successfully!");
            }
            else{
                System.out.println("Invalid new password! Please ensure it meets all criteria.");
            }
        }
        else{
            System.out.println("Incorrect old password!");
        }
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }

    private boolean isValidPassword(String newPassword) {
        // Check if the new password meets the criteria
        boolean isContain = newPassword.length() >= 8 &&
                newPassword.matches(".*[A-Z].*") &&
                newPassword.matches(".*[a-z].*") &&
                newPassword.matches(".*\\d.*") &&
                newPassword.matches(".*[^a-zA-Z0-9].*");
        return isContain;
    }
}
