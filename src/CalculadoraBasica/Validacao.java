package CalculadoraBasica;

public class Validacao {

    public static void validar (double num2, int operação) {

        if (num2 == 0 && operação == 4){
            throw new RuntimeException("Impossível dividir por 0");
        }



    }


}
