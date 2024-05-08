/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author felipe
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MiniCalculadora  extends JFrame{
    JLabel Num1, Num2, resultado,dev,Soma;
    JTextField CxText1, CxText2;
    JButton btnSoma,btnSubtracao,btnMultiplicacao,btnDivisao,btnLimpar,btnHabilitar,btnDesabilitar,btnOcultar,btnExib,btnExit;
    
    public MiniCalculadora(){
    
            super("Mini Calculadora");
            Container tela = getContentPane();
            setLayout(null);
            ImageIcon icone = new ImageIcon("icone_calc.png");
            setIconImage(icone.getImage());
            
            //Label's
            Num1 = new JLabel("1\u00B0 Número:");
            Num2 = new JLabel("2\u00B0 Número:");
            resultado = new JLabel("");
            Soma = new JLabel("");
            dev = new JLabel("Desenvolvido por Felipe Vieira - 2\u00B0 DS/AMS");
            //Fim das Label's
            
            
            //Caixas de Entrada
            CxText1 = new JTextField(10);
            CxText2 = new JTextField(10);
            //Fim das caixas de entrada
            
            
            //Botões
            btnSoma = new JButton("+");
            btnSubtracao = new JButton("-");
            btnMultiplicacao = new JButton("*");
            btnDivisao = new JButton("/");
            btnLimpar = new JButton("Limpar");
            btnHabilitar = new JButton("Habilitar");
            btnDesabilitar = new JButton("Desabilitar");
            btnOcultar = new JButton("Ocultar");
            btnExib = new JButton("Exibir");
            btnExit = new JButton("Sair");
            //Fim
            
            Num1.setBounds(50,20,100,20);
            Num2.setBounds(50,40,100,20);
            resultado.setBounds(50,100,300,20);
            Soma.setBounds(150,100,300,20);
            CxText1.setBounds(130,20,100,20);
            CxText2.setBounds(130,40,100,20);
            
            //Setando a posição dos botões
            btnSoma.setBounds(350,20,50,20);
            btnSubtracao.setBounds(350,40,50,20);
            btnMultiplicacao.setBounds(350,60,50,20);
            btnDivisao.setBounds(350,80,50,20);
            btnLimpar.setBounds(350,100,100,20);
            btnHabilitar.setBounds(50,200,100,20);
            btnDesabilitar.setBounds(150,200,120,20);
            btnOcultar.setBounds(260,200,90,20);
            btnExib.setBounds(350,200,80,20);
            btnExit.setBounds(350,240,80,20);
            dev.setBounds(100,300,300,20);
            
            //Associando atalhos a botões
            btnSoma.setMnemonic(KeyEvent.VK_PLUS);
            btnSubtracao.setMnemonic(KeyEvent.VK_MINUS);
            btnMultiplicacao.setMnemonic(KeyEvent.VK_MULTIPLY);
            btnDivisao.setMnemonic(KeyEvent.VK_DIVIDE);
            btnExit.setMnemonic(KeyEvent.VK_E);
            
            tela.add(Num1);
            tela.add(Num2);
            tela.add(resultado);
            tela.add(CxText1);
            tela.add(CxText2);
            tela.add(Soma);
            tela.add(btnSoma);
            tela.add(btnSubtracao);
            tela.add(btnMultiplicacao);
            tela.add(btnDivisao);
            tela.add(btnLimpar);
            tela.add(btnHabilitar);
            tela.add(btnDesabilitar);
            tela.add(btnOcultar);
            tela.add(btnExib);
            tela.add(btnExit);
            
            tela.add(dev);
            
            
            
            
            
            
            
            //Função dos botões
            btnSoma.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                        
                            double numero1, numero2,soma;
                            soma = 0;
                            numero1 = Integer.parseInt(CxText1.getText());
                            numero2 = Integer.parseInt(CxText2.getText());
                            soma = numero1 + numero2;
                            
                            resultado.setVisible(true);
                            Soma.setVisible(true);
                            resultado.setForeground(Color.RED);
                            resultado.setText("Resultado:: ");
                            Soma.setText("A soma é: "+soma);
                           
                        }
                    }
            );
                     btnSubtracao.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                        
                            double numero1, numero2,subtracao;
                            subtracao = 0;
                            numero1 = Integer.parseInt(CxText1.getText());
                            numero2 = Integer.parseInt(CxText2.getText());
                            subtracao = numero1 - numero2;
                            
                            resultado.setVisible(true);
                            Soma.setVisible(true);
                            resultado.setForeground(Color.RED);
                            resultado.setText("Resultado:: ");
                            Soma.setText("A subtração é: "+subtracao);
                           
                        }
                    }
            );
                     
                     
              btnMultiplicacao.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                        
                            double numero1, numero2,multiplicacao;
                            multiplicacao = 0;
                            numero1 = Integer.parseInt(CxText1.getText());
                            numero2 = Integer.parseInt(CxText2.getText());
                            multiplicacao = numero1 *numero2;
                            
                            resultado.setVisible(true);
                            Soma.setVisible(true);
                            resultado.setForeground(Color.RED);
                            resultado.setText("Resultado:: ");
                            Soma.setText("A multiplicação é: "+multiplicacao);
                           
                        }
                    }
            );
                     
                     
                     
            btnDivisao.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                        
                            double numero1, numero2,divisao;
                            divisao = 0;
                            numero1 = Integer.parseInt(CxText1.getText());
                            numero2 = Integer.parseInt(CxText2.getText());
                            divisao = numero1 / numero2;
                            
                            resultado.setVisible(true);
                            Soma.setVisible(true);
                            resultado.setForeground(Color.RED);
                            resultado.setText("Resultado:: ");
                            Soma.setText("A divisão é: "+divisao);
                           
                        }
                    }
            );
                     

                              
            btnOcultar.addActionListener(
            
                    new  ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        resultado.setVisible(false);
                                        Soma.setVisible(false);
                                    }
                    }
            );
            
            btnExib.addActionListener(
            
                    new  ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        resultado.setVisible(true);
                                        Soma.setVisible(true);

                                    }
                    }
            );
 
            
                        btnDesabilitar.addActionListener(
            
                    new  ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        resultado.setEnabled(false);
                                        Soma.setEnabled(false);
                                    }
                    }
            );
            
            btnHabilitar.addActionListener(
            
                    new  ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        resultado.setEnabled(true);
                                        Soma.setEnabled(true);

                                    }
                    }
            );
            
            btnLimpar.addActionListener(
                        new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        CxText1.setText(null);
                                        CxText2.setText(null);
                                        CxText1.requestFocus();

                                    }
                        }
            );
            
            
            btnExit.addActionListener(
            
                    new  ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        System.exit(0);
                                    }
                    }
            );
            setLocationRelativeTo(null);
            setSize(500,400);
            setVisible(true);
            
    }
    
}
