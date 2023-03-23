package CalculadoraBasica;

public class Potenciacao implements IOperacoes{
    @Override
    public double operações(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
