package com.jos.dem.springboot.internationalization.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import com.jos.dem.springboot.internationalization.services.LocaleService;

@RestController
class InternationalizationController {

  @Autowired
  private LocaleService localeService;

  @RequestMapping("/")
  public String index(HttpServletRequest request){
    return localeService.getMessage("user.hello", request);
  }

}
