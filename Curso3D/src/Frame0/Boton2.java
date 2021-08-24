package Frame0;
import javax.swing.*;
/**
 *crear una frame 300,300
 * crear un boton pxX100,pxY100, ancho 100px, alto 30px
 * layout
 * @author rivera
 */
public class Boton2 extends JFrame{
    Boton2(){
    setTitle("Boton2");
    setLayout(null);//administrador de componentes/diseño
    JButton boton=new JButton("Aceptar");
    JButton boton1=new JButton("Cancelar");
    //dimension boton
    //setBounds(ejeX,ejeY,pxAncho,pixAlto)
    //setBounds(intX,intY,intW,intH);
    boton.setBounds(100, 100, 100, 30);
    boton1.setBounds(100,50,100,30);
    //agregar el boton al frame
    add(boton);
    add(boton1);
    setVisible(true);
    setSize(300,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String a[])
    {
    new Boton2();
    }
}
