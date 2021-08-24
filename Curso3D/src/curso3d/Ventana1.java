
package curso3d;
import javax.swing.*;
/**
 *construir un frame pero sin herencia
 * medidad 300 x 100
 * @author rivera
 */
public class Ventana1 {
    public Ventana1(){
    JFrame jf=new JFrame("Ventana2");
    jf.setVisible(true);
    jf.setSize(300,100);
    jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
    public static void main(String a[])
    {
    new Ventana1();
    }
}
