import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JPasswordField txtMK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("HỆ THỐNG QUẢN LÝ BÁN LẺ ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(87, 68, 158, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(87, 120, 158, 13);
		contentPane.add(lblMtKhu);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setBounds(207, 60, 254, 33);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		txtMK = new JPasswordField();
		txtMK.setBounds(207, 112, 254, 33);
		contentPane.add(txtMK);
		
		JButton btnNewButton = new JButton("ĐĂNG NHẬP HỆ THỐNG");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE xử lý ở đây
				// Ta viết vào một CT con
				XuLyDangNhap();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(207, 177, 254, 51);
		contentPane.add(btnNewButton);
	}
	
	void XuLyDangNhap () { // Code ở đây
		// Lây dứ liệu người dùng nhập
		String ten = txtTenDangNhap.getText();
		String mk = txtMK.getText();
		// Xử lý
		if ( ten.equals("63CNTT") && mk.equals("123")) {
			// hiện màn hình chính
			ManHinhChinh f = new ManHinhChinh();
			f.setVisible(true);
			// ẩn mà hìn login
			this.setVisible(false);
		}else { // báo lỗi đăng nhập
			JOptionPane hopThongBao = new JOptionPane();
			hopThongBao.showMessageDialog(this, "Đăng nhập thất bại. Vui lòng đăng nhập lại");
		}
	}

}
