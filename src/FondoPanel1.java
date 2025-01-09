import javax.swing.*;
import java.awt.*;

public class FondoPanel1 extends JPanel{

    private Image imagen1;

    public FondoPanel1(String rutaImagen){
        this.imagen1 = new ImageIcon(rutaImagen).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen1,0,0,getWidth(),getHeight(),this);
    }
}
