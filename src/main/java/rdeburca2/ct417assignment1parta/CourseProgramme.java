/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdeburca2.ct417assignment1parta;

import java.util.Iterator;
import org.joda.time.format.DateTimeFormatter;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;


/**
 *
 * @author Rumhann de Búrca
 */
public class CourseProgramme {
    
    private String courseName;
    private List<Module> modules;
    private DateTime startDate;
    private DateTime endDate;
    private DateTimeFormatter dateTimeFor = DateTimeFormat.forPattern("dd/mm/yyyy");
    
    public CourseProgramme(String courseName, List<Module> modules, DateTime startDate, DateTime endDate) {
        setCourseName(courseName);
        setModules(modules);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public void setdTimeFor(DateTimeFormatter dateTimeFor) {
        this.dateTimeFor = dateTimeFor;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Module> getModules() {
        return modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public DateTimeFormatter getdateTimeFor() {
        return dateTimeFor;
    }
    
    @Override
    public String toString() {
        String moduleInfo = "";

        for (Iterator<Module> it = modules.iterator(); it.hasNext();) {
            Module module = it.next();
            moduleInfo += module.toString();
        }

        return "Course: " + this.getCourseName() + " \nModules: " + moduleInfo + "Start date: " + dateTimeFor.print(this.getStartDate()) + "\nEnd date: " + dateTimeFor.print(this.getEndDate()) + "\n";
    }
}
