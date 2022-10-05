/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class EmployeeProfileRecordHistory {

    //Creating Employee Directory
    private static ArrayList<EmployeeProfile> empProfileHistory;

    //Constructor
    public EmployeeProfileRecordHistory() {
        this.empProfileHistory = new ArrayList<EmployeeProfile>();
    }

    //Getter/Setter
    public static ArrayList<EmployeeProfile> getEmpProfileHistory() {
        return empProfileHistory;
    }

    public void setEmpProfileHistory(ArrayList<EmployeeProfile> empProfileHistory) {
        this.empProfileHistory = empProfileHistory;
    }
    
    //Adding new Employees
    public EmployeeProfile addNewRecords() {
        EmployeeProfile newEmp = new EmployeeProfile();
        empProfileHistory.add(newEmp);
        return newEmp;
    }

    //Deletion method
    public void deleteEmployee(EmployeeProfile emp) {
        empProfileHistory.remove(emp);

    }

}
