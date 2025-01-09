/**
 * Aquí se programará la ventana de ingreso.
 * Elementos que debe tener:
 * Imágenes fitness y color.
 * Bienvenida.
 * Campo de texto donde el usuario debe escribir su nombre.
 * Campo de texto para escribir clave de administrador o instructor.
 * Botón que permita pasar a la siguiente pantalla.
 * Al pie, algún tipo de mensaje.
  */

import javax.swing.* ;
import java.awt.event.* ;
import java.awt.* ;
import java.util.Objects;

public class INGRESO extends JFrame implements ActionListener{
    private JButton botón_de_ingreso ;
    private JTextField textField_nombre_de_usuario, textField_clave ;
    private JLabel label_nombre_de_usuario, label_clave, label_bienvenida, label_mensaje, label_marca; //Es posible agregar más.
    public static String ingreso_nombre_usuario = "";
    public static String ingreso_clave = "";

    public INGRESO(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        ImageIcon imagen = new ImageIcon("images/e861ed4728dbd52f3c44ad3b488d0e64.jpg");

        label_nombre_de_usuario = new JLabel("Nombre de usuario");
        label_nombre_de_usuario.setBounds(180,180,300,30);
        label_nombre_de_usuario.setFont(new Font("Andale Mono", 3, 18));
        label_nombre_de_usuario.setForeground(new Color(255,255,255));
        add(label_nombre_de_usuario);

        textField_nombre_de_usuario = new JTextField();
        textField_nombre_de_usuario.setBounds(140,210,255,25);
        textField_nombre_de_usuario.setBackground(new Color(224,224,224));
        textField_nombre_de_usuario.setFont(new Font("Andale Mono", 1, 14));
        textField_nombre_de_usuario.setForeground(new Color(0,0,0));
        add(textField_nombre_de_usuario);

        botón_de_ingreso = new JButton("Ingresar");
        botón_de_ingreso.setBounds(210,280,100,30);
        botón_de_ingreso.setBackground(new Color(255,255,255));
        botón_de_ingreso.setFont(new Font("Andale Mono", 1, 14));
        botón_de_ingreso.setForeground(new Color(0,0,0));
        botón_de_ingreso.addActionListener(this);
        add(botón_de_ingreso);

    }

    public void actionPerformed( ActionEvent evento){
        if (evento.getSource() == botón_de_ingreso) {

            }
    }

    public static void main(String args[]) {
        INGRESO ingreso = new INGRESO();
        ingreso.setBounds(0,0,525,580);
        ingreso.setVisible(true);
        ingreso.setResizable(false);
        ingreso.setLocationRelativeTo(null);
    }
}

/*
    public ProyectoFinal1() {
        marca = new JLabel(imagen);
        marca.setBounds(25,15,300,150);
        add(marca);



        orden = new JLabel("Ingrese su nombre");
        orden.setBounds(45,212,200,30);
        orden.setFont(new Font("Andale Mono", 1, 12));
        orden.setForeground(new Color(255,255,255));
        add(orden);

        TCCC = new JLabel("©2017 The Coca-Cola Company");
        TCCC.setBounds(85,375,300,30);
        TCCC.setFont(new Font("Andale Mono", 1, 12));
        TCCC.setForeground(new Color(255,255,255));
        add(TCCC);
    }

    ingreso_nombre = nombre_de_usuario.getText().trim();
            if (ingreso_nombre.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            } else {
                ProyectoFinal2 proyectoFinal2 = new ProyectoFinal2();
                proyectoFinal2.setBounds(0,0,660,360);
                proyectoFinal2.setVisible(true);
                proyectoFinal2.setResizable(false);
                proyectoFinal2.setLocationRelativeTo(null);
                this.setVisible(false);
                }
}
 */