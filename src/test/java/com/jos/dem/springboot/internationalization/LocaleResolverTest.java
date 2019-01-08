package com.jos.dem.springboot.internationalization;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.jos.dem.springboot.internationalization.helper.LocaleResolver;

class LocaleResolverTest {

  @InjectMocks
  private LocaleResolver resolver = new LocaleResolver();

  @Mock
  private HttpServletRequest request;

  @BeforeEach
  void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  @DisplayName("should get locale default")
  void shouldGetDefaultLocale() {
    Locale result = resolver.resolveLocale(request);
    assertEquals(Locale.getDefault(), result);
  }

  @Test
  @DisplayName("should get en-US as locale")
  void shodldGetEnLocale() {
    when(request.getHeader("Accept-Language")).thenReturn("en-US,en;q=0.8");
    Locale result = resolver.resolveLocale(request);
    assertEquals(new Locale("en"), result);
  }

  @Test
  @DisplayName("should get es-MX as locale")
  void shouldGetEsLocale() {
    when(request.getHeader("Accept-Language")).thenReturn("es-MX,en-US;q=0.7,en;q=0.3");
    Locale result = resolver.resolveLocale(request);
    assertEquals(new Locale("es"), result);
  }

}
