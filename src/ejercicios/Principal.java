package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEjercicio2.setBounds(155, 76, 104, 25);
		contentPane.add(btnEjercicio2);
		
		JLabel lblGrupoNro = new JLabel("GRUPO NRO: 1");
		lblGrupoNro.setBounds(78, 12, 100, 15);
		lblGrupoNro.setVerticalAlignment(SwingConstants.TOP);
		lblGrupoNro.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblGrupoNro);
		
		JButton btnbtnEjercicio1 = new JButton("Ejercicio 1");
		btnbtnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnbtnEjercicio1.setBounds(155, 39, 104, 25);
		contentPane.add(btnbtnEjercicio1);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEjercicio3.setBounds(155, 113, 104, 25);
		contentPane.add(btnEjercicio3);
	}
}
