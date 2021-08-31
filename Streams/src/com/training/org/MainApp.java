package com.training.org;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class MainApp {
    public static void main (String[] args){
        Employee employeeOne = new Employee(1,"ankit",28,34000,"ASE","HR");
        Employee employeeTwo = new Employee(2,"balaji",30,38000,"SE","ADMIN");
        Employee employeeThree = new Employee(3,"sharan",37,56000,"SSE","IT");
        Employee employeeFour = new Employee(4,"pradeep",47,56000,"manager","IT");
        Employee employeeFive= new Employee(5,"yathish",24,27000,"ASE","HR");
        Employee employeeSix = new Employee(6,"ajit",25,34000,"ASE","HR");

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employeeOne);
        employeeList.add(employeeTwo);
        employeeList.add(employeeThree);
        employeeList.add(employeeFour);
        employeeList.add(employeeFive);
        employeeList.add(employeeSix);

       // System.out.println("********************IntStream range method example*************");
        //IntStream.range(1,10).forEach(System.out::println);
       /* System.out.println("group by department");
        Map<String, List<Employee>> filteredDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(filteredDept);
        System.out.println("*********************************");
        System.out.println("group by salary");
        Map<Double, List<Employee>> filteredSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(filteredSalary);
        System.out.println("*********************************");
        System.out.println("group by department name manager");
        boolean filteredByDeptName=employeeList.stream().noneMatch((e->e.getJobTitle()=="hello"));
        System.out.println(filteredByDeptName);
        System.out.println("*********************************");*/
        Optional<Employee> emp=employeeList.stream().filter(e->e.getJobTitle().equals("ASE")).findAny();
        System.out.println(emp);




    }
}
