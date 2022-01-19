package com.basics.solid.liskovsubstitution.corrected;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrincipleDemo {
    public static void main(String[] args){
        List<IEmployee> employeeList = new ArrayList<>();
        employeeList.add(new ContractorEmployee(343));
        employeeList.add(new FullTimeEmployee(232));
        employeeList.add(new PartTimeEmployee(232));

        for(IEmployee emp: employeeList){
            System.out.println("Minimum Salary of Employee"+emp.getMinimumSalary());
        }
    }
}
