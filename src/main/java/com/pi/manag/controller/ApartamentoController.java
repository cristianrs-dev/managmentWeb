
package com.pi.manag.controller;

import com.pi.manag.service.ApartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class ApartamentoController {
    
    @Autowired
    ApartamentoService service;
    
    
}
