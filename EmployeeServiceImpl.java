package pro.sky.javacourse2.hw24;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Employee[] employeesMassive = {
            new Employee("Ivan", "Ivanov"),
            new Employee("Алексей", "Алексеев"),
            new Employee("Пахлава", "Иванова")
    };


    public String addEmployee(Employee employee) throws EmployeeArrayIndexOutOfBounds {
        for (int i = 0; i < employeesMassive.length; i++) {
            if (employeesMassive[i] == null) {
                employeesMassive[i] = employee;
                return "Сотрудник " + employee.getFirstName() + " " + employee.getLastName() + " добавлен в ячейку " + i;
            }
        }
        throw new EmployeeArrayIndexOutOfBounds();
    }

    @Override
    public String removeEmployee(Employee employee) throws EmployeeArrayIndexOutOfBounds {
        for (int i = 0; i < employeesMassive.length; i++) {
            if (employeesMassive[i].equals(employee)) {
                employeesMassive[i] = null;
                return "Сотрудник " + employee.getFirstName() + employee.getLastName() + " удален";
            }
        }
        throw new EmployeeNotFoundException();

    }

    @Override
    public Employee findEmployee(Employee employee) throws EmployeeNotFoundException {
        for (int i = 0; i < employeesMassive.length; i++) {
            if (employeesMassive[i].equals(employee)) {
                return employee;
            }
        }

            throw new EmployeeNotFoundException();
    }

}


