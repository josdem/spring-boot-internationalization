package com.jos.dem.springboot.internationalization.helper;

import java.util.List;
import java.util.Arrays;
import java.util.Locale;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class LocaleResolver extends AcceptHeaderLocaleResolver {

  private static final List<Locale> LOCALES = Arrays.asList(new Locale("en"), new Locale("es"));

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @Override
  public Locale resolveLocale(HttpServletRequest request) {
    if (request.getHeader("Accept-Language") != null) {
      return Locale.getDefault();
    }
    List<Locale.LanguageRange> list = Locale.LanguageRange.parse(request.getHeader("Accept-Language"));
    Locale locale = Locale.lookup(list, LOCALES);
    return locale;
  }

}
