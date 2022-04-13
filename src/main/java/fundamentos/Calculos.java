package fundamentos;

import java.util.Objects;

import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada; //hendando as habilidades da classe Medidas, neste caso somente o metodo tabuada e o atributo entrada


public class Calculos{

    public static void main(String[] args){
        System.out.println("Voce quer calcular a tabuada? <S/N> ");
        String resposta = entrada.nextLine();
         resposta = resposta.toUpperCase();
//definitivamente, nao eh possivel comparar string com "=="
        if(resposta.equals("S")){
            tabuada();
        }
        else{
            System.out.println("Ahhh, não quer calcular nada Mané!!!!! escolheu texto diferente de \"S\" ");
        }



        /*if (Objects.equals(resposta, "S")) {
            tabuada();
        }*/

    }

}
