package com.jos.dem.springboot.internationalization.services.impl

import org.springframework.context.MessageSource
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

import javax.servlet.http.HttpServletRequest

import com.jos.dem.springboot.internationalization.helper.LocaleResolver
import com.jos.dem.springboot.internationalization.services.LocaleService

@Service
class LocaleServiceImpl implements LocaleService {

  @Autowired
  MessageSource messageSource
  @Autowired
  LocaleResolver localeResolver

  String getMessage(String code, HttpServletRequest request){
    messageSource.getMessage(code, null, localeResolver.resolveLocale(request))
  }

}

