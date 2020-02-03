import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Practica_entornos {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica_entornos window = new Practica_entornos();
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
	public Practica_entornos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSuma = new JButton("SUMA");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String num = textField.getText(); 
			String num2 = textField_1.getText();
			
			int num0 = Integer.parseInt(num);
			int num1 = Integer.parseInt(num2);
			
			int suma =num0 + num1;
			
			String sum = String.valueOf(suma);
			textField_2.setText(sum);
			}

			private JTextField setText(int suma) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnSuma.setBounds(35, 233, 114, 25);
		frame.getContentPane().add(btnSuma);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("El programa ha terminado");
				System.exit(0);
			}
		});
		btnSalir.setBounds(297, 233, 114, 25);
		frame.getContentPane().add(btnSalir);
		
		textField = new JTextField();
		textField.setBounds(25, 64, 124, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(25, 122, 124, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSumador = new JLabel("SUMADOR");
		lblSumador.setBounds(170, 12, 163, 40);
		frame.getContentPane().add(lblSumador);
		
		JLabel lblNumero = new JLabel("NUMERO 1");
		lblNumero.setBounds(180, 66, 101, 15);
		frame.getContentPane().add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("NUMERO 2");
		lblNumero_1.setBounds(180, 122, 138, 19);
		frame.getContentPane().add(lblNumero_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(35, 202, 124, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
