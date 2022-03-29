// 1 - Pacote - Conjunto de classes
package fundamentos;

// 2 - Bibliotecas
import java.util.Scanner;

// 3 - Classe (que é o que vamos programar)
public class Medidas {

    //3.1 - Atributos (características, nome, telefone, Rg...)
    static Scanner entrada; //criei um objeto entrada do tipo Scanner...neste caso
    //static Scanner entrada = new Scanner(System.in); funciona tambem se criar e instanciar aqui


    //3.2 - Métodos (sem retorno) e Funções (com retorno) (dormir, acordar, comer...)
    //é um metodo publico (todos podem ver), estático (carrega ao iniciar o programa), e não retorna nada (é um metodo), main é o nome do primeira metodo (orquestrador, maetro, gatilho), 90% é assim (String)
    public static void main(String[] args){
        String opcao;
        float area = 0; //receber o resultado dos calculos de areas

        entrada = new Scanner(System.in); //instanciar o objeto de leitura do console...está iniciando/ligando o objeto entrada


        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); //leitura da opcao do teclado, neste caso um texto (por isso nextline())
        switch(opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "3":
                area = calcularAreaDoTriangulo();
                break;
            case "4":
                area = calcularAreaDoCirculo();
                break;
            default:
                System.out.println("Opcao invalinha escolhida: " + opcao);
        }

        System.out.println("A area é de: " + area + "m²");
    }

    public static int calcularAreaDoQuadrado(){

        int lado; // tamanho do lado do quadrado

        //Scanner entrada = new Scanner(System.in); //criamos o objeto para ler uma entrada no console
        System.out.println("Digite o tamanho do lado do Quadrado: ");
        lado = entrada.nextInt(); //leitura do tamanho do lado...nextInt = leia o proximo inteiro
        return lado*lado; //void não tem return...somente função tem return...neste caso queremos retornar o valor (neste acaso a area do quadrado)

    }

    public static int calcularAreaDoRetangulo(){

        int ladoA = 0, ladoB = 0;
        short x;

        for(x=1; x<3; x++){
            System.out.println("Digite o tamanho do lado " + x +  " do retangulo: ");
            if (x==1){
                ladoA = entrada.nextInt(); //leitura do tamanho do lado...nextInt = leia o proximo inteiro
            }
            else{
                ladoB = entrada.nextInt(); //leitura do tamanho do lado...nextInt = leia o proximo inteiro
            }
        }

        return ladoA*ladoB;

    }

    public static int calcularAreaDoTriangulo(){

        int base = 0, altura = 0;

        System.out.println("Digite o tamanho da base do trinagulo: ");
        base = entrada.nextInt(); //leitura do tamanho do lado...nextInt = leia o proximo inteiro
        System.out.println("Digite o tamanho da altura do trinagulo: ");
        altura = entrada.nextInt(); //leitura do tamanho do lado...nextInt = leia o proximo inteiro

        return base*altura/2;

    }

    public static float calcularAreaDoCirculo(){

        float raio = 0;
        float pi = (float) 3.14;

        System.out.println("Digite o tamanho do raio do circulo: ");
        raio = entrada.nextInt(); //leitura do tamanho do lado...nextInt = leia o proximo inteiro

        return raio*pi*pi;

    }

}
