package javaii.day2.people;

import java.security.InvalidParameterException;

public class Person {

    public Person(String Name, int age) {
        setName(Name);
        setAge(age);
    }

    private String Name;
    private int age;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        if (Name.length() < 2 || Name.length() > 20) {
            throw new InvalidParameterException("Name must be certain 2-20 characters long ");
        } 
            this.Name = Name;
        

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 150) {
            throw new InvalidParameterException("Age Must Be between 1 and 150");
        } 
            this.age = age;
        
    }
    @Override 
    public String toString(){
        return String.format("%s is %d Y/O", Name, age);
    }
}
