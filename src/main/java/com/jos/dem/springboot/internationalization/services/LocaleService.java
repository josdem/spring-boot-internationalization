package com.jos.dem.springboot.internationalization.services;

import javax.servlet.http.HttpServletRequest;

public interface LocaleService {
  String getMessage(String code, HttpServletRequest request);
}

