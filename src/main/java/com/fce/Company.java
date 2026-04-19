package com.fce;

import java.util.List;

public record Company(
        String name, List<Employee> employees, List<Company> subDepartments
) {
    public Company {
        if (employees == null) employees = List.of();
        if (subDepartments == null) subDepartments = List.of();
    }
}
