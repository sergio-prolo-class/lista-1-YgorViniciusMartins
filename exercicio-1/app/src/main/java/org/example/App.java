package org.example;

public class App {

    //Função responsável por criar o triangulo com a base informada e imprimi este no terminal
    static void triangulo (int base, String espaco, String asterisco){
        for (int i = 1; i <= base; i++) {
            System.out.println(espaco.repeat(base - i) + asterisco.repeat(i));
        }
    }

    //Função responsável por criar o losango com a base informada e imprimi este no terminal
    static void losango(int dimensao, String espaco, String asterisco){
        //Parte superior do losango
        int qtd_espacos = dimensao/2;
        for (int i = 1; i != dimensao; i += 2) {
            System.out.println(espaco.repeat(qtd_espacos) + asterisco.repeat(i));
            qtd_espacos--;
        }

        //Meio do losango
        System.out.println(asterisco.repeat(dimensao));

        //Parte inferior do losango
        qtd_espacos = 1;
        for (int j = dimensao - 2; j >= 1; j -= 2) {
            System.out.println(espaco.repeat(qtd_espacos) + asterisco.repeat(j));
            qtd_espacos++;
        }
    }

    //Função responsável por criar o retangulo com a base e altura informada e imprimi este no terminal
    static void retangulo(int largura, int altura, String espaco, String asterisco){
        System.out.println(asterisco.repeat(largura)); //Parte superior do retangulo
        for(int i = 0; i < altura - 2; i++){
            System.out.println(asterisco + espaco.repeat(largura - 2) + asterisco);
        }
        System.out.println(asterisco.repeat(largura)); //Parte infeior retangulo
    }



    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("O programa funciona por argumentos de linha de comando, onde o primeiro argumento deve ser a forma e o segundo a dimensão, exemplo: gradle run --args \"triangulo 5\"");
            System.exit(0);
        }
        //Inicializando variávies auxiliares para desenhar as formas
        String espaco = " ";
        String asterisco = "*";
        int base = Integer.parseInt(args[1]);
        if(base < 0){
            System.out.println("Dimensão inválida, dimensão deve ser maior ou igual a zero");
            System.exit(0);
        }

        //O código main opera aqui como driver, encaminhando para a função desejada com base no que foi solicitado pelo usuario
        switch (args[0]) {
            case "triangulo":
                triangulo(base, espaco, asterisco);
                break;
            case "losango":
                int dimensao = Integer.parseInt(args[1]);
                //Se dimensão for par, encerra o programa
                if(dimensao % 2 == 0){
                    System.out.println("Só é possível criar losangos com dimensão ímpar!");
                    return;
                }
                losango(dimensao, espaco, asterisco);
                break;
            case "retangulo":
                if(args.length < 3){
                    System.out.println("Para a criação de retangulos se exige uma dimensão de largura e altura, exemplo: gradle run --args \"retangulo 8 5\"");
                    System.exit(0);
                }
                int altura = Integer.parseInt(args[2]);
                retangulo(base, altura, espaco, asterisco);
                break;
            default:
                System.out.println("Forma inválida, as formas válidas são: triangulo; retangulo; losango");
                System.exit(0);
        }
    }
}