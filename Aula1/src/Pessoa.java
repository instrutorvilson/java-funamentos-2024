import javax.swing.JOptionPane;

public class Pessoa {
	
   public static void main(String args[]) {
	 // conceitos();
	 //  desvios();
	 //  digitarValor();
	   lacoWhile();
   }
   /*
    * Solicite ao usuário que digite 5 numeros
    * mostre a soma dos numeros
    * mostre a media dos numeros digitados
    * maior numero digitado
    * menor numero digitado
    * */
   static void lacoWhile(){
	  int i = 0;
	  int soma = 0;
	  int maiorNumero = 0;
	  int menorNumero = 100000;
	  while(i < 3) {
		 String nString = JOptionPane.showInputDialog("Digite numero");
		 int numero = Integer.parseInt(nString);
		 
		 if(numero > maiorNumero) {
			 maiorNumero = numero;
		 }
		 
		 if(numero < menorNumero) {
			 menorNumero = numero;
		 }
		 
		 soma = soma + numero;
		 i++;
	  }
	  System.out.println("Soma: " + soma); 
	  System.out.println("Media: " + (soma/i));
	  System.out.println("Maior: " + maiorNumero);
	  System.out.println("Menor: " + menorNumero);
   }
   
   static void digitarValor() {
	 String nome =  JOptionPane.showInputDialog("Digite nome");
	 String sobreNome = JOptionPane.showInputDialog("Digite sobrenome");
	 
	 String nomeCompleto = nome + " " + sobreNome;
	 
	 System.out.println("Boa tarde " + nomeCompleto);
   }
   
   static void desvios() {
	   String idadeString = JOptionPane.showInputDialog("Informe idade");
	   int idade = Integer.parseInt(idadeString);
	   
	   //System.out.println(idade < 18);	
	   
	   if(idade < 18) {
		  System.out.println("Vc é menor de idade"); 
	   }
	   else {
		   System.out.println("Vc é maior de idade");   
	   }
	   System.out.println("Desvios");
   }
   
   static void conceitos() {
	   String name;
		  name = "Jose da Silva";
		  System.out.println(name.toLowerCase());
		  System.out.println(name.toUpperCase());
		  
		  char sexo = 'M';
		  
		  int idade = 35;
		  
		  float peso = 90.5f;
		  double peso2 = 100.5;
		  
		  byte codigo = -128;
		  int codInt = 2147483647;
		  String cpf = "940.764.809-53";
		  
		  String precoItem = "30";
		  int qtdeItens = 10;
		  
		//  int subtotal = (qtdeItens * Integer.parseInt(precoItem));
		  int precoInt = Integer.parseInt(precoItem);
		  int subtotal = (qtdeItens * precoInt);
		  
		  System.out.println(subtotal);
		 
		  System.out.println("Hello world " + name);
   }
}
