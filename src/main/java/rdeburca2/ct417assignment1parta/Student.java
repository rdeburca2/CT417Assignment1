/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdeburca2.ct417assignment1parta;

/**
 *
 * @author Rumhann de Burca
 */

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Student {
    
    private String name;
    private int age;
    private int id;
    private DateTime dob;
    private DateTimeFormatter dateTimeFor = DateTimeFormat.forPattern("dd/mm/yyyy");
    
    
public Student(String name, int age, int id, DateTime dob)
{
    this.setName(name);
    this.setAge(age);
    this.setId(id);
    this.setDob(dob);
}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public void setDateTimeFor(DateTimeFormatter dateTimeFor) {
        this.dateTimeFor = dateTimeFor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public DateTime getDob() {
        return dob;
    }

    public DateTimeFormatter getDateTimeFor() {
        return dateTimeFor;
    }
    
    public String getUsername()
    {
        return this.name + "" + this.age;
    }
    
    @Override
    public String toString()
    {
        return "Student Details: " + this.getName() + " Age: " + this.getAge() + " DOB: " + dateTimeFor.print(this.getDob()) + " ID: " + this.getId() + " UserName: " + this.getUsername() + "\n";
    }

}