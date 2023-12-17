
package com.pi.manag.controller;

import com.pi.manag.entitie.Apartamento;
import com.pi.manag.entitie.Morador;
import com.pi.manag.entitie.Veiculo;
import com.pi.manag.service.ApartamentoService;
import com.pi.manag.service.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoradorController {
    @Autowired
    MoradorService service;
    @Autowired
    ApartamentoService serviceAp;
    
    /*CADASTRO MORADOR**********************************************************/
    /*
        FUNCIONALIDADE OK
    */
    @GetMapping("/cadMorador")
    public String pageCadastroMorador(Model model){
        Morador morador = new Morador();
        Apartamento apartamento = new Apartamento();
        Veiculo veiculo = new Veiculo();
        model.addAttribute("morador", morador);
        model.addAttribute("apartamento", apartamento);
    
        model.addAttribute("veiculo", veiculo);
        return "cadMorador";
    }
            @PostMapping("/cadastroMorador")
            public String cadastrarMorador(@ModelAttribute("morador") Morador morador,
                                            @ModelAttribute("apartamento")Apartamento apartamento,
                                             @ModelAttribute("veiculo")Veiculo veiculo){
                Apartamento ap = new Apartamento(apartamento.getNumeroApartamento(), apartamento.getAndar());
                Veiculo veic = new Veiculo(veiculo.getTipo(), veiculo.getModelo(), veiculo.getPlaca(), veiculo.getCor());
                Morador condomino = new Morador(morador.getTipo(), ap, veic, morador.getSexo(), morador.getRg(), morador.getNome());
                service.criarMorador(condomino, veiculo, apartamento);
                
                
              return "menu" ;
            }
    
    /****************************************************************************/
    
    /*ATUALIZAR MORADOR*/
    @GetMapping("/atualizaMorador")
    public String pageAtualizaCadMorador(Model model){
        model.addAttribute("morador", new Morador());
        model.addAttribute("apartamento", new Apartamento());
        model.addAttribute("veiculo", new Veiculo());
        return "atualizaMorador";
    }
    /*TELA CONSULTA MORADOR*/
    @GetMapping("/consultaMorador")
    public String pageConsultaMorador(Model model){
        model.addAttribute("morador", new Morador());
        model.addAttribute("apartamento", new Apartamento());
        model.addAttribute("veiculo", new Veiculo());
        return "consultaMorador";
    }
    
    @PostMapping("/consultarMorador")
    public String getDadosMorador(@RequestParam Integer id,Model model){
        Morador morador = service.getMoradorId(id);
        model.addAttribute("morador", morador);
        return "consultaMorador";
    }

}
