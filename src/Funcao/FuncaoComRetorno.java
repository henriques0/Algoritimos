
package Funcao;

import java.util.Scanner;

public class FuncaoComRetorno {

    public static double PedirNumero(){
        Scanner i  = new Scanner(System.in);
        System.out.print("Digite um numero");
        double num = i.nextDouble();
        return num;
    }
public static void criarMenu() {

        //Colocar o que vai aconteer ao executar
        System.out.println("Criando menu...");
        System.out.println("--------------------");
        System.out.println("1. Somar 2 números");
        System.out.println("2. Calcular número²");
        System.out.println("3. Raiz quadrada");
        System.out.println("4. Calcular dobro");
        System.out.println("5. Calcular tabuada");
        System.out.println("0. Sair");
        System.out.println("--------------------");

        //Nomes de função seguem a mesma regra de nomes de variavel
    }//Finaliza conteúdo da função

    public static void exemploTipo1() {
        int valor = 10;
        valor = valor * 5;

        System.out.println("A variavel valor vale: " + valor);
    }

    public static void calcularDobro() {
        double n = PedirNumero();
        double dobro = n * 2;
        System.out.println("Dobro de " + n + " = " + dobro);
    }

    public static void somar2Numeros() {
    
        double n, o, soma;
        System.out.print("Digite um número: ");
        n = PedirNumero();
        System.out.print("Digite outro número: ");
        o = PedirNumero();
        soma = o + n;
        System.out.println("A soma de " + n + " + " + o + " = " + soma);
    }

    public static void raizQuadrada() {
        double n, resultado;
        System.out.print("Digite um número: ");
        n = PedirNumero();
        resultado = Math.sqrt(n);
        System.out.println("A raiz quadrada de " + n + " = " + resultado);
    }

    public static void calcTab(int x) {
        for (int i = 1; i <= 10; i++) {
            print(x + " * " + i + " = " + (x * i));
        }
    }
    
    public static void Pedir(){
        int n = 0;
        Scanner i  = new Scanner(System.in);
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int opcao = 1;

        System.out.println("Início do programa!");
        criarMenu();
        System.out.print("\nDigite a opção desejada: ");
        while (opcao != 0) {
            opcao = e.nextInt();
            if (opcao == 1) {
                somar2Numeros();
            } else if (opcao == 2) {
                raizQuadrada();
            } else if (opcao == 3) {
                System.out.println("Digite um número");
                int y = e.nextInt();
                calcTab(y);
            } else if (opcao == 4) {
                calcularDobro();
//                System.out.println("Digite outra opção: ");
//                opcao = e.nextInt();
            } else {
                System.out.println("Digite um valor válido!");

            }
            System.out.println("Digite a opção desejada: ");
        }
        if (opcao == 0) {
            System.out.println("Fim.");
        }

    }
    
}
