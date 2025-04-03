/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    static String faixas(String cor) {
        switch (cor) {
            case "preto":
                return "0";
            case "marrom":
                return "1";
            case "vermelho":
                return "2";
            case "laranja":
                return "3";
            case "amarelo":
                return "4";
            case "verde":
                return "5";
            case "azul":
                return "6";
            case "violeta":
                return "7";
            case "cinza":
                return "8";
            case "branco":
                return "9";
            default:
                return "erro";
        }
    }

    static double multiplicador(String cor) {
        switch (cor) {
            case "preto":
                return 1;
            case "marrom":
                return 10;
            case "vermelho":
                return Math.pow(10, 2);
            case "laranja":
                return Math.pow(10, 3);
            case "amarelo":
                return Math.pow(10, 4);
            case "verde":
                return Math.pow(10, 5);
            case "azul":
                return Math.pow(10, 6);
            case "violeta":
                return Math.pow(10, 7);
            case "cinza":
                return Math.pow(10, 8);
            case "branco":
                return Math.pow(10, 9);
            case "ouro":
                return 0.1;
            case "prata":
                return 0.01;
            default:
                return 0;
        }
    }

    static String tolerancia(String cor) {
        switch (cor) {
            case "preto":
                return "0%";
            case "marrom":
                return "1%";
            case "vermelho":
                return "2%";
            case "verde":
                return "0.5%";
            case "azul":
                return "0.25%";
            case "violeta":
                return "0.1%";
            case "cinza":
                return "0.05%";
            case "ouro":
                return "5%";
            case "prata":
                return "10%";
            default:
                return "erro";
        }
    }

    static String resistencia_convertida (double resistencia_final){
        if(resistencia_final >= 1000 && resistencia_final < 1000000){
            return Double.toString(resistencia_final / 1000) + " K";
        } else if(resistencia_final >= 1000000 && resistencia_final < 1000000000){
            return Double.toString(resistencia_final / 1000000) + " M";
        } else if (resistencia_final >= 1000000000){
            return Double.toString(resistencia_final / 1000000000) + " K";
        } else {
            return Double.toString(resistencia_final);
        }
    }

    public static void main(String[] args) {
        String digito_faixa1 = faixas(args[0]);
        String digito_faixa2 = faixas(args[1]);
        digito_faixa1 += digito_faixa2;
        int valor_faixa = Integer.parseInt(digito_faixa1);
        double valor_multiplicador = multiplicador(args[2]);
        double resitencia_total = valor_faixa * valor_multiplicador;
        String resistencia_saida = resistencia_convertida(resitencia_total);
        String valor_tolerancia;
        if (args.length == 4) {
            valor_tolerancia = tolerancia(args[3]);
        } else {
            valor_tolerancia = "20%";
        }
        System.out.println("Resistência: " + resistencia_saida + " Ohms (+- " + valor_tolerancia + ")" );
    }
}
