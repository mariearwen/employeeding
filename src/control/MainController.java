package control;

import model.Employee;

import javax.swing.*;

public class MainController {

    private Employee e;

    public MainController(){
        e = new Employee();
    }

    public void setEmployeeName(String n){ e.setName(n); }
    public String getEmployeeName(){ return e.getName(); }
    public void setGender (Object g){ e.setGender(g); }
    public String getGender() {return e.getGender(); }
    public void setBranch(String b) {e.setBranch(b); }
    public String getBranch() { return e.getBranch(); }
    public void setPosition(String p) {e.setPosition(p);}
    public String getPosition() {return e.getPosition();}
    public void setSalary (String s) {e.setSalary(s);}
    public String getSalary () { return e.getSalary();}
}