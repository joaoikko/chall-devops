package br.com.fiap.carro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.carro.model.Modelo;
import br.com.fiap.carro.repository.CarroRepository;
import br.com.fiap.carro.repository.ModeloRepository;

@Controller
@RequestMapping("modelo")
public class ModeloController {

    @Autowired
    private ModeloRepository repository;

    @Autowired
    private CarroRepository atletaRepository;

    @GetMapping("detalhes/{id}")
    public String detalhar(@PathVariable("id") int codigo, Model model){
        model.addAttribute("modelo", repository.findById(codigo).get());
        model.addAttribute("carros", atletaRepository.findByModelo_Codigo(codigo));
        return "modelo/detalhes";
    }

    @GetMapping("modelo")
    public String listar(Model model){
        model.addAttribute("modelos", repository.findAll());
        return "modelo/lista";
    }

    @GetMapping("cadastrar")
    public String cadastrar(Modelo modelo){
        return "modelo/form";
    }

    @PostMapping("cadastrar")
    public String cadastrar(Modelo modelo, RedirectAttributes redirect){
        repository.save(modelo);
        redirect.addFlashAttribute("msg","Cadastrado!");
        return "redirect:/modelo/cadastrar";
    }

}
