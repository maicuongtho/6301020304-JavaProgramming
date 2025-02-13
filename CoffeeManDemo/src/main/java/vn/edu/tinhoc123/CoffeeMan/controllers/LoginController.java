package vn.edu.tinhoc123.CoffeeMan.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import vn.edu.tinhoc123.CoffeeMan.services.EmployeeService;
import vn.edu.tinhoc123.CoffeeMan.models.Employee;
import vn.edu.tinhoc123.CoffeeMan.repositories.EmployeeRepositoryImpl;

import java.util.Optional;

public class LoginController {

    @FXML
    private TextField usernameField;  // Trường nhập tên người dùng

    @FXML
    private PasswordField passwordField;  // Trường nhập mật khẩu

    private EmployeeService employeeService;

    // Khởi tạo EmployeeService
    public LoginController() {
        this.employeeService = new EmployeeService(new EmployeeRepositoryImpl());
    }

    // Phương thức xử lý đăng nhập
    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Kiểm tra đăng nhập
        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Thông báo", "Tên người dùng và mật khẩu không được để trống.", AlertType.ERROR);
            return;
        }

        // Xác thực thông tin người dùng thông qua EmployeeService
        Optional<Employee> employeeOptional = employeeService.authenticate(username, password);
        employeeOptional.ifPresentOrElse(employee -> {
            // Thành công: chuyển sang màn hình chính hoặc thực hiện hành động nào đó
            System.out.println("Đăng nhập thành công! Người dùng: " + employee.getUsername());
            // Bạn có thể chuyển màn hình tại đây nếu dùng JavaFX
        }, () -> {
            // Thất bại: hiển thị thông báo lỗi
            showAlert("Thông báo", "Sai tên người dùng hoặc mật khẩu.", AlertType.ERROR);
        });
    }

    // Phương thức hiển thị thông báo
    private void showAlert(String title, String message, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
