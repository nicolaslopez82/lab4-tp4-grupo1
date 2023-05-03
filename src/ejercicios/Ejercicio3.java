package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JCheckBox chckbxProgramacion;
	private JCheckBox chckbxAdministracion;
	private JCheckBox chckbxDisenio;
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnMac;
	private JRadioButton rdbtnLinux;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Ejercicio 3");
		setBounds(100, 100, 468, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(null, "Elije un sistema operativo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel1.setBounds(41, 148, 350, 127);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		chckbxProgramacion = new JCheckBox("Programacion");
		chckbxProgramacion.setBounds(116, 25, 228, 23);
		panel1.add(chckbxProgramacion);
		
		chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(116, 63, 228, 23);
		panel1.add(chckbxAdministracion);
		
		chckbxDisenio = new JCheckBox("Disenio Grafico");
		chckbxDisenio.setBounds(116, 97, 228, 23);
		panel1.add(chckbxDisenio);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(41, 21, 349, 96);
		panel2.setBorder(new TitledBorder(null, "Elije una especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		ButtonGroup group = new ButtonGroup();
		
		rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(52, 38, 97, 23);
		panel2.add(rdbtnWindows);
		
		rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(151, 38, 67, 23);
		panel2.add(rdbtnMac);
		
		rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(220, 38, 83, 23);
		panel2.add(rdbtnLinux);
		
		group.add(rdbtnWindows );
		group.add(rdbtnMac );
		group.add(rdbtnLinux );
		
		textField = new JTextField();
		textField.setBounds(288, 309, 65, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador:");
		lblCantidadDeHoras.setBounds(73, 312, 267, 14);
		contentPane.add(lblCantidadDeHoras);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String a = "Usted ha seleccionado: ";
				Boolean input1 = false;
				Boolean input2 = false;
				Boolean input3 = false;
				//Get selection from rdbtns 
				if (rdbtnWindows.isSelected()) { a += rdbtnWindows.getText() + " - "; input1 = true;}
				if (rdbtnMac.isSelected()) { a += rdbtnMac.getText() + " - "; input1 = true;}
				if (rdbtnLinux.isSelected()) { a += rdbtnLinux.getText() + " - "; input1 = true;}
			
				
				//Get selection from chkboxes
				if (chckbxDisenio.isSelected()) { a += chckbxDisenio.getText() + " "; input2 = true;}
				if (chckbxProgramacion.isSelected()) { a += chckbxProgramacion.getText() + " "; input2 = true;}
				if (chckbxAdministracion.isSelected()) { a += chckbxAdministracion.getText() + " "; input2 = true;}
				
				
				//Get text from textField
				if(textField.getText() != null && textField.getText().matches("[0-9]+")) { a += " - " + textField.getText() + "hs."; input3 = true;}
				
				//Show message dialog with the selection
				if (input1 == true && input2 == true && input3 == true) JOptionPane.showMessageDialog(null, a);
				else JOptionPane.showMessageDialog(null, "Por favor complete el formulario correctamente");
			}
		});
		btnAceptar.setBounds(339, 343, 89, 23);
		contentPane.add(btnAceptar);
		
		
	}
}
