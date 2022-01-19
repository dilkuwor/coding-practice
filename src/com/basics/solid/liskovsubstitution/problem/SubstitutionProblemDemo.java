//package com.basics.solid.liskovsubstitution.problem;
//
//import com.sun.xml.internal.ws.wsdl.writer.document.Part;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SubstitutionProblemDemo {
//    public static void main(String[] args) throws Exception {
//        Employee fullTime = new FullTimeEmployee(343);
//        Employee contractor = new ContractorEmployee(343);
//        Employee partTimeEmployee = new PartTimeEmployee(343);
//
//        List<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(fullTime);
//        employeeList.add(contractor);
//        employeeList.add(partTimeEmployee);
//        for(Employee e: employeeList){
//            System.out.println("Employee Bonus is:"+e.calculateBonus());
//        }
//    }
//}
