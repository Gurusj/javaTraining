package org.example;

public class Details {
    String firstName;
    String lastName;
    String gender;
    String country;
    Integer age;
    String date;
    Integer id;

    public Details(String firstName, String lastName, String gender, String country, Integer age, String date, Integer id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.country = country;
        this.age = age;
        this.date = date;
        this.id = id;
    }

    //getter() methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public Integer getAge() {
        return age;
    }

    public String getDate() {
        return date;
    }

    public Integer getId() {
        return id;
    }

    //setter()
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Details{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", date='" + date + '\'' +
                ", id=" + id +
                '}';
    }
}
