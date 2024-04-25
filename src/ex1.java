import javax.swing.*;
import java.awt.*;
public class ex1 extends JFrame{
    public ex1(){
        super("Nossa primeira janela");
        setSize(300, 150); // largura (comprimento) e altura
        setLocationRelativeTo(null); // Centralizada
        setResizable(false); // Não redimensionada
        ImageIcon icone = new ImageIcon("image/cloud.png"); // Alterando icone pt2
        setIconImage(icone.getImage()); // Alterando imagem pt2
        Container tela = getContentPane(); // Cor de fundo pt1
        tela.setBackground(new Color(186, 203, 232)); // Cor de fundo pt2
        setVisible(true);
    }

    public static void main(String args[]){
        ex1 app = new ex1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
