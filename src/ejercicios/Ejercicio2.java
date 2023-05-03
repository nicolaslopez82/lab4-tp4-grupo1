package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel1.setBounds(41, 21, 242, 139);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota1.setBounds(33, 29, 46, 14);
		panel1.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota2.setBounds(33, 54, 46, 14);
		panel1.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota3.setBounds(33, 79, 46, 14);
		panel1.add(lblNota3);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTps.setBounds(33, 104, 46, 14);
		panel1.add(lblTps);
		
		JComboBox cBoxAprobadoDesaprobado = new JComboBox();
		cBoxAprobadoDesaprobado.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		cBoxAprobadoDesaprobado.setBounds(81, 101, 111, 20);
		panel1.add(cBoxAprobadoDesaprobado);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(81, 26, 111, 20);
		panel1.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(81, 51, 111, 20);
		panel1.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(81, 76, 111, 20);
		panel1.add(txtNota3);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel2.setBounds(41, 187, 242, 95);
		contentPane.add(panel2);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPromedio.setBounds(33, 29, 66, 14);
		panel2.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCondicion.setBounds(33, 54, 66, 14);
		panel2.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setColumns(10);
		txtPromedio.setBounds(109, 26, 111, 20);
		panel2.add(txtPromedio);
		
		txtCondicion = new JTextField();
		txtCondicion.setColumns(10);
		txtCondicion.setBounds(109, 51, 111, 20);
		panel2.add(txtCondicion);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float num1,num2,num3, promedio;
				num1 = Float.parseFloat(txtNota1.getText());
				num2 = Float.parseFloat(txtNota2.getText());
				num3 = Float.parseFloat(txtNota3.getText());
				
				promedio = obtenerPromedio(num1,num2,num3);
				txtPromedio.setText(Float.toString(promedio));
			}

			private float obtenerPromedio(float num1, float num2, float num3) {
				
				float promedio;
				promedio = (num1 + num2 + num3)/3; 
				
				return promedio;
			}


		});
		btnCalcular.setBounds(293, 88, 111, 32);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(293, 131, 111, 32);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(293, 174, 111, 32);
		contentPane.add(btnSalir);
	}
}
