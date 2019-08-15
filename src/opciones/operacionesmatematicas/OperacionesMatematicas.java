package opciones.operacionesmatematicas;

import menu.Menu;
import javax.swing.*;

public class OperacionesMatematicas extends JFrame {

    private JPanel operacionesmatematicas;
    private JTextField txtnumero1;
    private JTextField txtnumero2;
    private JButton btnsumar;
    private JButton btnrestar;
    private JButton btnmultiplicar;
    private JButton btndividir;
    private JButton btnsalir;
    private JLabel lblresultado;

    public OperacionesMatematicas(){
        add(operacionesmatematicas);
        setTitle("Opción de Operaciones Matemáticas");
        setSize(500, 600);
        btnsalir.addActionListener(e -> {
                Menu menu = new Menu();
                menu.setVisible(true);
                esconderVentana();
        });
    }

    private void esconderVentana(){
        this.dispose();
    }

}
