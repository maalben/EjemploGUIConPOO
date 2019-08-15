package menu;

import opciones.operacionesmatematicas.OperacionesMatematicas;

import javax.swing.*;

public class Menu extends JFrame {
    private JPanel menuprincipal;
    private JButton operacionesMatematicasButton;

    public Menu(){
        add(menuprincipal);
        setTitle("Menu principal");
        setSize(500, 600);
        operacionesMatematicasButton.addActionListener(e -> {
                OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
                operacionesMatematicas.setVisible(true);
                esconderVentana();
        });
    }

    private void esconderVentana(){
        this.dispose();
    }

}
