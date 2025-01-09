/**
 * Aquí se programará la ventana de ingreso.
 * Elementos que debe tener:
 * Imágenes fitness y color.
 * Bienvenida.
 * Campo de texto donde el usuario debe escribir su nombre.
 * Campo de texto para escribir clave de administrador o instructor.
 * Botón que permita pasar a la siguiente pantalla.
 * Al pie, algún tipo de mensaje.
 * Falta ver cómo introducir un nuevo usuario.
  */

import javax.swing.* ;
import java.awt.event.* ;
import java.awt.* ;

public class INGRESO extends JFrame implements ActionListener{
    private JButton botón_de_ingreso ;
    private JTextField textField_nombre_de_usuario, textField_clave ;
    private JLabel label_nombre_de_usuario, label_clave, label_bienvenida, label_mensaje, label_marca1, label_marca2, label_marca3;
    public static String ingreso_nombre_usuario = "";
    public static String ingreso_clave = "";


    public INGRESO(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(0,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/43afa1ac52bc59c4b6dafb83af771a9b.jpg")).getImage());//Esto no funciona.
        ImageIcon imagen1 = new ImageIcon("images/i01_43afa1ac52bc59c4b6dafb83af771a9b (1).jpg");
        ImageIcon imagen2 = new ImageIcon("images/i01_b83c04fffb72eaf853faaba65f079737.jpg");
        ImageIcon imagen3 = new ImageIcon("images/i01_1cf97d5618f49a8cc73062e777f3945d.jpg");

        label_bienvenida = new JLabel("Bienvenido al gimnasio GymMaster");
        label_bienvenida.setBounds(120,5,320,30);
        label_bienvenida.setFont(new Font("Andale Mono", 3, 18));
        label_bienvenida.setForeground(new Color(255,0,0));
        add(label_bienvenida);

        label_marca1 = new JLabel(imagen1);
        label_marca1.setBounds(110,40,320,160);
        add(label_marca1);

        label_marca2 = new JLabel(imagen2);
        label_marca2.setBounds(320,390,160,160);
        add(label_marca2);

        label_marca3 = new JLabel(imagen3);
        label_marca3.setBounds(40,390,160,160);
        add(label_marca3);

        label_nombre_de_usuario = new JLabel("Nombre de usuario");
        label_nombre_de_usuario.setBounds(180,200,300,30);
        label_nombre_de_usuario.setFont(new Font("Andale Mono", 3, 18));
        label_nombre_de_usuario.setForeground(new Color(255,0,0));
        add(label_nombre_de_usuario);

        textField_nombre_de_usuario = new JTextField();
        textField_nombre_de_usuario.setBounds(140,230,255,25);
        textField_nombre_de_usuario.setBackground(new Color(255,255,255));
        textField_nombre_de_usuario.setFont(new Font("Andale Mono", 1, 14));
        textField_nombre_de_usuario.setForeground(new Color(255,0,0));
        add(textField_nombre_de_usuario);

        label_clave = new JLabel("Clave");
        label_clave.setBounds(240,270,300,30);
        label_clave.setFont(new Font("Andale Mono", 3, 18));
        label_clave.setForeground(new Color(255,0,0));
        add(label_clave);

        textField_clave = new JTextField();
        textField_clave.setBounds(140,300,255,25);
        textField_clave.setBackground(new Color(255,255,255));
        textField_clave.setFont(new Font("Andale Mono", 1, 14));
        textField_clave.setForeground(new Color(255,0,0));
        add(textField_clave);

        botón_de_ingreso = new JButton("Ingresar");
        botón_de_ingreso.setBounds(210,340,100,30);
        botón_de_ingreso.setBackground(new Color(255,255,255));
        botón_de_ingreso.setFont(new Font("Andale Mono", 1, 14));
        botón_de_ingreso.setForeground(new Color(0,0,0));
        botón_de_ingreso.addActionListener(this);
        add(botón_de_ingreso);

        label_mensaje = new JLabel("Si no tienes ganas de entrenar, entrena sin ganas.");
        label_mensaje.setBounds(40,553,460,22);
        label_mensaje.setFont(new Font("Andale Mono", 3, 18));
        label_mensaje.setForeground(new Color(255,0,0));
        add(label_mensaje);
    }

    public void actionPerformed( ActionEvent evento){
        if (evento.getSource() == botón_de_ingreso) {
            ingreso_nombre_usuario = textField_nombre_de_usuario.getText().trim();
            ingreso_clave = textField_clave.getText().toUpperCase();
            if (ingreso_nombre_usuario.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
                } else if (ingreso_clave.equals("ADM5678")) {
                JOptionPane.showMessageDialog(null, "Bienvenido Administrador " +
                        ingreso_nombre_usuario);// Esto cambiará.
            }
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