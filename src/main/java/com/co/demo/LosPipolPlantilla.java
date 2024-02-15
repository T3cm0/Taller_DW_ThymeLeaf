package com.co.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/plantillas")
public class LosPipolPlantilla {


	@GetMapping("/los-pipol-solo-texto")
	public String losPipolSoloTexto() {
		return "los-pipol-solo-texto";
	}

    
}
