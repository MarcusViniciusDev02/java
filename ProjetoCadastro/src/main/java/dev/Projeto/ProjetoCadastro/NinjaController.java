package dev.Projeto.ProjetoCadastro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Mapeia e fala pro java que aqui é um controller.
@RequestMapping //Mapeia as requisições
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota.";
    }



}
