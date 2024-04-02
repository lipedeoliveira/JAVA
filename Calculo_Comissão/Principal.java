import javax.swing.*;
public class Principal {

    public static void main(String[]args) {

        Calculo calc1 = new Calculo();

        double valorVendidoM = 0;

        valorVendidoM = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de quanto foi vendido: "));  

        valorVendidoM = calc1.calculoComissao(valorVendidoM);

        JOptionPane.showMessageDialog(null,"O valor do salario do funcionario: "+calc1.getNome()+" sera reajustado de "+calc1.getSalarioBase()+" para "+valorVendidoM);

    }
}