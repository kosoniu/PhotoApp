package com.photoapp.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotNull(message = "First Name cannot be null")
    @Size(min = 2, message = "Name is to short")
    private String firstName;

    @NotNull(message = "Last Name cannot be null")
    @Size(min = 2, message = "Last name is to short")
    private String lastName;

    @NotNull(message = "Password cannot be null")
    @Size(min = 5, max = 12, message = "Password must have between 5 - 12 characters")
    private String password;

    @NotNull(message = "Email cannot be null")
    @Email
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
