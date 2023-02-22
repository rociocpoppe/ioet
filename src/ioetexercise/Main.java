package ioetexercise;

import java.util.ArrayList;


public class Main {

    public static void main (String [] args){

        String path="src/resources/employeesSchedule.txt";
        Reader reader=new Reader(path);
        Company company=reader.readContent();
        DirectedGraph<?> graph=new DirectedGraph<>();
        ArrayList<Employee>employees2=company.getEmployees();
        for(int i=0; i<employees2.size(); i++){
            Vertex v=new Vertex();
            v.setVertex(employees2.get(i).getName());
            graph.addVertex(v.getVertex());
        }
        company.getSameSchedules(graph);
   

    }
}
