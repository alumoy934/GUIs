import javax.swing.*;
import java.awt.*;

public class PruebaDibujo {

    public static void main(String[] args) {

        marcoConDibujos ventana = new marcoConDibujos();
    }
}

class marcoConDibujos extends JFrame{

    public marcoConDibujos(){
        setTitle("Prueba de dibujo");
        setSize(400, 400);
        setVisible(true);
        setLocation(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        laminaConFiguras lamina = new laminaConFiguras();
        add(lamina);
    }

}

class laminaConFiguras extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);  //con esta linea le decimos que haga su trabajo original. Si no lo ponemos sólo hará nuestra linea siguiente.
        g.drawRect(50,50,100,100);
        g.drawLine(100,100,300,200);
        g.drawArc(50,100,100,200,120,150);
    }
}
