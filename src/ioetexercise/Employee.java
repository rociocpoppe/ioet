package ioetexercise;

import java.util.ArrayList;

public class Employee{

    String name;
    ArrayList<String> timetable;

    public Employee() {
        this.timetable=new ArrayList<>();
    }

    public Employee(String name, ArrayList<String> timetable){
        this.name=name;
        this.timetable=new ArrayList<>(timetable);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTimetable() {
        return new ArrayList<>(timetable);
    }

    public void addTimetable(String newTime) {
        this.timetable.add(newTime);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", timetable=" + timetable + "]";
    }
    
    public ArrayList<String> getSameSchedule(Employee anotherEmployee) {
        ArrayList<String> sameSchedule=new ArrayList<>();
        for(String scheduleAnotherEmployee: anotherEmployee.getTimetable()){
            if(this.getTimetable().contains(scheduleAnotherEmployee)){
                sameSchedule.add(scheduleAnotherEmployee);
            }
        }
        return sameSchedule;
    }
   
    
    
    
}

