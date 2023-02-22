package ioetexercise;

import java.util.ArrayList;

public class Company {

    String name;
    ArrayList <Employee> employees;

    public Company() {
        this.employees=new ArrayList<>();  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }


    public ArrayList<Arc> getSameSchedules( DirectedGraph <?>graph){
        ArrayList <String> schedule= new ArrayList<>();
        ArrayList <Arc> arcos= new ArrayList<>();
        ArrayList<String> vertices=graph.getVertexes();
        Employee employee=this.getEmployees().get(0);
        Employee anotherEmployee;
        for(int i=0; i<vertices.size();i++){
            int aux=i+1;
            if(aux>=vertices.size()){
                anotherEmployee=this.getEmployees().get(0);
            }else{
                anotherEmployee=this.getEmployees().get(aux);
            }
            if(employee!=anotherEmployee){
                schedule.addAll(employee.getSameSchedule(anotherEmployee));
                    if(schedule.size()!=0){
                                    Arc arc= new Arc();
                                    arc.setOriginVertex(employee.getName());
                                    arc.setDestinationVertex(anotherEmployee.getName());
                                    arc.setValue(schedule.size());
                                    schedule=new ArrayList<>();
                                    arcos.add(arc);
                                    System.out.println(arc.getDestinationVertex() +" - "+ arc.getOriginVertex() + "= " + arc.getValue());
                    }
            }
            employee=anotherEmployee;
        }
        return arcos;
    }

}

