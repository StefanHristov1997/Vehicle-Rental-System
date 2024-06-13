package model.entity;

public class Customer {

    private Long id;

    private String name;

    private int age;

    private int driveExperience;

    public Customer(Long id, String name, int age, int driveExperience) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getDriveExperience() {
        return driveExperience;
    }

    private void setDriveExperience(int driveExperience) {
        this.driveExperience = driveExperience;
    }
}
