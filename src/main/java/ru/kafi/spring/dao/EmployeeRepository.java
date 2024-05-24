package ru.kafi.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kafi.spring.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByName(String name);
    List<Employee> findAllBySalaryBetween(int min, int max);
}
