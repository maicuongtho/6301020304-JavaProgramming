module vn.edu.tinhoc123.CoffeeMan {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;
	
//    opens vn.edu.tinhoc123.CoffeeMan to javafx.fxml;
    opens vn.edu.tinhoc123.CoffeeMan.controllers to javafx.fxml;
    exports vn.edu.tinhoc123.CoffeeMan;
}
