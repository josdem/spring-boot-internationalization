package com.jos.dem.springboot.internationalization.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired

import javax.servlet.http.HttpServletRequest
import com.jos.dem.springboot.internationalization.services.LocaleService

@RestController
class InternationalizationController {

  @Autowired
  LocaleService localeService

  @RequestMapping("/")
  String index(HttpServletRequest request){
    localeService.getMessage('user.hello', request)
  }

}
