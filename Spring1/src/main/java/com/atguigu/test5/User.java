package com.atguigu.test5;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Integer balance;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public User(Integer id, String name, Integer age, Integer balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public User() {
    }
}
