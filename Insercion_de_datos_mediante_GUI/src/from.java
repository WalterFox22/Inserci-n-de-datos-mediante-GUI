import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class from {
    public JTextArea Titulo;
    public JTextField b1;
    public JTextField b2;
    public JTextField cedula;
    public JTextField nombre;
    public JButton INGRESO;
    public JTextArea ingresoNombre;
    public JTextArea ingresoCedula;
    public JTextArea ingresoB1;
    public JTextArea ingresoB2;
    public JPanel panel1;


    public from() {
        nombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cedula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        INGRESO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreStr = nombre.getText();
                String cedulaStr = cedula.getText();
                double b1Val = Double.parseDouble(b1.getText());
                double b2Val = Double.parseDouble(b2.getText());

                Estudiante estudiante = new Estudiante(nombreStr, cedulaStr, b1Val, b2Val);
                String url = "jdbc:mysql://localhost:3306/ESTUDIANTE";
                String user = "root";
                String password = "123456";

                // Consulta SQL para la inserción de datos
                String sql = "INSERT INTO estudiante (cedula, nombre, b1, b2) VALUES (?, ?, ?, ?)";

                // Conexión a la base de datos y ejecución de la consulta
                try (Connection connection = DriverManager.getConnection(url, user, password)) {
                    PreparedStatement cadenaPreparada = connection.prepareStatement(sql);

                    // Establecer los valores en la consulta
                    cadenaPreparada.setString(1, estudiante.getCedula());
                    cadenaPreparada.setString(2, estudiante.getNombre());
                    cadenaPreparada.setDouble(3, estudiante.getB1());
                    cadenaPreparada.setDouble(4, estudiante.getB2());
                    cadenaPreparada.executeUpdate();

                    JOptionPane.showMessageDialog(panel1, "Se ha registrado el estudiante");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(panel1, "Error al registrar el estudiante", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
            }
}
