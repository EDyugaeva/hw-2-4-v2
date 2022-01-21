package pro.sky.javacourse2.hw24;


public interface EmployeeService {
    String addEmployee(Employee employee) throws EmployeeArrayIndexOutOfBounds;
    String removeEmployee(Employee employee) throws EmployeeArrayIndexOutOfBounds;
    Employee findEmployee(Employee employee) throws EmployeeNotFoundException;


}
