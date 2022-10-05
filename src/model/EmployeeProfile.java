/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Harshada
 */
public class EmployeeProfile {

    //Declaring required variables
    private String empName;
    private int empId;
    private int age;
    private String gender;
    private String emp_startDate;
    private String emp_level;
    private String emp_teamInfo;
    private String emp_positionTitle;
    private String emp_cellPhoneNo;
    private String emailAddress;
    private String photo;

    //Generated Getter/Setter
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmp_startDate() {
        return emp_startDate;
    }

    public void setEmp_startDate(String emp_startDate) {
        this.emp_startDate = emp_startDate;
    }

    public String getEmp_level() {
        return emp_level;
    }

    public void setEmp_level(String emp_level) {
        this.emp_level = emp_level;
    }

    public String getEmp_teamInfo() {
        return emp_teamInfo;
    }

    public void setEmp_teamInfo(String emp_teamInfo) {
        this.emp_teamInfo = emp_teamInfo;
    }

    public String getEmp_positionTitle() {
        return emp_positionTitle;
    }

    public void setEmp_positionTitle(String emp_positionTitle) {
        this.emp_positionTitle = emp_positionTitle;
    }

    public String getEmp_cellPhoneNo() {
        return emp_cellPhoneNo;
    }

    public void setEmp_cellPhoneNo(String emp_cellPhoneNo) {
        this.emp_cellPhoneNo = emp_cellPhoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return empName;
    }

}
