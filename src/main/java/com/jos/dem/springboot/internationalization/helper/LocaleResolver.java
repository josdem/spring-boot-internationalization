package com.jos.dem.springboot.internationalization.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
class LocaleResolver extends AcceptHeaderLocaleResolver {

  private static final List<Locale> LOCALES = [new Locale("en"), new Locale("es")];

  private Logger log = LoggerFactory.getLogger(this.class);

  @Override
  public Locale resolveLocale(HttpServletRequest request) {
    if (!request.getHeader("Accept-Language")) {
      return Locale.getDefault();
    }
    List<Locale.LanguageRange> list = Locale.LanguageRange.parse(request.getHeader("Accept-Language"));
    Locale locale = Locale.lookup(list, LOCALES);
    return locale;
  }

}
