package com.atguigu.pojo;

public class Employee {
    private Integer eid;
    private String empName;
    private Character sex;
    private Integer age;
    private String phone;

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(Integer eid, String empName, Character sex, Integer age, String phone) {
        this.eid = eid;
        this.empName = empName;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
