import java.util.Scanner;

public class Cadastro
{
    public static void main(String arg[])
    {
        int valor = 0, preco = 0;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Digite o carro escolhido (Fusca, Brasilia ou Opala): ");
        String carro = teclado.nextLine();
        if (carro.equals ("Fusca")) {
            System.out.print("Escolha o Modelo: Basic, Sedan, Sport, Executive ");
            String resposta = teclado.nextLine();
            if ( resposta.equals ("Basic")) 
            {
                System.out.print("Escolha o Primeiro opcional: Trio Elétrico, Ar Condicionado, Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                if (resposta.equals ("Trio Elétrico"))
                {
                    valor = 900;
                }
                if (resposta.equals ("Ar Condicionado"))
                {
                    valor = 1200;
                }
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor = 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor = 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                
                
                System.out.print("Escolha o Segundo opicional: Trio Elétrico, Ar Condicionado, Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Trio Elétrico"))
                {
                    valor += 900;
                }
                if (resposta.equals ("Ar Condicionado"))
                {
                    valor += 1200;
                }
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor += 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor += 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor += 3200;
                }
                
                
                
                preco = valor + 20000;
                System.out.println(" Valor Fusca Basic é " + preco );
                
            }
            if ( resposta.equals ("Sedan")) 
            {
                System.out.print("Escolha o Primeiro opicional: Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor = 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor = 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                
                
                System.out.print("Escolha o Segundo opicional: Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor += 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor += 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor += 3200;
                }
                
                
                preco = valor + 27000;
                System.out.println(" Valor Fusca Sedan é " + preco );
                
            }
            if ( resposta.equals ("Sport")) 
            {
                System.out.print("Escolha o opicional: Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
               
                               
                preco = valor + 28500;
                System.out.println(" Valor Fusca Sport é " + preco );
                
            }
            if ( resposta.equals ("Executive")) 
            {
                System.out.print("Escolha o opicional: Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                
                               
                preco = valor + 32000;
                System.out.println(" Valor Fusca Executive é " + preco );
                
            }
        }
        
        
        if (carro.equals ("Brasilia")) {
            System.out.print("Escolha o Modelo: Basic, Sedan, Sport, Executive ");
            String resposta = teclado.nextLine();
            if ( resposta.equals ("Basic")) 
            {
                System.out.print("Escolha o Primeiro opcional: Trio Elétrico, Ar Condicionado, Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                if (resposta.equals ("Trio Elétrico"))
                {
                    valor = 900;
                }
                if (resposta.equals ("Ar Condicionado"))
                {
                    valor = 1200;
                }
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor = 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor = 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                
                
                System.out.print("Escolha o Segundo opicional: Trio Elétrico, Ar Condicionado, Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Trio Elétrico"))
                {
                    valor += 900;
                }
                if (resposta.equals ("Ar Condicionado"))
                {
                    valor += 1200;
                }
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor += 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor += 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor += 3200;
                }
                
                
                preco = valor + 20700;
                System.out.println(" Valor Brasilia Basic é " + preco );
                
            }
            if ( resposta.equals ("Sedan")) 
            {
                System.out.print("Escolha o Primeiro opcional: Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor = 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor = 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                
                
                System.out.print("Escolha o Segundo opcional: Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor += 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor += 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor += 3200;
                }
                
                
                preco = valor + 27900;
                System.out.println(" Valor Brasilia Sedan é " + preco );
                
            }
            if ( resposta.equals ("Sport")) 
            {
                System.out.print("Escolha o opcional: Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                
                               
                preco = valor + 30500;
                System.out.println(" Valor Brasilia Sport é " + preco );
                
            }
            if ( resposta.equals ("Executive")) 
            {
                System.out.print("Escolha o opcional: Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                
                               
                preco = valor + 35000;
                System.out.println(" Valor Brasilia Executive é " + preco );
                
            }
        }
        
        
        if (carro.equals ("Opala")) {
            System.out.print("Escolha o Modelo: Basic, Sedan, Sport, Executive ");
            String resposta = teclado.nextLine();
            if ( resposta.equals ("Basic")) 
            {
                System.out.print("Escolha o Primeiro opcional: Trio Elétrico, Ar Condicionado, Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                if (resposta.equals ("Trio Elétrico"))
                {
                    valor = 900;
                }
                if (resposta.equals ("Ar Condicionado"))
                {
                    valor = 1200;
                }
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor = 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor = 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                
                
                System.out.print("Escolha o Segundo opicional: Trio Elétrico, Ar Condicionado, Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Trio Elétrico"))
                {
                    valor += 900;
                }
                if (resposta.equals ("Ar Condicionado"))
                {
                    valor += 1200;
                }
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor += 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor += 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor += 3200;
                }
                
                
                preco = valor + 25000;
                System.out.println(" Valor Opala Basic é " + preco );
                
            }
            if ( resposta.equals ("Sedan")) 
            {
                System.out.print("Escolha o Primeiro opcional: Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor = 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor = 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                
                
                System.out.print("Escolha o Segundo opcional: Direção Hidráulica, Bancos de Couro, Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Direção Hidráulica"))
                {
                    valor += 1350;
                }
                if (resposta.equals ("Bancos de Couro"))
                {
                    valor += 1850;
                }
                if (resposta.equals ("Multimidia"))
                {
                    valor += 3200;
                }
                
                
                preco = valor + 29200;
                System.out.println(" Valor Opala Sedan é " + preco );
                
            }
            if ( resposta.equals ("Sport")) 
            {
                System.out.print("Escolha o opcional: Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
               
                               
                preco = valor + 31500;
                System.out.println(" Valor Opala Sport é " + preco );
                
            }
            if ( resposta.equals ("Executive")) 
            {
                System.out.print("Escolha o opcional: Multimidia ");
                resposta = teclado.nextLine();
                
                if (resposta.equals ("Multimidia"))
                {
                    valor = 3200;
                }
                                               
                preco = valor + 37000;
                System.out.println(" Valor Opala Executive é " + preco );
                
            }
        } 
        
        
    
    }
}