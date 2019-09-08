import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	
	private JTextField textField;
	private JTextField textField_1;
	
	double firstnum,secondnum,result;
	String operations;
	String answer;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	
		
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 330, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 318, 61);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnNewButton.setBounds(6, 130, 65, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		button.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button.setBounds(70, 131, 65, 51);
		frame.getContentPane().add(button);
		
		
		JButton button2 = new JButton("9");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		button2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button2.setBounds(132, 131, 65, 51);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("/");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+"/");
				operations = "/";
			}
		});
		button3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button3.setBounds(192, 131, 69, 51);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("C");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		button4.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button4.setBounds(265, 130, 59, 52);
		frame.getContentPane().add(button4);
		
		JPanel panel = new JPanel();
		panel.setBounds(434, 262, -14, 10);
		frame.getContentPane().add(panel);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_1.setBounds(6, 181, 65, 52);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		button_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_2.setBounds(70, 181, 65, 52);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		button_3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_3.setBounds(132, 181, 65, 52);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("*");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+"*");
				operations = "*";
			}
		});
		button_4.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_4.setBounds(196, 181, 65, 52);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton(" ");
		button_5.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_5.setBounds(259, 181, 65, 52);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		button_6.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_6.setBounds(6, 234, 65, 52);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		button_7.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_7.setBounds(70, 234, 65, 52);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("3");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		button_8.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_8.setBounds(132, 234, 65, 52);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+"-");
				operations = "-";
			}
		});
		button_9.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_9.setBounds(196, 234, 65, 52);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(" ");
		button_10.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_10.setBounds(259, 234, 65, 52);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(6, 285, 65, 52);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		button_12.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_12.setBounds(70, 285, 65, 52);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton(" ");
		button_13.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_13.setBounds(132, 285, 65, 52);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+"+");
				
				
				
				operations = "+";
				
			}
		});
		
		button_14.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_14.setBounds(196, 285, 65, 52);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton(" = ");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"=");
				
				String answer;
				String n1 = textField.getText();
				String n2 = n1.substring (2 , (4 - 1));
				secondnum = Double.parseDouble(n2);
				if (operations=="+") {
					result = firstnum+secondnum;
					answer = String.format("%.2f", result);
					textField_1.setText(answer);
				}
				else if (operations =="-") {
					result = firstnum-secondnum;
					answer = String.format("%.2f", result);
					textField_1.setText(answer);
				}
				else if (operations =="*") {
					result = firstnum*secondnum;
					answer = String.format("%.2f", result);
					textField_1.setText(answer);
				}
				else if (operations =="/") {
					result = firstnum/secondnum;
					answer = String.format("%.2f", result);
					textField_1.setText(answer);
				}
				
			}
		});
		button_15.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_15.setBounds(259, 285, 65, 52);
		frame.getContentPane().add(button_15);
		
		textField_1 = new JTextField();
		
		
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBounds(6, 57, 318, 61);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
