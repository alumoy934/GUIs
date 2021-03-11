import javax.swing.*;
import java.awt.*;

public class creandoMarcos {

    public static void main(String[] args) {

        miMarco ventana1 = new miMarco();
    }

}

class miMarco extends JFrame{

    public miMarco(){
       // setSize(500,300);
        //setLocation(500,300);
        setBounds(500,300,500,300);
        //setResizable(false);

        //setExtendedState(Frame.MAXIMIZED_BOTH); //hace que la ventana se abra a pantalla completa
        setTitle("Versión 1.0");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
