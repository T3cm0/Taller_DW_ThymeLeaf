package com.co.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/plantilla")
public class losPipolTemplateModelAndView {

    @GetMapping("/los-pipol-template-model-and-view")
    public ModelAndView losPipolTemplateModelAndView() {
        return new ModelAndView("los-pipol-template-model-and-view");
    }

}
