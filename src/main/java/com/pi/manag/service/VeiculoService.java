
package com.pi.manag.service;

import com.pi.manag.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {
    @Autowired
    VeiculoRepository service;
}
