import javax.swing.*;

public class Calculo {

    private String nome;
    private double salarioBase;

    
    public Calculo() {

        this("",0);
        
    }


    public Calculo(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getSalarioBase() {
        return salarioBase;
    }


    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calculoComissao(double valorVendidoC) {

        double salarioReajustado = 0;

            this.setNome(JOptionPane.showInputDialog("Insira o nome do funcionario: "));
            this.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salario base: ")));

            salarioReajustado = getSalarioBase()+((valorVendidoC/100)*10);

            return salarioReajustado;
    }
    
}
