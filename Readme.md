[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/toeCyvWQ)

# Lista 1 POO 

### Informações do aluno
**Instituição:** Instituto Federal de Santa Catarina - Câmpus São Jośe  
**Aluno:** Ygor Vinicius Martins                                        
**Semestre:** 2025/1    
**Componente Curricular:** Programação orientada a objetos (POO)        
**Curso:** Engenharia de Telecomunicações   

## Aplicação 1

Como instruído pelo professor, o objetivo da aplicação 1 era:

>Desenvolva um aplicativo Java que imprima no terminal uma de três formas: um triângulo retângulo, um
losango ou um retângulo vazado. O tipo de figura a ser impressa e suas dimensões são escolhidos pelo
usuário através de argumentos de linha de comando. Em especial, a dimensão do losango deve ser ímpar.
Caso o usuário forneça argumentos inválidos, o programa deve informar a forma correta de uso.

O programa presente neste repositório cumpre com o que foi solicitado, exibindo na tela cada forma com a sua dimensão
fornecida.     
Para executar o programa, utiliza-se o seguinte comando:   

>./gradlew run --args "{forma} {dimensao1} {dimensao2}"

Sendo a formas disponiveis:

>triangulo retangulo losango

E as dimensões livres desde que sejam maiores ou iguais a 0

### Observações Execução

para o losango e o tringulo basta inserir:

>./gradlew run --args "{forma} {dimensao1}"

com destaque para o losango, já que só são aceitas dimensões ímpares.            
Agora para o retangulo utilizaremos a que já foi apresentada, entretanto vale destacar
que a primeira dimensão representa a largura enquanto a segunda dimensão representa a altura.

### Exemplos de Execução

./gradlew run --args "triangulo 5"   
./gradle run --args "losango 5"   
./gradle run --args "retangulo 8 5"  

Ao final o programa exibirá a forma com sua dimensão solicitada supondo que não
houve erro nos argumentos, caso possua erros, o programa dirá qual erro foi cometido

## Aplicação 2

Como instruído pelo professor, o objetivo da aplicação 2 era:

>Desenvolva um aplicativo em Java que permita ao usuário fornecer, como argumentos de linha de comando,
o nome das cores das faixas de um resistor e imprima na tela o valor da resistência correspondente. Caso
o usuário forneça argumentos inválidos, o programa deve informar a forma correta de uso.

O programa presente neste repositório cumpre com o que foi solicitado, exibindo na tela o valor da resistência
correspondente.     
Para executar o programa, utiliza-se o seguinte comando:   

>./gradlew run --args "{cor1} {cor2} {cor3} {cor4}"

Esta tabela mostra as cores válidas para a execução do programa, portanto, as cores válidas
para o campo {cor1} estão na coluna (1 faixa), para o campo {cor2} estão na coluna (faixa 2),
para o campo {cor3} estão no campo multiplicador, e por fim o campo {cor4} está na coluna (Tolerância %)

![](https://p1-kimg.kwai.net/kimg/EKzM1y8qmgEKAnMzEg1waG90by1vdmVyc2VhGoQBdXBpYy8yMDIzLzA3LzA5LzE4L0JNakF5TXpBM01Ea3hPRFExTlRkZk1UVXdNREF3TVRnNU5Ea3dPREF4WHpFMU1ERXdNelF4TXpVeE1EUTVObDh5WHpNPV9vZmZuX0JhZmY3OWMyYmU5ZjkyMGI4N2Q3M2RjMDQ1ZGQyY2FlYy53ZWJw.webp)

Observação: A {cor4} não é obrigatória, no caso em que ela não for especificada, será considerada uma tolerância de 20%

### Exemplos de Execução

>./gradlew run --args "amarelo branco verde azul"
>./gradle run --args "amarelo branco verde"

Ao final o programa exibirá o valor da resistência correspondente com base nas cores escolhidas

# Aplicação 3

Como instruído pelo professor, o objetivo da aplicação 3 era:

>Desenvolva um aplicativo em Java que gere um tabuleiro, posicione de forma aleatória a frota de um
jogador e imprima na tela o tabuleiro gerado. Para casas que contém um navio posicionado, imprima o
símbolo do navio. Para as casas que não contém navios, imprima o caractere ponto. Separe as casas da
mesma linha com espaços.

O programa presente neste repositório cumpre com o que foi solicitado, exibindo na tela um tabuleiro de batalha naval no tamanho 10x10
contendo os navios requeridos em posições aleatórias.     
Para executar o programa, utiliza-se o seguinte comando:   

>./gradle run

A fins de informação, os navios gerados neste tabuleiro são apenas na horizontal e vertical, além disso ele segue a regra de conter 5 navios,
sendo estes navios: navio "N" de tamanho 2, navio "S" de tamanho 3, navio "C" também de tamanho 3, navio "E" de tamanho "4", e por fim,
navio "P" de tamanho 5

# Aplicação 4

Como instruído pelo professor, o objetivo da aplicação 4 era:

> Desenvolva um programa em Java que receba, como redirecionamento de entrada, um arquivo texto
contendo um tabuleiro gerado no exercício 1. O programa deve verificar se o tabuleiro é válido (ou seja,
segue as regras do jogo). Caso o tabuleiro seja válido, o programa deve imprimir "Tabuleiro válido".      
> Caso o tabuleiro seja inválido, o programa deve informar o motivo da não conformidade

O programa presente neste repositório cumpre com o que foi solicitado, exibindo na tela se o tabuleiro de batalha naval é válido ou não,
e caso nãosejá válido, este especifica qual erro foi encontrado para invalidar tal tabuleiro.                  
Para executar o programa, utiliza-se o seguinte comando:

>./gradlew run < {arq_tabuleiro}

Novamente a fins de infomação, um tabuleiro é considerado inválido quando:
1. Não tem a dimensão correta de 10×10 casas
2. Inclui navios desconhecidos
3. Não inclui um navio de cada tipo
4. Inclui múltiplos navios do mesmo tipo
5. Inclui navios que não estão na horizontal ou vertica