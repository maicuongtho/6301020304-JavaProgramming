package vn.edu.tinhoc123.CoffeeMan.models;

import java.util.Objects;

public class Employee {
    private int id;                // Mã nhân viên
    private String name;           // Tên nhân viên
    private String position;       // Chức vụ (nhân viên, quản lý, ...)
    private double salary;         // Lương
    private String phoneNumber;    // Số điện thoại liên lạc
    private String email;          // Email liên lạc
    private boolean isActive;      // Trạng thái (đang làm việc hay đã nghỉ việc)
    private String username;       // Tên đăng nhập
    private String password;       // Mật khẩu (có thể mã hóa)
    private String idCardNumber;   // Số căn cước công dân
 
    // Constructor không tham số
    public Employee() {}

    // Constructor đầy đủ tham số
    public Employee(int id, String name, String position, double salary, String phoneNumber, String email, boolean isActive, String username, String password, String idCardNumber) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isActive = isActive;
        this.username = username;
        this.password = password;
        this.idCardNumber = idCardNumber;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }


    // Phương thức kiểm tra đăng nhập
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // Phương thức toString để hiển thị thông tin nhân viên
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                ", username='" + username + '\'' +
                ", idCardNumber='" + idCardNumber + '\'' +
                '}';
    }

    // Phương thức so sánh 2 nhân viên theo ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
