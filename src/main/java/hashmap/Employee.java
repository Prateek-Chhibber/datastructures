package hashmap;

import java.util.HashMap;

public class Employee {

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    private String empName;
    private String empAddress;
    private int empId;

    public Employee(){
        Employee emp = new Employee();
    }

    HashMap<Object, String> empMap = new HashMap<Object, String>();



}
