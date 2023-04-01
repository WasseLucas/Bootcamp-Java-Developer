package app;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class applicationRun {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        ContaBanco contaBanco = new ContaBanco();

        //System.out.println("Por favor preencher todos os campos para criação de sua conta. ");
        System.out.print("Por favor, digite o número da Conta! ");
        contaBanco.numero = sc.nextInt();
        contaBanco.setAgencia("067-8");  
        contaBanco.setNomeDoCliente("Wasse Lucas Bezerra Ribamar");
        contaBanco.setSaldo(900.00);

        System.out.print(contaBanco);


        sc.close();
    }
}
