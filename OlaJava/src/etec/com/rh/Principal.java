package etec.com.rh;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro car = new Carro();
		JOptionPane.showMessageDialog(null, car.Compra());
		/*
        System.out.println("Ol� Java");
        
        JOptionPane.showMessageDialog(null, "Bem vindo ao Java");
        
        String nome;
        
        nome = JOptionPane.showInputDialog("Qual � seu nome");
        
        JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
        
        //Meu primeiro ol� no Java
        /*new
         * new
         */
        
        String carro; //tipo character
        int ano; //Tipo inteiro
        float peso; //Tipo decimal
        double peso2; //decimal
        long producao; //tipo longo
        boolean comprar; //0 ou 1 / Sim ou N�o
         //Convers�o (Promo��o)
        carro = JOptionPane.showInputDialog("Qual carro que deseja?");
        ano =  Integer.parseInt(JOptionPane.showInputDialog("Qual o ano que deseja?"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Qual o peso do carro?"));
        producao = Long.parseLong(JOptionPane.showInputDialog("Quantidade Fabricada?"));
        comprar = Boolean.parseBoolean(JOptionPane.showInputDialog("Deseja comprar escolha: 0- n�o 1- sim "));
        //Imprimir o resultado
        JOptionPane.showMessageDialog(null, 
        		"O carro escolhido �: " + carro + 
        		"\n O ano do carro �: " + ano +
        		"\n O peso do carro �: " + peso +
        		"\n Quantidade fabricada: " + producao +
        		"\n A compra foi efetuada - status: " + comprar );
	}
}
