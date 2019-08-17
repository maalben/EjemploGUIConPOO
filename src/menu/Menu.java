package menu;

import opciones.operacionesmatematicas.OperacionesMatematicas;

import javax.swing.*;
import java.awt.*;

public class Menu extends Frame {
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
