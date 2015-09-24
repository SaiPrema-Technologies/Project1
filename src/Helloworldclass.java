import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

public class Helloworldclass {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Helloworldclass window = new Helloworldclass();
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
	public Helloworldclass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(51, 56, 16, 16);
		panel.add(lblTo);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(26, 94, 61, 16);
		panel.add(lblSubject);
		
		JLabel lblAttach = new JLabel("Attach");
		lblAttach.setBounds(26, 131, 41, 16);
		panel.add(lblAttach);
		
		textField = new JTextField();
		textField.setBounds(79, 120, 233, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblBrowse = new JLabel("Browse");
		lblBrowse.setBounds(332, 131, 61, 16);
		panel.add(lblBrowse);
		
		JLabel lblMessage = new JLabel("Message");
		lblMessage.setBounds(16, 159, 61, 16);
		panel.add(lblMessage);
		
		textField_1 = new JTextField();
		textField_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
			}
		});
		textField_1.setBounds(85, 187, 227, 57);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSend = new JLabel("Send");
		lblSend.setBounds(26, 256, 61, 16);
		panel.add(lblSend);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		textField_2.setBounds(80, 47, 233, 35);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(79, 82, 233, 35);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 187, 227, 62);
		panel.add(scrollPane);
	}
}
