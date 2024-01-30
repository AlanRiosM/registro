import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro {
    private JLabel titulo;
    private JTextField textNombres;
    private JTextField textUsuario;
    private JTextField textCorreo;
    private JPasswordField textContrasena;
    private JPasswordField textConfirmarContrasena;
    private JButton registrarButton;
    private JButton iniciarSesionButton;
    public JPanel panelRegistro;

    public Registro() {
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombres = textNombres.getText();
                String usuario = textUsuario.getText();
                String correo = textCorreo.getText();
                String contrasena = textContrasena.getText();
                String confirmarContrasena = textConfirmarContrasena.getText();
                // Verificar si las contraseñas coinciden
                if (contrasena.equals(confirmarContrasena)) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }
            }
        });
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameInicioSesion = new JFrame("Inicio de Sesión");
                frameInicioSesion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameInicioSesion.setSize(400, 200);
                frameInicioSesion.setVisible(true);
            }
        });
    }
}
