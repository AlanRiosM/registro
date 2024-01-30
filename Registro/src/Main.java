import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        Registro registro = new Registro();
        JFrame frame = new JFrame("Registro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(registro.panelRegistro);
        frame.pack();
        frame.setLocationRelativeTo(null);  // Centra la ventana en la pantalla
        frame.setVisible(true);
        });
    }
}