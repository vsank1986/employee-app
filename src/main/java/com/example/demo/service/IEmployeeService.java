package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.data.models.Employee;
import com.example.demo.data.payloads.request.EmployeeRequest;
import com.example.demo.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

@Component
public interface IEmployeeService {

	MessageResponse createEmployee(EmployeeRequest employeeRequest);
	Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest);
	void deletEmployee(Integer employeeId);
	Employee getAsSingleEmployee(Integer employeeId);
	List<Employee> getAllEmployees();

}
