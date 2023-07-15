package com.atguigu.pojo;

public class Book {
    private Integer id;
    private String name;
    private Double price;

    public Book() {
        System.out.println("生命周期1：bean对象创建");
    }

    public Book(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("生命周期2：依赖注入");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public void initMethod(){
        System.out.println("生命周期4：初始化");
    }
    public void destroyMethod(){
        System.out.println("生命周期6：销毁");
    }
}
