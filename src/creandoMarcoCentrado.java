import javax.swing.*;
import java.awt.*;

public class creandoMarcoCentrado {

    public static void main(String[] args) {

        marcoCentrado ventana1 = new marcoCentrado();

    }
}

class marcoCentrado extends JFrame{

    public marcoCentrado(){

        Toolkit miPantalla = Toolkit.getDefaultToolkit(); //con esto obtenemos nuestro sistema de ventanas nativo. Nuestra pantalla
        Dimension tamanyoPantalla = miPantalla.getScreenSize(); //getScreenSize devuelve un objeto de tipo Dimension. El tamaño de la pantalla primaria.
        int alturaPantalla = tamanyoPantalla.height;
        int anchoPantalla = tamanyoPantalla.width;   //height y width son campos de clase de Dimension

        //setSize(anchoPantalla/2, alturaPantalla/2);
        //setLocation(anchoPantalla/4, alturaPantalla/4);
        setBounds(anchoPantalla/4, alturaPantalla/4,anchoPantalla/2, alturaPantalla/2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setTitle("Versión 1.1");
        //cambiar el icono de la ventana. Usaremos getImage de la clase Toolkit
        Image iconoVentana = miPantalla.getImage("src/icono.png");
        setIconImage(iconoVentana);

    }
}
