package com.ApiAssignment.restfulapi;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class Employee {

    @Size(min=2,message = "name should have atleast 2 character")
    private int id,age;
    private  String name;
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name=name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
