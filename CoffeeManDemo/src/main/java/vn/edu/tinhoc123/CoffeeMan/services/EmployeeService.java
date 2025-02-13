package vn.edu.tinhoc123.CoffeeMan.services;

import vn.edu.tinhoc123.CoffeeMan.models.Employee;
import vn.edu.tinhoc123.CoffeeMan.repositories.EmployeeRepository;

import java.util.Optional;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Phương thức đăng nhập, sử dụng EmployeeRepository để xác thực thông tin người dùng
    public Optional<Employee> authenticate(String username, String password) {
        return employeeRepository.authenticate(username, password);
    }

    // Các phương thức khác như thêm, sửa, xóa nhân viên có thể được thêm ở đây
}
