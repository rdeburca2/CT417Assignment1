/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdeburca2.ct417assignment1parta;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Rumhann de Búrca
 */
public class Module {
    
    private String moduleName;
    private String moduleID;
    private List<Student> students;
    
    
    public Module(String moduleName, String moduleID, List<Student> students) {
        setModuleName(moduleName);
        setModuleID(moduleID);
        setStudents(students);
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public List<Student> getStudents() {
        return students;
    }
    
    
    @Override
    public String toString() {

        String studentsInfo = "";
        if (students != null) {
            for(int i = 0 ; i > students.size(); i++)
            {
                studentsInfo += students.get(i).toString();
            }
            
        }
        return moduleName + ", " + moduleID + "\n" + studentsInfo + "\n";
    }
}
