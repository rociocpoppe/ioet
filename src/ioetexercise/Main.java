package ioetexercise;

public class Main {

    public static void main (String [] args){

        String path="src/resources/employeesSchedule.txt";
        Reader reader=new Reader(path);
        Company company=reader.readContent();
        for(Employee e: company.getEmployees()){
            System.out.println(e);
        }
    }
}
