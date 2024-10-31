import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class AWTTestSwing {
    public static void main(String[] args) {
        
        // Cria a janela principal com o título "AWT Test"
        JFrame frame = new JFrame("AWT Test");
        
        // Configura para fechar o programa ao fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Define o tamanho da janela
        frame.setSize(400, 200);
        
        // Define o layout da janela como BorderLayout
        frame.setLayout(new BorderLayout());

        // Cria um rótulo e um campo de texto
        JLabel label1 = new JLabel("Label1");
        JTextField textField1 = new JTextField(15);

        // Painel superior para rótulo e campo de texto
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(label1);
        topPanel.add(textField1);

        // Cria três botões
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Painel de botões
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        // Adiciona os painéis ao layout da janela
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Exibe a janela
        frame.setVisible(true);
    }
}
