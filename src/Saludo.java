import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class Saludo extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String JoptionShowMessage = null;
	private JPanel contentPane;
	private JTextField txtCambioEnRama;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludo frame = new Saludo();
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
	public Saludo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Saludo");
		btnNewButton.setBounds(159, 69, 157, 66);
		btnNewButton.setFont(new Font("Vivaldi", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "Hola a todos";
				JOptionPane.showMessageDialog(null, message);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Saludos desde mi rama");
		btnNewButton_1.setBounds(100, 197, 297, 78);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "Hola estas en tu rama";
				JOptionPane.showMessageDialog(null, message);
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		contentPane.add(btnNewButton_1);
		
		txtCambioEnRama = new JTextField();
		txtCambioEnRama.setText("Cambio en rama");
		txtCambioEnRama.setBounds(35, 94, 102, 55);
		contentPane.add(txtCambioEnRama);
		txtCambioEnRama.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Segunda rama");
		btnNewButton_2.setBounds(167, 157, 202, 23);
		contentPane.add(btnNewButton_2);

	}
}
