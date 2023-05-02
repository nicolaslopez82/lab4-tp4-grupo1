package ejercicios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class zEjercicio1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField textFechaNac;
	private JButton btnMostrar;

	public zEjercicio1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// labels
		final JLabel lblMostrar = new JLabel("");
		final JLabel lblNombre = new JLabel("Nombre");
		final JLabel lblApellido = new JLabel("Apellido");
		final JLabel lblTelefono = new JLabel("Telefono");
		final JLabel lblFechaNac = new JLabel("Fecha de Nacimiento");
		final JLabel lblDatos = new JLabel("Los datos ingresados fueron: ");
		// jtext
		final JTextField txtNombre = new JTextField();
		setBounds(100, 100, 665, 439);
		setTitle("Contactos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNombre.setBounds(29, 26, 56, 16);
		contentPane.add(lblNombre);

		lblApellido.setBounds(29, 65, 56, 16);
		contentPane.add(lblApellido);

		lblTelefono.setBounds(29, 104, 56, 16);
		contentPane.add(lblTelefono);

		lblFechaNac.setBounds(29, 147, 141, 16);
		contentPane.add(lblFechaNac);

		lblDatos.setBounds(12, 211, 185, 29);
		contentPane.add(lblDatos);

		txtNombre.setBounds(108, 23, 116, 22);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setBounds(108, 62, 116, 22);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(108, 101, 116, 22);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);

		textFechaNac = new JTextField();
		textFechaNac.setBounds(182, 144, 116, 22);
		contentPane.add(textFechaNac);
		textFechaNac.setColumns(10);

		btnMostrar = new JButton("Mostrar");

		btnMostrar.setBounds(241, 179, 97, 25);
		contentPane.add(btnMostrar);

		lblMostrar.setBounds(182, 210, 410, 29);
		contentPane.add(lblMostrar);
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtNombre.getText().isEmpty() || txtNombre.getText() == "") {
					txtNombre.setBackground(Color.red);
				} else {
					txtNombre.setBackground(Color.white);
				}
				if (txtApellido.getText().isEmpty() || txtApellido.getText() == "") {
					txtApellido.setBackground(Color.red);
				} else {
					txtApellido.setBackground(Color.white);
				}
				if (txtTelefono.getText().isEmpty() || txtTelefono.getText() == "") {
					txtTelefono.setBackground(Color.red);
				} else {
					txtTelefono.setBackground(Color.white);
				}
				if (textFechaNac.getText().isEmpty() || textFechaNac.getText() == "") {
					textFechaNac.setBackground(Color.red);
				} else {
					textFechaNac.setBackground(Color.white);
				}

				if (!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty()
						&& !txtTelefono.getText().isEmpty() && !textFechaNac.getText().isEmpty()) {
					lblMostrar.setText(txtNombre.getText() + " " + txtApellido.getText() + ", " + txtTelefono.getText()
							+ ", " + textFechaNac.getText());
					txtNombre.setText("");
					txtNombre.setBackground(Color.white);
					;
					txtApellido.setText("");
					txtApellido.setBackground(Color.white);
					;
					txtTelefono.setText("");
					txtTelefono.setBackground(Color.white);
					;
					textFechaNac.setText("");
					textFechaNac.setBackground(Color.white);
					;

				}
				else {
					lblMostrar.setText(null);
				}
			}
		});
	}
}
