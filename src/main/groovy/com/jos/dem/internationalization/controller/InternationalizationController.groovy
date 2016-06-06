package com.jos.dem.internationalization

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class InternationalizationController {

  @RequestMapping("/")
  String index(){
    'Hello from Sring Boot!'
  }

}
