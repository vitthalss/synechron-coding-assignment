package com.synechron;

public class Employee {
	 
    private String name;
    private String account;
    private Integer age;
 
    public Employee(String name, String account, Integer age) {
        super();
        this.name = name;
        this.account = account;
        this.age = age;
    }
 
    @Override
    public String toString() {
 
        return "name: "+ this.name +" | account: "+ this.account +" | age: "+this.age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAccount() {
        return account;
    }
 
    public void setAccount(String account) {
        this.account = account;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
}
