import javax.swing.*;
import java.awt.*;

public class escribiendoEnMarco {

    public static void main(String[] args) {

        marcoConTexto ventana = new marcoConTexto();

    }
}

class marcoConTexto extends JFrame{
    
    public marcoConTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(500, 300);
        setTitle("Primer Texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lamina milamina = new lamina(); // instanciamos la lámina para que la ponga en el frame
        add(milamina); // nos pone la lámina sobre el frame
    }
}

//Creamos la lámina que pondremos en el frame
class lamina extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);  //con esta linea le decimos que haga su trabajo original. Si no lo ponemos sólo hará nuestra linea siguiente.
        g.drawString("Estamos a prendiendo swing", 50, 50);
    }
}

