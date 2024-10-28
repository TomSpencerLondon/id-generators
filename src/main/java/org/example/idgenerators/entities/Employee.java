package org.example.idgenerators.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {
//    @TableGenerator(name="employee_gen", table="id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 100)
    @GenericGenerator(name = "emp_id", strategy = "org.example.idgenerators.entities.CustomRandomIDGenerator")
    @GeneratedValue(generator = "emp_id")
    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
