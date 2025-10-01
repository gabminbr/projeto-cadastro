package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeitorQuestionario{
    private static Path caminho = Paths.get("src", "formulario.txt");

    public static void leituraQuestionario() throws IOException{
        List<String> perguntas = Files.readAllLines(caminho);
        for(String pergunta : perguntas){
            System.out.println(pergunta);
        }
    }
}
