package org.example.setterinjection;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

public class Employee {
    private int empId;
    private String empName;
    private String empCity;

    private List<String> mobile;

    private Map<String, String> course;
    private static final Logger logger = Logger.getLogger(App.class);

    public Employee(int empId, String empName, String empCity, List<String> mobile, Map<String, String> course) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
        this.mobile = mobile;
        this.course = course;
    }

    public void setMobile(List<String> mobile) {
        logger.info("setting mobile numbers....");
        this.mobile = mobile;
    }

    public Employee() {
        super();
    }

    public void setEmpId(int empId) {
        logger.info("setting employee id....");
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        logger.info("setting employee name....");
        this.empName = empName;
    }

    public void setEmpCity(String empCity) {
        logger.info("setting employee city....");
        this.empCity = empCity;
    }

    public void setCourse(Map<String, String> course) {
        logger.info("setting employee courses....");
        this.course = course;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                ", mobile=" + mobile +
                ", course=" + course +
                '}';
    }
}
