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
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Ejercicio2() {
		final JComboBox cBoxAprobadoDesaprobado = new JComboBox();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 468, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel1 = new JPanel();
		panel1.setBorder(
				new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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

		cBoxAprobadoDesaprobado.setModel(new DefaultComboBoxModel(new String[] { "Aprobado", "Desaprobado" }));
		cBoxAprobadoDesaprobado.setBounds(81, 101, 111, 20);
		cBoxAprobadoDesaprobado.setSelectedIndex(0);
		cBoxAprobadoDesaprobado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newItemSelected = (String) cBoxAprobadoDesaprobado.getSelectedItem();
				if (newItemSelected.equals("Aprobado")) {
					cBoxAprobadoDesaprobado.setSelectedIndex(0);
				} else {
					cBoxAprobadoDesaprobado.setSelectedIndex(1);
				}
			}
		});

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
		panel2.setBorder(
				new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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

				float num1, num2, num3, promedio;
				num1 = Float.parseFloat(txtNota1.getText());
				num2 = Float.parseFloat(txtNota2.getText());
				num3 = Float.parseFloat(txtNota3.getText());

				promedio = obtenerPromedio(num1, num2, num3);
				txtPromedio.setText(Float.toString(promedio));

				/**
				 * Siempre que el TP esté en condición Desaprobado, la condición del alumno es
				 * libre independientemente de las tres notas numéricas obtenidas.
				 */
				if (cBoxAprobadoDesaprobado.getSelectedItem().equals("Desaprobado")) {
					txtCondicion.setText("Libre");
				}

				/**
				 * Si alguna de las tres notas del alumno es inferior a 6, la condición del
				 * alumno es libre independientemente de la nota del TP
				 */
				int nNota1, nNota2, nNota3;
				nNota1 = Integer.parseInt(txtNota1.getText());
				nNota2 = Integer.parseInt(txtNota1.getText());
				nNota3 = Integer.parseInt(txtNota1.getText());
				if (nNota1 < 6 || nNota2 < 6 || nNota3 < 6) {
					txtCondicion.setText("Libre");
				}

				/**
				 * Si la nota de los tres parciales es superior o igual a 8 y el TP se encuentra
				 * aprobado, entonces la condición es promocionado.
				 */
				if (nNota1 >= 8 && nNota2 >= 8 && nNota3 >= 8
						&& cBoxAprobadoDesaprobado.getSelectedItem().equals("Aprobado")) {
					txtCondicion.setText("Promocionado");
				}

				/**
				 * Si los tres parciales se encuentran en el rango de notas entre 6 y 8 y el Tp
				 * se encuentra aprobado, entonces la condición es regular.
				 */
				if (nNota1 >= 6 && nNota1 < 8 && nNota2 >= 6 && nNota2 < 8 && nNota3 >= 6 && nNota3 < 8
						&& cBoxAprobadoDesaprobado.getSelectedItem().equals("Aprobado")) {
					txtCondicion.setText("Regular");
				}
			}

			private float obtenerPromedio(float num1, float num2, float num3) {

				float promedio;
				promedio = (num1 + num2 + num3) / 3;

				return promedio;
			}

		});
		btnCalcular.setBounds(293, 88, 111, 32);
		contentPane.add(btnCalcular);

		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
				cBoxAprobadoDesaprobado.setSelectedIndex(0);
				txtPromedio.setText("");
				txtCondicion.setText("");
			}
		});
		btnNuevo.setBounds(293, 131, 111, 32);
		contentPane.add(btnNuevo);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(293, 174, 111, 32);
		contentPane.add(btnSalir);
	}
}
