package employeemanagement.services;
import employeemanagement.domain.Employee;

import javax.jws.WebService;

@WebService // ved at tilføje dette bliver det til en webservice med XML fil. ved hjælp af Javax.jws
public class EmployeeServiceImpl  implements IEmployeeService

{
    @Override
    public Employee getEmployeeById(String id) {
        return new Employee("1","Solaiman Jalili");
    }
}
