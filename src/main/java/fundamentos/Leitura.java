package fundamentos;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Leitura {

    public static void main(String[] args) throws IOException {
        Reader leitor = Files.newBufferedReader(Paths.get("src/main/resources/dados/pessoas.csv"));//pega do arquivo e copia para o objeto leitor
        //System.out.println(leitor);
        CSVReader leitorCSV = new CSVReaderBuilder(leitor).withSkipLines(1).build();// pega o que está na memoria e descarta leitor a primeira linha
        //System.out.println(leitorCSV);

        List<String[]> pessoas = leitorCSV.readAll();
        //System.out.println(pessoas);
        for(String[] pessoa : pessoas){
            System.out.println("Nome: " + pessoa[0] + " - Idade: " + pessoa[1] + " - Email: " + pessoa[2]);
        }

    }


}
