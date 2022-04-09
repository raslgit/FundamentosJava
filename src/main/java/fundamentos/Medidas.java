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
        //String opcao;
        int opcao;
        float area = 0; //receber o resultado dos calculos de areas

        //boolean bol = true;

        entrada = new Scanner(System.in); //instanciar o objeto de leitura do console...está iniciando/ligando o objeto entrada

        //opcao != "S" não funciona...mas o proprio intelij nos avisa
        // uma outra opcao seria while(!opcao.toUpperCase().equals("S"))...pra transformar a letra maiuscula antes de verificar
        //while(!opcao.equals("S") && !opcao.equals("s")) {
        do {
            System.out.println("Escolha o Calculo Desejado");
            System.out.println("(1) - Area do Quadrado");
            System.out.println("(2) - Area do Retangulo");
            System.out.println("(3) - Area do Triangulo");
            System.out.println("(4) - Area do Circulo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Fibonacci com Switch");
            System.out.println("(8) - Contagem Regressiva");
            System.out.println("(9) - Divisão por Zero");
            System.out.println("(0) - Sair");

            //opcao = entrada.nextLine(); //leitura da opcao do teclado, neste caso um texto (por isso nextline())
            //opcao = entrada.nextInt();
            opcao = checkEntrada();

            switch (opcao) {
                case 1:
                //case "1":
                    area = calcularAreaDoQuadrado();
                    break;
                case 2:
                    area = calcularAreaDoRetangulo();
                    break;
                case 3:
                    area = calcularAreaDoTriangulo();
                    break;
                case 4:
                    area = calcularAreaDoCirculo();
                    break;
                case 5:
                    tabuada();
                    break;
                case 6:
                    fibonacci();
                    break;
                case 7:
                    fibonacciComSwitch();
                    break;
                case 8:
                    contagemRegressiva();
                    break;
                //case "S":
                //case "s":
                case 9:
                    divisaoPorZero();
                    break;
                case 0:
                    System.out.println("Até mais animal de teta!! Obrigado pela preferencia!!!!");
                    //bol = false;
                    break;
                default:
                    System.out.println("Opcao invalida escolhida: " + opcao);
                    //bol = false;
            }

            if (area > 0) {
                System.out.println("A area é de: " + area + "m²");
                area = 0;
                //bol = true;
            }
        } //while(!opcao.equals("S") && !opcao.equals("s"));
        while(opcao!=0);

    }

    //funcao pra validar o numero escolhido pelo usuário...se eh número inteiro,letra, float
    public static int checkEntrada(){
        while (!entrada.hasNextInt()){ //enquanto entrada não tiver um numero inteiro faça!
            entrada.nextLine();
            System.out.println("Somente numeros inteiros, please! Tente novamente: ");

        }
        int opcao = entrada.nextInt();
        entrada.nextLine();
        return opcao;

    }


    public static int calcularAreaDoQuadrado(){

        int lado; // tamanho do lado do quadrado

        //Scanner entrada = new Scanner(System.in); //criamos o objeto para ler uma entrada no console
        System.out.println("Digite o tamanho do lado do Quadrado: ");
        lado = entrada.nextInt(); //leitura do tamanho do lado...nextInt = leia o proximo inteiro

        // Desenhar o quadrado
        for(int linha = 1; linha <= lado; linha++) {

            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");

            }
            System.out.println();
        }
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

        // Desenhar o triangulo (tentativa)
        for(int linha = altura; linha >= 1; linha--) {

            for (int coluna = 1; coluna <= base; coluna++) {
                System.out.print("#");

            }
            base--;
            System.out.println();
        }


        return base*altura/2;

    }

    public static float calcularAreaDoCirculo(){

        float raio = 0;
        float pi = (float) 3.14;

        System.out.println("Digite o tamanho do raio do circulo: ");
        raio = entrada.nextInt(); //leitura do tamanho do lado...nextInt = leia o proximo inteiro

        return raio*pi*pi;

    }


    public static void tabuada() {
        System.out.print("Voce quer calcular a tabuada de qual numero?: ");
        byte numero = entrada.nextByte(); //byte é um numero de 0 ate 255....economia de memoria

        for (byte i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }

    }

    public static void fibonacci() {
        System.out.print("Quantos numeros deseja calcular na sequencia? : ");
        byte numero = entrada.nextByte();
        int num1 = 0;
        int num2 = 1;
        int numSeq = 0;

//segredo do fibonacci : 0_num1 1_num2 1_numSeq 2 3 5 8 13
//segredo do fibonacci : 0_num1 1_num2 => num1 1_numSeq => num2 2_numSeq 3 5 8 13
        if (numero > 0){
            System.out.print(num1 + " " + num2 + " ");
            if (numero > 1){
                for (byte i = 1; i <= numero; i++){
                    numSeq = num1 + num2;
                    System.out.print(numSeq + " ");
                    num1 = num2;
                    num2 = numSeq;

                }
            }

        }
        else {
            System.out.println("A Sequencia eh vazia");
        }

    


    }

    public static void fibonacciComSwitch() {
        System.out.print("Quantos numeros deseja calcular na sequencia? : ");
        byte numero = entrada.nextByte();

        int num1 = 0;
        int num2 = 1;
        int numSeq = 0;

        switch (numero) {
            case 0:
                System.out.println("A Sequencia eh vazia");
                break;
            case 1:
                System.out.print(num1 + " " + num2 + " ");
                break;
            default:
                System.out.print(num1 + " " + num2 + " ");
                for (byte i = 1; i <= numero; i++) {
                    numSeq = num1 + num2;
                    System.out.print(numSeq + " ");
                    num1 = num2;
                    num2 = numSeq;
                }

        }

    }

    public static void contagemRegressiva(){
        System.out.println("Comecar a contagem regressiva a partir de qual numero?: ");
        int numero = entrada.nextInt();

        System.out.println("Qual o decremento: ");
        int decremento = entrada.nextInt();

        //i-=decremento => i = i - decremento
        for(int i = numero; i >= 1; i-= decremento){
            System.out.println(i);
        }



    }

    public static void divisaoPorZero(){
        try {

                System.out.print("Qual eh o numero a ser dividido? ");
                byte numero = entrada.nextByte();// byte -127 até 127
                System.out.print("Qual o denominador? ");
                byte denominador = entrada.nextByte();

                System.out.println("O resultado eh: " + numero / denominador);
            }
/*

        catch (Exception e){
            String erro = e.getMessage();
            switch (erro){
                case "/ by zero":
                    System.out.println("Não é possível dividir por zero");
                    break;

            }
        }
*/
        catch (Exception e){
            System.out.println("Mensagem temporária em Inglês: " + e.getMessage());
            entrada.nextLine();

        }
        finally {
            System.out.println("Se quiser colocar este bloco....Por hoje é soh pepessoal");
        }


    }





    /*    //neste caso fiz com dois trys...um para cada erro...mas uma maneira mai simples é colocar tudo dentro de um try e pela mensagem ver o que aconteceu...se bem que entrada de string não mostrou muita coisa
        try{
            System.out.print("Qual eh o numero a ser dividido? ");
            float numero = entrada.nextFloat();
            System.out.print("Qual o denominador? ");
            float denominador = entrada.nextFloat();
            try{
                System.out.println("O resultado eh: " + numero/denominador);

            }
            catch (Exception e){
                //Esta parte somente é necessária se o tipo do numeor edenominador for int, caso contrario (float), o retorno do resultado é infinity e não retorna uma excepitiom
                System.out.println("Não é possivel dividir por zero - Erro " + e.getMessage());//esse "e" + "." => eu estou pedindo pra ele pegar a mensagem do erro
                System.out.println("Não é possivel dividir por zero - Erro " + e.getCause());//esse "e" + "." => eu estou pedindo pra ele pegar a mensagem do erro pra um determinado pais...mas rprecisa criai uma tabel ade conversão que o mula do prof não sabe
            }



        }
        catch (Exception e){
            System.out.println("Erro na Entrada dos valores! Erro " + e.getMessage());
            entrada.nextLine();
        }

    }*/

}
