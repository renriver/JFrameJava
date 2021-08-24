package curso3d;

import javax.swing.JFrame;

/**
 *dibujar un Frame 
 * 190821
 * @author rivera
 */
public class Curso3D extends JFrame{

    public Curso3D()
    {
       super("Mi primera ventana");
       //configurar la ventana o frame
       //muestre la pantalla
       setVisible(true);
       //TAMAÑO DE FRAME
       setSize(450,100);
        //CERRAR
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Curso3D();
    }
    
}
