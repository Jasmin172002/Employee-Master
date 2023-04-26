package EmployeeMaster;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class EmployeeMaster {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeMaster window = new EmployeeMaster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeMaster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 200, 800, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MotorPH Payroll");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(306, 10, 340, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee No.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(27, 91, 110, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 224, 786, 13);
		frame.getContentPane().add(separator);
		
		textField = new JTextField();
		textField.setBounds(136, 99, 151, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(27, 132, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 140, 151, 27);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("First Name");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(27, 175, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 183, 151, 27);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(301, 175, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(397, 183, 366, 27);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Birthday");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(301, 91, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(397, 99, 151, 27);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Phone No.");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(301, 132, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(397, 140, 151, 27);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Information");
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(27, 60, 178, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Employee Status");
		lblNewLabel_2_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(27, 235, 178, 21);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Status");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(27, 263, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Position");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(301, 263, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Immediate Supervisor");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_1_1.setBounds(27, 308, 197, 39);
		frame.getContentPane().add(lblNewLabel_1_3_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(136, 271, 151, 27);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(397, 271, 151, 27);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(201, 316, 221, 27);
		frame.getContentPane().add(textField_8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 357, 786, 13);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Government Identification");
		lblNewLabel_2_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(27, 369, 260, 21);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("SSS");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2.setBounds(27, 400, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(101, 408, 151, 27);
		frame.getContentPane().add(textField_9);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Pag-ibig");
		lblNewLabel_1_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_1.setBounds(27, 440, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(101, 449, 151, 27);
		frame.getContentPane().add(textField_10);
		
		JLabel lblNewLabel_1_3_2_2 = new JLabel("Philhealth");
		lblNewLabel_1_3_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_2.setBounds(301, 400, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(397, 408, 151, 27);
		frame.getContentPane().add(textField_11);
		
		JLabel lblNewLabel_1_3_2_2_1 = new JLabel("TIN");
		lblNewLabel_1_3_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_2_1.setBounds(301, 440, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_2_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(397, 448, 151, 27);
		frame.getContentPane().add(textField_12);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 489, 786, 13);
		frame.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Payroll");
		lblNewLabel_2_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1_1_1.setBounds(27, 499, 260, 21);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_1_3_2_3 = new JLabel("Hourly Rate");
		lblNewLabel_1_3_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_3.setBounds(27, 572, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_3);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(136, 580, 151, 27);
		frame.getContentPane().add(textField_13);
		
		JLabel lblNewLabel_1_3_2_3_1 = new JLabel("Basic Salary");
		lblNewLabel_1_3_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_3_1.setBounds(27, 617, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_3_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(136, 625, 151, 27);
		frame.getContentPane().add(textField_14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(137, 541, 150, 21);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_3_2_3_2 = new JLabel("Pay-Period");
		lblNewLabel_1_3_2_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_3_2.setBounds(27, 530, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_3_2);
		
		JLabel lblNewLabel_1_3_2_3_2_1 = new JLabel("Hours Worked");
		lblNewLabel_1_3_2_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_3_2_1.setBounds(27, 661, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_3_2_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(146, 669, 76, 27);
		frame.getContentPane().add(textField_15);
		
		JLabel lblNewLabel_1_3_2_3_3 = new JLabel("Allowance");
		lblNewLabel_1_3_2_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_3_3.setBounds(332, 530, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_3_3);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(429, 542, 151, 27);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(429, 584, 151, 27);
		frame.getContentPane().add(textField_17);
		
		JLabel lblNewLabel_1_3_2_3_3_1 = new JLabel("Deductions");
		lblNewLabel_1_3_2_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_3_3_1.setBounds(332, 576, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_3_3_1);
		
		JLabel lblNewLabel_1_3_2_3_3_2 = new JLabel("Gross Pay");
		lblNewLabel_1_3_2_3_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_3_3_2.setBounds(332, 617, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_3_3_2);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(429, 625, 151, 27);
		frame.getContentPane().add(textField_18);
		
		JLabel lblNewLabel_1_3_2_3_3_2_1 = new JLabel("Net Pay");
		lblNewLabel_1_3_2_3_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2_3_3_2_1.setBounds(332, 661, 110, 39);
		frame.getContentPane().add(lblNewLabel_1_3_2_3_3_2_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(429, 669, 151, 27);
		frame.getContentPane().add(textField_19);
		
		JButton btnNewButton = new JButton("Edit");
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(27, 728, 110, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.setForeground(new Color(128, 0, 0));
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNext.setBounds(650, 728, 110, 33);
		frame.getContentPane().add(btnNext);
	}
}
