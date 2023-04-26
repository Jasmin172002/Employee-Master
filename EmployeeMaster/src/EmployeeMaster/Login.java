package EmployeeMaster;

import java.awt.EventQueue;

import javax.swing.JFrame;


import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class Login implements ActionListener {
    
    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    Login(HashMap<String, String> loginInfoOriginal){
        
        logininfo = loginInfoOriginal;
    
    }
    
    private JFrame frame;
    private JPanel panel;
    private JLabel title;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JLabel registerButton;
    private JTextField textField;
    private JPasswordField passwordField;
    
    
    public Login() {
        
        
        
        frame = new JFrame("MotorPH");
        frame.setBounds(500, 200, 800, 820);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
       
        panel = new JPanel();
        panel.setForeground(new Color(255, 255, 255));
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        JLabel label = new JLabel("");
        label.setBounds(0, 0, 0, 0);
        panel.add(label);

        frame.getContentPane().add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 786, 783);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(363, 283, 199, 32);
        panel_1.add(textField);
        textField.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(363, 351, 199, 32);
        panel_1.add(passwordField);
        
         
         
         title = new JLabel("MotorPH");
         title.setBounds(309, 163, 271, 49);
         panel_1.add(title);
         title.setFont(new Font("Tahoma", Font.BOLD, 30));
         title.setForeground(new Color(128, 0, 0));
         
                 userLabel = new JLabel("Username:");
                 userLabel.setBounds(237, 283, 100, 25);
                 panel_1.add(userLabel);
                 userLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
                 userLabel.setForeground(new Color(0, 0, 0));
                 
                 
                 passwordLabel = new JLabel("Password:");
                 passwordLabel.setBounds(237, 351, 100, 25);
                 panel_1.add(passwordLabel);
                 passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
                 passwordLabel.setForeground(new Color(0, 0, 0));
                 
                         loginButton = new JButton("Login");
                         loginButton.setBounds(342, 428, 75, 25);
                         panel_1.add(loginButton);
                         loginButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
                         loginButton.setForeground(new Color(128, 0, 0));
                         loginButton.setBackground(new Color(255, 255, 255));
                         loginButton.addActionListener(this);
                         loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                         
                         
                         registerButton = new JLabel("Create an account!");
                         registerButton.setBounds(314, 473, 150, 25);
                         panel_1.add(registerButton);
                         registerButton.setForeground(new Color(0, 0, 0));
                         registerButton.setFont(new Font("Tahoma", Font.BOLD, 14));
                         registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.setVisible(true);    
        
    }
    
    
    public void actionPerformed(ActionEvent ae) {
        String username = textField.getText();
        String password = new String(passwordField.getPassword());
        
        logininfo = new HashMap<>();
        logininfo.put("Admin","admin" );
        logininfo.put("Admin","123456" );
        
                
                 
                 if (logininfo.containsKey(username) && logininfo.get(username).equals(password)) {
                
                	EmployeeMaster em = new EmployeeMaster();
     				em.frame.setVisible(true);
     				frame.dispose();
                
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
                
                
    
        
        
             
    public static void main(String[] args) {
        new Login();
    }
}


    
