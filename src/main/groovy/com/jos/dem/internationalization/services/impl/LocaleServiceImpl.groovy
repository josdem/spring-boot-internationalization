package com.jos.dem.internationalization.services.impl

import org.springframework.context.MessageSource
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

import com.jos.dem.internationalization.services.LocaleService

@Service
class LocaleServiceImpl implements LocaleService {

  @Autowired
  MessageSource messageSource

  String getMessage(String code){
    messageSource.getMessage(code, null, new Locale("en"))
  }

}

