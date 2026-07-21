package dev.projetojava.PrimeiroProjetoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Dizendo ao java que aqui é um controller da api Rest
@RestController
//Marca que é aqui que irei criar minhas rotas.
@RequestMapping("/")
public class Controller {
    //Recebe requisições de leitura.
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Olá mundo!";
    }

}
