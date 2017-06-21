package com.jos.dem.internationalization.services

import javax.servlet.http.HttpServletRequest

interface LocaleService {
  String getMessage(String code, HttpServletRequest request)
}

