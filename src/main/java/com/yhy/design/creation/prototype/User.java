package com.yhy.design.creation.prototype;

public class User implements Cloneable{
    private String userName;
    private Integer age;
    private String telNum;

    public User() {
        System.out.println("调用User构造器");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", telNum='" + telNum + '\'' +
                '}';
    }

    //Object clone()就是原型模式的应用
    @Override
    public User clone() throws CloneNotSupportedException {
        /*User user = new User();
        user.setUserName(this.userName);
        user.setAge(this.age);
        user.setTelNum(this.getTelNum());
        return user;*/
        return (User) super.clone();
    }
}
