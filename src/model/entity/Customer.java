package model.entity;

public class Customer {

    private Long id;

    private String firstName;

    private String lastName;

    private int age;

    private int driveExperience;

    public Customer(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(Long id, String firstName, String lastName, int age, int driveExperience) {
        this(id, firstName, lastName);
        this.age = age;
        this.driveExperience = driveExperience;
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getDriveExperience() {
        return driveExperience;
    }

    private void setDriveExperience(int driveExperience) {
        this.driveExperience = driveExperience;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
