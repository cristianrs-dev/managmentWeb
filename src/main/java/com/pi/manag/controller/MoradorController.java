
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
            public String cadastrarMorador(@ModelAttribute("morador") Morador m,
                                            @ModelAttribute("apartamento")Apartamento ap,
                                             @ModelAttribute("veiculo")Veiculo v){
               
                Apartamento apartamento = new Apartamento();
                apartamento.setAndar(ap.getAndar());
                apartamento.setNumeroApartamento(ap.getNumeroApartamento());
                
                Veiculo veiculo = new Veiculo();
                veiculo.setTipo(v.getTipo());
                veiculo.setModelo(v.getModelo());
                veiculo.setPlaca(v.getPlaca());
                veiculo.setCor(v.getCor());
                
                Morador condomino = new Morador(m.getTitular(), apartamento, veiculo, m.getSexo(), m.getRg(), m.getNome());
                
                service.criarMorador(condomino, veiculo, apartamento);
                
                
              return "menu" ;
            }
    
    
    /*ATUALIZAR MORADOR*/
    @GetMapping("/atualizaMorador")
    public String pageAtualizaCadMorador(Model model){
        
        Morador morador = new Morador();
        Apartamento apartamento = new Apartamento();
        Veiculo veiculo = new Veiculo();
        model.addAttribute("morador", morador);
        model.addAttribute("apartamento", apartamento);
        model.addAttribute("veiculo", veiculo);
        return "atualizaMorador";
    }
    
         
          @PostMapping("/atualizarMorador")
          public String getAtualizarMorador(@RequestParam(name="id") Integer id,
                                      /*  @ModelAttribute Morador morador,
                                        @ModelAttribute Apartamento ap,
                                        @ModelAttribute Veiculo automovel
                                        ,*/Model model){
              Morador condomino = service.getMoradorId(id);
              Apartamento apartamento = condomino.getApartamento();
              Veiculo veiculo = condomino.getVeiculo();
              service.atualizarMorador(id, condomino, veiculo, apartamento);
              /*
              Apartamento apartamento = new Apartamento(ap.getNumeroApartamento(), ap.getAndar());
              Veiculo veiculo = new Veiculo(automovel.getTipo(), automovel.getModelo(), automovel.getPlaca(), automovel.getCor());
             
                
                condomino.setNome(condomino.getNome());
                condomino.setSexo(condomino.getSexo());
                condomino.setRg(condomino.getRg());
                condomino.setTitular(condomino.getTitular());
                condomino.setApartamento(apartamento);
                veiculo.setTipo(automovel.getTipo());
                veiculo.setModelo(automovel.getModelo());
                veiculo.setPlaca(automovel.getPlaca());
                veiculo.setCor(automovel.getCor());
                service.atualizarMorador(condomino.getId(), condomino, veiculo, apartamento);
                */
                model.addAttribute("morador", condomino);
                model.addAttribute("veiculo", veiculo);
                model.addAttribute("apartamento", apartamento);
        return "atualizaMorador";
    }  
          
          
  
   
          
          
    /*TELA CONSULTA MORADOR*******************/
   @GetMapping("/consultaMorador")
    public String pageConsultaMorador(@ModelAttribute Morador morador,
                                      @ModelAttribute Apartamento apartamento,
                                      @ModelAttribute Veiculo veiculo,
                                        Model model){
       
        model.addAttribute("morador", morador);
        model.addAttribute("apartamento", apartamento);
        model.addAttribute("veiculo", veiculo);
        return "consultaMorador";
    }
    
    @PostMapping("/consultarMorador")
    public String consultarMorador(@RequestParam(name="id") Integer id,Model model){
        Morador morador = service.getMoradorId(id);
        Apartamento apartamento = morador.getApartamento();
        Veiculo veiculo = morador.getVeiculo();
        
        model.addAttribute("morador", morador);
        model.addAttribute("apartamento", apartamento);
        model.addAttribute("veiculo", veiculo);
        
   
        return "consultaMorador";
    }
   

}
