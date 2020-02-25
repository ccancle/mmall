package com.mmall.pojo;

public class map {
    private Integer Id;
    private String name;
    private String password;
    private String email;
    private Integer number;
    private String address;

    @Override
    public String toString() {
        return "map{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public map(Integer id, String name, String password, String email, Integer number, String address) {
        Id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.number = number;
        this.address = address;
    }
}
