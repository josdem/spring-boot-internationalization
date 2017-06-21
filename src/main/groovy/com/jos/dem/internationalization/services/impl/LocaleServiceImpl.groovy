package com.jos.dem.internationalization.services.impl

import org.springframework.context.MessageSource
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

import javax.servlet.http.HttpServletRequest

import com.jos.dem.internationalization.services.LocaleService
import com.jos.dem.internationalization.helper.LocaleResolver

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

