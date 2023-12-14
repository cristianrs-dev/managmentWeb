
package com.pi.manag.service;

import com.pi.manag.repository.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoradorService {
    @Autowired
    MoradorRepository service;
    
    
}
