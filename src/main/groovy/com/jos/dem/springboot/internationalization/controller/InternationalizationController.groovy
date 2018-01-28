package com.jos.dem.springboot.internationalization.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class InternationalizationController {

  @RequestMapping("/")
  String index(){
    'Hello from Sring Boot!'
  }

}
