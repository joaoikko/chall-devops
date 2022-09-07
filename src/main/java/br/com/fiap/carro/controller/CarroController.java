package br.com.fiap.carro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.carro.model.Carro;
import br.com.fiap.carro.repository.CarroRepository;
import br.com.fiap.carro.repository.ModeloRepository;

@Controller
@RequestMapping("carro")
public class CarroController {

    @Autowired
    private CarroRepository atletaRepository;

    @Autowired
    private ModeloRepository modalidadeRepository;

    @GetMapping("buscar")
    public String buscar(String nomeBusca, Model model ){
        model.addAttribute("carro", atletaRepository.findByNomeContainsIgnoreCase(nomeBusca));
        return "carro/lista";
    }

    @GetMapping("carro")
    public String listar(Model model){
        model.addAttribute("carro", atletaRepository.findAll());
        return "carro/lista";
    }

    @GetMapping("cadastrar")
    public String cadastrar(Carro carro, Model model){
        model.addAttribute("modelos", modalidadeRepository.findAll());
        return "carro/form";
    }

    @PostMapping("cadastrar")
    public String cadastrar(Carro carro, RedirectAttributes redirect){
        atletaRepository.save(carro);
        redirect.addFlashAttribute("msg", "Cadastrado");
        return "redirect:/carro/cadastrar";
    }

}
