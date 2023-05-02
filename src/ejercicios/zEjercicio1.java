package ejercicios;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Contactos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(29, 26, 56, 16);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(29, 65, 56, 16);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(29, 104, 56, 16);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento");
		lblFechaNac.setBounds(29, 147, 141, 16);
		contentPane.add(lblFechaNac);
		
		JLabel lblDatos = new JLabel("Los datos ingresados fueron: ");
		lblDatos.setBounds(12, 211, 180, 29);
		contentPane.add(lblDatos);
		
		txtNombre = new JTextField();
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
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMostrar.setBounds(241, 179, 97, 25);
		contentPane.add(btnMostrar);
		
	}
}
