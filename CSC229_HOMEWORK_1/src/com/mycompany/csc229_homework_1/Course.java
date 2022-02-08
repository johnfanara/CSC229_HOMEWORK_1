package com.mycompany.csc229_homework_1;

public class Course {
    int ID, code;
    String name;
    
    // default constructor
    public Course(){
        ID = 0;
        name = "";
        code = 0;
    }
    // overloaded constructor
    public Course(int numID, String userName, int numCode){
        ID = numID;
        name = userName;
        code = numCode;
    }
    // setters and getters for all data members
    public void setID (int numID){
        ID = numID;
    }
    public void setName (String userName) {
        name = userName;
    }
    public void setCode (int numCode) {
        code = numCode;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getCode() {
        return code;
    }
    public static void main (String[] args) {
        Course course1 = new Course(1138, "John", 42);
        System.out.println("ID: " + course1.getID());
        System.out.println("Name: " + course1.getName());
        System.out.println("Code: " + course1.getCode());
    }
}