public class Main {

    //Função responsável por criar o triangulo com a base informada e imprimir este no terminal
    static void triangulo (int base, String espaco, String asterisco){
        for (int i = 1; i <= base; i++) {
            System.out.println(espaco.repeat(base - i) + asterisco.repeat(i));
        }
    }

    static void losango(int dimensao, String espaco, String asterisco){
        int qtd_espacos = dimensao/2;
        for (int i = 1; i != dimensao; i += 2) {
            System.out.println(espaco.repeat(qtd_espacos) + asterisco.repeat(i));
            qtd_espacos--;
        }

        System.out.println(asterisco.repeat(dimensao));

        qtd_espacos = 1;
        for (int j = dimensao - 2; j >= 1; j -= 2) {
            System.out.println(espaco.repeat(qtd_espacos) + asterisco.repeat(j));
            qtd_espacos++;
        }
    }

    public static void main(String[] args) {

        //Inicializando variávies auxiliares para desenhar as formas
        String espaco = " ";
        String asterisco = "*";

        //O código main opera aqui como driver, encaminhando para a função desejada com base no que foi solicitado pelo usuario
        switch (args[0]) {
            case "triangulo":
                int base = Integer.parseInt(args[1]);
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
                System.out.println("Teste2");
                break;
        }
    }
}