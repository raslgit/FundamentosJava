package fundamentos;

//herdando todos os poderes da classe medidas (extende a classe medidas)....diferentenmente da classe Calculos que soh usamos um metodo e um atributo
// de uma forma bem generica: usa-se o import se eu não for modificar nada ...soh vou usar o metodo/atributo....como na classe calculo. =>
// => o extended geralamente é usado quando além de usar eu vou modificar algo
public class Contadores extends Medidas {

    public static void main(String[] args){

        System.out.println("Deseja realizar a contagem regressiva? S/N");
        String resposta = entrada.nextLine();
        resposta = resposta.toUpperCase();

        if(resposta.equals("S"))
            contagemRegressiva();
        else
            System.out.println("Ahhh, vc não quer saber de nada não!!! Diferente de \"S\".  Muuula!!!");

    }


}
