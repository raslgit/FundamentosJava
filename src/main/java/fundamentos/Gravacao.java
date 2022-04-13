package fundamentos;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gravacao {

    public static void main(String[] args) throws IOException {
        String[] cabecalho = {"nome", "idade", "telefone"}; //Lista de Strings para montar o cabecalho

        System.out.println(cabecalho[1]);

        List<String[]> linhas = new ArrayList<>(); //cria  uma tabela vazia
        linhas.add(new String[]{"Beatriz", "29", "11 99999999"});//para popular a tabela
        linhas.add(new String[]{"Gilmo", "25", "11 87654321"});//para popular a tabela
        linhas.add(new String[]{"Silas", "21", "11 12345678"});//para popular a tabela

        //criar um escritor
        Writer escritor = Files.newBufferedWriter(Paths.get("src/main/resources/logs/clients.csv"));
        CSVWriter escritorCSV = new CSVWriter(escritor);

        //preparando tudo para gerar o arquivo e escrever
        escritorCSV.writeNext(cabecalho);
        escritorCSV.writeAll(linhas);

        //gerando efetivamente o arquivo
        escritorCSV.flush();
        escritorCSV.close();


    }

}
