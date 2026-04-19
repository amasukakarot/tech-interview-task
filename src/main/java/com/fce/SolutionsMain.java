package com.fce;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SolutionsMain {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Employee> employees = mapper.readValue(
                    new File("src/main/resources/company_data.json"),
                    new TypeReference<List<Employee>>() {}
            );

            System.out.println("Successfully loaded " + employees.size() + " employees");
            System.out.println(employees);
        } catch (IOException error) {
            System.err.println(error.getMessage());
            error.printStackTrace();;
        }
    }

    /**
     * CHALLENGE 1: Total Salary (Aggregation)
     * Calculate the sum of all salaries in the list
     */
    public int getTotalSalary(List<Employee> employees) {
        return 0.0;
    }

    /**
     * CHALLENGE 2: Filter by Department
     * Return a list of employees who work in the specific department
     */
    //IMPLEMENT HERE

    /**
     * CHALLENGE 3: Find the highest paid (Search)
     * Find the employee with the highest salary
     */
    public Optional<Employee> getHighestPaidEmployee(List<Employee> employees) {
        return Optional.empty();
    }

    /**
     * CHALLENGE 1: Total Salary (Aggregation)
     * Calculate the sum of all salaries in the list
     */
    public Map<String, List<Employee>> groupEmployeesByRole(List<Employee> employees) {
        return Map.of();
    }

    /**
     * CHALLENGE 5: Average experience
     * Calculate the average years of experience for all employees
     */
    //IMPLEMENT HERE
}