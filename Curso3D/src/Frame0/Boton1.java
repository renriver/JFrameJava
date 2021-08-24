package Frame0;
import javax.swing.*;
/**
 *
 * @author rivera
 */
public class Boton1 extends JFrame{
    Boton1(){
    setTitle("Boton1");
    //crear un componente boton
    JButton boton=new JButton("Clic");
     //agregar el boton al frame
     add(boton);
    setSize(300,100);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String a[]){
     new Boton1();
    }
}
