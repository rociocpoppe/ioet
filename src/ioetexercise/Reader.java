package ioetexercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

    String path;

    public Reader(String path) {
    	this.path=path;
    }
 

    public Company readContent(){
        String line = "";
        String contentSplitter=",";
        Company company=new Company();
        try (BufferedReader br = new BufferedReader(new FileReader(this.path))) {
                br.readLine(); 
                while ((line = br.readLine()) != null) {
                    int index=line.indexOf("=");
                    String employeeName=line.substring(0,index);
                    Employee employee=new Employee();
                    employee.setName(employeeName);
                    String timeAux=line.substring(index+1);
                    String []timetable=timeAux.split(contentSplitter);
                    for(String t:timetable){
                        employee.addTimetable(t);
                    }  
                    company.addEmployee(employee);
                }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return company;
    }
    
}

