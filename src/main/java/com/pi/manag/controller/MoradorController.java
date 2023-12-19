
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
          public String getRegistroMorador(@RequestParam Integer id,
                                            Model model){
              Morador encontrado = service.getMoradorId(id);
              Apartamento apEncontrado = encontrado.getApartamento();
              Veiculo vEncontrado = encontrado.getVeiculo();
 
                model.addAttribute("morador", encontrado);
                model.addAttribute("veiculo", vEncontrado);
                model.addAttribute("apartamento", apEncontrado);
        return "atualizaMorador";
    }  
          @PostMapping("/registroAtualizado")
          public String putRegistroMorador(@ModelAttribute Morador m,
                                           @ModelAttribute Apartamento ap,
                                           @ModelAttribute Veiculo v){
              
              //Morador novoMorador = new Morador(m.getTitular(), 
              //                          ap, v, m.getSexo(), m.getRg(), m.getNome());
              service.atualizarMorador(m.getId(), m, v, ap);
              return "menuAdmMorador";
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
