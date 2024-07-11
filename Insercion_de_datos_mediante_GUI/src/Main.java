import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingreso de notas estudiantes");
        JFrame frame = new JFrame("Registro de Estudiantes");
        from formulario = new from();
        frame.setContentPane(formulario.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.pack();
        frame.setVisible(true);
    }
}
