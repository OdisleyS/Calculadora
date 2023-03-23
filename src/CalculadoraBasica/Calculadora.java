package CalculadoraBasica;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = 0, num2 = 0, resultado = 0;
        int op = 1;

        Historico historico = new Historico();
        Adicao somar = new Adicao();
        Subtracao subtrair = new Subtracao();
        Multiplicacao multiplicar = new Multiplicacao();
        Divisao dividir = new Divisao();
        Potenciacao potenciar = new Potenciacao();

        while (op != 0) {
            System.out.println("---------Menu---------");
            System.out.println("Digite a operação que deseja usar");
            System.out.println("0 - Sair");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Pontenciação");;
            op = input.nextInt();
            if (op == 0 ){
                break;
            }
            try {
                Validacao.validar(num2, op);
                switch (op) {

                    case 0:
                        break;
                    case 1:
                        System.out.println("Digite o primeiro número");
                        num1 = input.nextDouble();
                        System.out.println("Digite o segundo número");
                        num2 = input.nextDouble();
                        resultado = somar.operações(num1, num2);
                        System.out.println(resultado);
                        break;
                    case 2:
                        System.out.println("Digite o primeiro número");
                        num1 = input.nextDouble();
                        System.out.println("Digite o segundo número");
                        num2 = input.nextDouble();
                        resultado = subtrair.operações(num1, num2);
                        System.out.println(resultado);
                        break;
                    case 3:
                        System.out.println("Digite o primeiro número");
                        num1 = input.nextDouble();
                        System.out.println("Digite o segundo número");
                        num2 = input.nextDouble();
                        resultado = multiplicar.operações(num1, num2);
                        System.out.println(resultado);
                        break;
                    case 4:
                        System.out.println("Digite o primeiro número");
                        num1 = input.nextDouble();
                        System.out.println("Digite o segundo número");
                        num2 = input.nextDouble();
                        resultado = dividir.operações(num1, num2);
                        System.out.println(resultado);
                        break;
                    case 5:
                        System.out.println("Digite o primeiro número");
                        num1 = input.nextDouble();
                        System.out.println("Digite o segundo número");
                        num2 = input.nextDouble();
                        resultado = potenciar.operações(num1, num2);
                        System.out.println(resultado);



                }

                String informacao =num1 + ";" + op + ";" + num2 + " = " + resultado;
                historico.add(informacao);



            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }


        }
        historico.listarHistorico();
    }
}
