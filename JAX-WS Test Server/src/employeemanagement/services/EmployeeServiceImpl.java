package employeemanagement.services;

import employeemanagement.domain.Employee;

import javax.jws.WebService;

@WebService
public class EmployeeServiceImpl  implements IEmployeeService

{
    @Override
    public Employee getEmployeeById(String id) {
        return new Employee("1","Solaiman Jalili");
    }
}
