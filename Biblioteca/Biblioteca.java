package Biblioteca;
import javax.swing.*;
import java.util.ArrayList;
public class Biblioteca {

    private ArrayList<String> Livros = new ArrayList<String>();

    public Biblioteca() {

        this(new ArrayList<String>());

    }

    public Biblioteca(ArrayList<String> livro) {
        this.Livros= Livros;
    }

    public ArrayList<String> getLivro() {
        return Livros;
    }

    public void setLivro(ArrayList<String> livro) {
        Livros = Livros;
    }

    public void adicionarLivro() {

        JPanel painelCad = new JPanel();
            
        painelCad.setLayout(new BoxLayout(painelCad, BoxLayout.Y_AXIS));    
        System.out.println("arroz");
    }
    
}
