package com.jos.dem.internationalization

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired

import com.jos.dem.internationalization.services.LocaleService

@RestController
class InternationalizationController {

  @Autowired
  LocaleService localeService

  @RequestMapping("/")
  String index(){
    localeService.getMessage('user.hello')
  }

}
