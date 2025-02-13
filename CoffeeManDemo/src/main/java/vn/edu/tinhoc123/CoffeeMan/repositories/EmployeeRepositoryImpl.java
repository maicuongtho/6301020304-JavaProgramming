package vn.edu.tinhoc123.CoffeeMan.repositories;

import vn.edu.tinhoc123.CoffeeMan.Utils.DBConnect;
import vn.edu.tinhoc123.CoffeeMan.models.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private Connection connection;

    // Constructor để khởi tạo kết nối cơ sở dữ liệu thông qua DBConnect
    public EmployeeRepositoryImpl() {
        // Sử dụng DBConnect để tạo kết nối
        this.connection = DBConnect.getConnection("coffeemanbytiiltutors", "root", "");  // Thay thế thông tin kết nối phù hợp
    }

    @Override
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employees (name, position, salary, phone_number, email, username, password, id_card_number, id_card_image) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getPosition());
            statement.setDouble(3, employee.getSalary());
            statement.setString(4, employee.getPhoneNumber());
            statement.setString(5, employee.getEmail());
            statement.setString(6, employee.getUsername());
            statement.setString(7, employee.getPassword());
            statement.setString(8, employee.getIdCardNumber());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        String sql = "UPDATE employees SET name = ?, position = ?, salary = ?, phone_number = ?, email = ?, " +
                     "username = ?, password = ?, id_card_number = ?, id_card_image = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getPosition());
            statement.setDouble(3, employee.getSalary());
            statement.setString(4, employee.getPhoneNumber());
            statement.setString(5, employee.getEmail());
            statement.setString(6, employee.getUsername());
            statement.setString(7, employee.getPassword());
            statement.setString(8, employee.getIdCardNumber());
            statement.setInt(9, employee.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        String sql = "SELECT * FROM employees WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Employee employee = mapRowToEmployee(resultSet);
                return Optional.of(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Employee employee = mapRowToEmployee(resultSet);
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public boolean usernameExists(String username) {
        String sql = "SELECT COUNT(*) FROM employees WHERE username = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private Employee mapRowToEmployee(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("id"));
        employee.setName(resultSet.getString("name"));
        employee.setPosition(resultSet.getString("position"));
        employee.setSalary(resultSet.getDouble("salary"));
        employee.setPhoneNumber(resultSet.getString("phone_number"));
        employee.setEmail(resultSet.getString("email"));
        employee.setUsername(resultSet.getString("username"));
        employee.setPassword(resultSet.getString("password"));
        employee.setIdCardNumber(resultSet.getString("id_card_number"));
        return employee;
    }
    
    @Override
    public Optional<Employee> authenticate(String username, String password) {
        String sql = "SELECT * FROM employees WHERE username = ? AND password = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username);
            statement.setString(2, password); // Mật khẩu có thể mã hóa trước khi lưu và so sánh

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Employee employee = mapRowToEmployee(resultSet);
                return Optional.of(employee); // Trả về người dùng nếu tìm thấy
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty(); // Không tìm thấy người dùng hoặc sai mật khẩu
    }

}
