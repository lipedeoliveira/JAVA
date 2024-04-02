// Importa todas as classes do pacote javax.swing, que contém componentes gráficos para interfaces de usuário
package Biblioteca;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

// Classe principal que contém o método main, ponto de entrada do programa
public class Main {

    private String senha = "batataazul";
    private String id="000" ;

    public Main(){
        this("","");
    }

    public Main(String senha, String id) {
        this.senha = senha;
        this.id = id;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public static void main(String[] args) {
    
        int reslt = 0;


        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();

        JPanel painel = new JPanel();

        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(new JLabel("Informe seu ID: "));
        painel.add(input1);
        painel.add(new JLabel("Informe sua senha: "));
        painel.add(input2);
        reslt = JOptionPane.showConfirmDialog(null,painel,"Login",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);


        if(reslt == JOptionPane.OK_OPTION) {

            String id = input1.getText();
            String senha = input2.getText();

                if(new Main().getSenha().equals(senha)){
                
                    JOptionPane.showMessageDialog(null,"Entrada autorizada","Login",JOptionPane.PLAIN_MESSAGE);

                    JButton buttonChecLivros = new JButton("Checar Livros");
                    JButton buttonChecAutor = new JButton("Checar Autor");
                    JButton buttonAddLivros = new JButton("Adicionar Livro");


                    JPanel buttonOpc = new JPanel();
                    buttonOpc.setLayout(new BoxLayout(buttonOpc, BoxLayout.Y_AXIS));

                    JLabel label = new JLabel("Escolha uma das opcoes");

                    buttonOpc.add(label);
                    buttonOpc.add(buttonAddLivros);
                    buttonOpc.add(buttonChecAutor);
                    buttonOpc.add(buttonChecLivros);

                    JOptionPane.showMessageDialog(null,buttonOpc,"Opcoes",JOptionPane.PLAIN_MESSAGE);
                        buttonAddLivros.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    Biblioteca biblicco1 = new Biblioteca();


                                    
                                }
                          });

                }
        }

    }
}
