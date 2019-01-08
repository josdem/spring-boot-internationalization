package com.jos.dem.springboot.internationalization.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.context.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

import com.jos.dem.springboot.internationalization.helper.LocaleResolver;
import com.jos.dem.springboot.internationalization.services.LocaleService;

@Service
public class LocaleServiceImpl implements LocaleService {

  @Autowired
  private MessageSource messageSource;
  @Autowired
  private LocaleResolver localeResolver;

  public String getMessage(String code, HttpServletRequest request){
    return messageSource.getMessage(code, null, localeResolver.resolveLocale(request));
  }

}

