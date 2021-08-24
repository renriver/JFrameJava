package Frame0;
import javax.swing.*;
/**
 *crear un jframe o marco 200,100 pixeles
 * agregar un boton
 * @author rivera
 */
public class Boton0 extends JFrame{
   //JButton
    JButton boton;
    Boton0(){
        //super("");
    //colocar el titulo en jframe
    setTitle("Mi boton");
    //crear el boton 
    //boton=new JButton();//crea un boton sin cadena y sin icono
      boton=new JButton("PRESIONA");//Crea un boton con un cadena de texto
      add(boton);//agregar el boton al frame    
//configuracion
    setVisible(true);
    setSize(300,100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String a[]){
    new Boton0();
    }
}
