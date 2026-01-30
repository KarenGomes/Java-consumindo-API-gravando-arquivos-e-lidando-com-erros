import br.com.viacep.controller.ViaCepController;
import br.com.viacep.models.Endereco;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String busca = "";
        ViaCepController viaCep = new ViaCepController();
        List<Endereco> listaEnderecos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")){
            System.out.println("Digite um CEP: ");
            busca = scanner.nextLine();

            if(busca.equalsIgnoreCase("sair")) break;

            try {
                listaEnderecos.add(viaCep.buscaEndereco(busca.replace("-", "")));
            }catch (Exception e){
                System.out.println("Erro na requisição" + e.getMessage());
            }
        }

        FileWriter file = new FileWriter("enderecos.json");
        file.write(listaEnderecos.toString());
        file.close();
    }
}