package pro.sky.javacourse2.hw24;


public interface EmployeeService {
    public String addEmployee(Employee employee) throws NoPlaceForEmployee;
    public String removeEmployee(Employee employee) throws NoPlaceForEmployee;
    public Employee findEmployee(Employee employee) throws NoEmployeeException;


}
