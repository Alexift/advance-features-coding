package org.example.ex8_first_in_list_sorted;

import java.util.*;

public class FirstInListSorted {

    public static void main(String[] args) {
        List<EmployeeSorted> employees = readEmployees();

        // Display all employees
        System.out.println("List of Employees:");
        employees.forEach(System.out::println);

        try {
            EmployeeSorted firstEmployeeIterative = getFirstEmployeeWithSalaryOverIterative(employees, 30000);
            System.out.println("First employee with salary over 30000 (Iterative): " + firstEmployeeIterative);

            EmployeeSorted firstEmployeeStream = getFirstEmployeeWithSalaryOverStream(employees, 30000);
            System.out.println("First employee with salary over 30000 (Stream): " + firstEmployeeStream);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    // Read employees from input
    public static List<EmployeeSorted> readEmployees() {
        Scanner scanner = new Scanner(System.in);
        List<EmployeeSorted> employees = new ArrayList<>();

        System.out.println("How many employees do you want to add?");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter Name: ");
            scanner.nextLine();  // Consume newline left-over from nextInt()
            String name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            int salary = scanner.nextInt();

            EmployeeSorted employee = new EmployeeSorted(name, salary);
            employees.add(employee);
        }

        // Sort the list automatically using Comparable implementation
        Collections.sort(employees);
        return employees;
    }

    // Iterative approach: Simply return the first element in the sorted list with a salary over threshold
    public static EmployeeSorted getFirstEmployeeWithSalaryOverIterative(List<EmployeeSorted> employees, int threshold) {
        if (!employees.isEmpty() && employees.get(0).getSalary() > threshold) {
            return employees.get(0);
        } else {
            throw new NoSuchElementException("No employee found with salary over " + threshold);
        }
    }

    // Stream approach: Get the first employee in the sorted list with a salary over threshold
    public static EmployeeSorted getFirstEmployeeWithSalaryOverStream(List<EmployeeSorted> employees, int threshold) {
        return employees.stream()
                .filter(e -> e.getSalary() > threshold)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No employee found with salary over " + threshold));
    }
}


