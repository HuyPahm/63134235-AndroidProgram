package ntu.a63134235;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField he;
	private JTextField we;
	private JTextField ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chiều Cao");
		lblNewLabel.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cân Nặng");
		lblNewLabel_1.setBounds(10, 60, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BMI");
		lblNewLabel_2.setBounds(10, 115, 48, 14);
		contentPane.add(lblNewLabel_2);
		
		he = new JTextField();
		he.setBounds(74, 8, 168, 20);
		contentPane.add(he);
		he.setColumns(10);
		
		we = new JTextField();
		we.setBounds(74, 57, 168, 20);
		contentPane.add(we);
		we.setColumns(10);
		
		ans = new JTextField();
		ans.setEditable(false);
		ans.setEnabled(false);
		ans.setBounds(74, 112, 96, 20);
		contentPane.add(ans);
		ans.setColumns(10);
		
		JButton cal = new JButton("Calculator");
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		cal.setBounds(56, 175, 89, 23);
		contentPane.add(cal);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnClear.setBounds(174, 175, 89, 23);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			}
		});
		btnExit.setBounds(304, 175, 89, 23);
		contentPane.add(btnExit);
	}
}
