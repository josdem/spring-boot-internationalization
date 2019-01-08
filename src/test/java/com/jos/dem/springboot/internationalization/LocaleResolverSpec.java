package com.jos.dem.springboot.internationalization

import javax.servlet.http.HttpServletRequest
import com.jos.dem.springboot.internationalization.helper.LocaleResolver
import spock.lang.Specification

class LocaleResolverSpec extends Specification {

	LocaleResolver resolver = new LocaleResolver()

	void "should get locale default"(){
		given:'A request'
		  HttpServletRequest request = Mock(HttpServletRequest)
    when:'We call resolve'
      Locale result = resolver.resolveLocale(request)
    then:'We expect default'
      Locale.getDefault() == result
	}

  void "should get en-US as locale"(){
		given:'A request'
		  HttpServletRequest request = Mock(HttpServletRequest)
    when:'We call resolve'
      request.getHeader('Accept-Language') >> 'en-US,en;q=0.8'
      Locale result = resolver.resolveLocale(request)
    then:'We expect default'
      result  == new Locale('en')
	}

  void "should get es-MX as locale"(){
		given:'A request'
		  HttpServletRequest request = Mock(HttpServletRequest)
    when:'We call resolve'
      request.getHeader('Accept-Language') >> 'es-MX,en-US;q=0.7,en;q=0.3'
      Locale result = resolver.resolveLocale(request)
    then:'We expect default'
      result  == new Locale('es')
	}

}
