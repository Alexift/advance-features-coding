package org.example.ex8_first_in_list_sorted;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeSorted implements Comparable<EmployeeSorted>{

    private String name;
    private Integer salary;

    @Override
    public int compareTo(EmployeeSorted o) {
        return Double.compare(o.getSalary(),this.salary);
    }
}
