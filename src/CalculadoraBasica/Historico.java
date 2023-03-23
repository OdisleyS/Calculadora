package CalculadoraBasica;

import java.util.ArrayList;

public class Historico {

    ArrayList<String> historico = new ArrayList<>();
    public void add (String resultado){
        historico.add(resultado);

    }

    public void listarHistorico(){
        for (String resultado:historico) {
            System.out.println(resultado);
        }
    }

}
