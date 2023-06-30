package com.atguigu.pojo;

public class Clazz {
    private Integer classId;
    private String className;

    public Clazz() {
    }

    public Clazz(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                '}';
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
