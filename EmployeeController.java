package pro.sky.javacourse2.hw24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping( "/add")
    public String getEmployee(@RequestParam String firstName,
                              @RequestParam String lastName) throws NoPlaceForEmployee {
        Employee employee = new Employee(firstName, lastName);
       return employeeService.addEmployee(employee);


    }
    @GetMapping( "/remove")
    public String removeEmployee(@RequestParam String firstName,
                              @RequestParam String lastName) throws NoPlaceForEmployee {
        Employee employee = new Employee(firstName, lastName);
        return employeeService.removeEmployee(employee);


    }

    @GetMapping( "/find")
    public Employee findEmployee(@RequestParam String firstName,
                              @RequestParam String lastName) throws NoEmployeeException {
        Employee employee = new Employee(firstName, lastName);
        return employeeService.findEmployee(employee);


    }



}