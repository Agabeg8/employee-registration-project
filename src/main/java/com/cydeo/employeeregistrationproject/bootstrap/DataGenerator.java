package com.cydeo.employeeregistrationproject.bootstrap;

import com.cydeo.employeeregistrationproject.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {


    private static List<Employee> employeeList = new ArrayList<>();

    public static void saveEmployee(Employee employee){
        employeeList.add(employee);
    }

    public static List<Employee> readAllEmployee(){
        return employeeList;
    }
    public static List<String> getAllStates(){

        return Arrays.asList(

                "Budapest",
                "Berlin",
                "Tokyo",
                "Delhi",
                "Ashgabat",
                "London",
                "Bratislava",
                "Paris",
                "Madrid",
                "Istanbul",
                "Amsterdam",
                "New York",
                "Moscow",
                "Oslo",
                "Warsaw",
                "Rome",
                "Prague"

        );
    }
}
