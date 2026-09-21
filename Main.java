import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {

            JFrame ventana = new JFrame();
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(600, 400);

            JPanel panelPrincipal =
                    new JPanel(new BorderLayout());

            JPanel titulo = new JPanel();

            JLabel lblTitulo = new JLabel("Registro de productos - Luz de Alina");
            titulo.add(lblTitulo);

            JPanel panelCentral = new JPanel(new GridLayout(4, 2, 10, 10));
            panelCentral.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

            JTextField textNombre = new JTextField();

            textNombre.setText("Ingrese el nombre del producto");

            JComboBox<String> comboCategoria =
                    new JComboBox<>(new String[]{
                            "Velas Aromaticas",
                            "Figuras de Yeso"
                    });

            JRadioButton RbVela = new JRadioButton("Vela");
            JRadioButton RbYeso = new JRadioButton("Yeso");

            ButtonGroup GrupoTipo = new ButtonGroup();
            GrupoTipo.add(RbVela);
            GrupoTipo.add(RbYeso);

            JPanel panelTipo = new JPanel();
            panelTipo.add(RbVela);
            panelTipo.add(RbYeso);

            JCheckBox checkDisponible = new JCheckBox("Disponible para venta");

            checkDisponible.setSelected(false);

            panelCentral.add(new JLabel("Nombre: "));
            panelCentral.add(textNombre);

            panelCentral.add(new JLabel("Categoria: "));
            panelCentral.add(comboCategoria);

            panelCentral.add(new JLabel("Tipo: "));
            panelCentral.add(panelTipo);

            panelCentral.add(new JLabel(""));
            panelCentral.add(checkDisponible);

            JPanel panelBotones = new JPanel();

            JButton botGuardar = new JButton("Guardar");

            JButton botLimpiar = new JButton("Limpiar");

            panelBotones.add(botGuardar);
            panelBotones.add(botLimpiar);

            panelPrincipal.add(titulo, BorderLayout.NORTH);
            panelPrincipal.add(panelCentral, BorderLayout.CENTER);
            panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

            ventana.add(panelPrincipal);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);

        });

    }
}
