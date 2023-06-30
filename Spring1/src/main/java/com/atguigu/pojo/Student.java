package com.atguigu.pojo;

import java.util.List;
import java.util.Map;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Clazz clazz;

    private List<Object> hobby;
    private Map<String, Object> teacher;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", clazz=" + clazz +
                ", hobby=" + hobby +
                ", teacher=" + teacher +
                '}';
    }

    public Map<String, Object> getTeacher() {
        return teacher;
    }

    public void setTeacher(Map<String, Object> teacher) {
        this.teacher = teacher;
    }

    public List<Object> getHobby() {
        return hobby;
    }

    public void setHobby(List<Object> hobby) {
        this.hobby = hobby;
    }

    public Student() {
    }

    public Student(Integer id, String name, Integer age, Clazz clazz) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.clazz = clazz;
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

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

}
