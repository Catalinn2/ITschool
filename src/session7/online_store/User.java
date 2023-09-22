package session7.online_store;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {
    private UUID userUd;
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String email;
    private boolean isMajor;
    private String password;
    private LocalDateTime birthday;
    private LocalDateTime createAt;

    public UUID getUserUd() {
        return userUd;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean isMajor() {
        return isMajor;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setUserUd(UUID userUd) {
        this.userUd = userUd;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMajor(boolean major) {
        isMajor = major;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userUd=" + userUd +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", isMajor=" + isMajor +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", createAt=" + createAt +
                '}';
    }
}


