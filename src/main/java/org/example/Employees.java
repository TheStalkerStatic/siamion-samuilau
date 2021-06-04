package org.example;


public class Employees  {

    private String FullName;        //ФИО
    private String Position;        //Должность
    private String Email;           //Мыло
    private String PhoneNumber;     //Номер

    private int Payday;             //Зарплата
    private int Age;                //Возраст

    public Employees(String fullName, String position, String email, String phoneNumber, int payday, int age) {
        FullName = fullName;
        Position = position;
        Email = email;
        PhoneNumber = phoneNumber;
        Payday = payday;
        Age = age;
    }


    public String getFullName() {
        return FullName;
    }

    public String getPosition() {
        return Position;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public int getPayday() {
        return Payday;
    }

    public void setAge(int Age) {
        if (this.Age > Age) {
            System.out.println("Employee can't be younger than it now");
        }
    }

    public int getAge() {
        return Age;
    }
    public void inLine() {
        System.out.println("Employee{" +
                "name='" + FullName + '\'' +
                ", post='" + Position + '\'' +
                ", email='" + Email + '\'' +
                ", phone='" + PhoneNumber + '\'' +
                ", salary=" + Payday +
                ", age=" + Age +
                '}');
    }
}

