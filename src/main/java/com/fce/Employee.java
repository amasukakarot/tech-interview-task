package com.fce;

public record Employee(
        String name,
        String department,
        String role,
        double salary,
        int yearsOfExperience
) {}
