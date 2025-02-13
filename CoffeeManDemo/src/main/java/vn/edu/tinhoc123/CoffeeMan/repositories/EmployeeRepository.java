package vn.edu.tinhoc123.CoffeeMan.repositories;

import vn.edu.tinhoc123.CoffeeMan.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    // Thêm nhân viên mới vào cơ sở dữ liệu
    void addEmployee(Employee employee);
    
    // Cập nhật thông tin nhân viên
    void updateEmployee(Employee employee);
    
    // Xóa nhân viên theo id
    void deleteEmployee(int id);
    
    // Tìm nhân viên theo id
    Optional<Employee> getEmployeeById(int id);
    
    // Lấy danh sách tất cả nhân viên
    List<Employee> getAllEmployees();
    
    // Kiểm tra tên đăng nhập có tồn tại không
    boolean usernameExists(String username);
    // Thêm phương thức để xác thực đăng nhập
    Optional<Employee> authenticate(String username, String password);
}
