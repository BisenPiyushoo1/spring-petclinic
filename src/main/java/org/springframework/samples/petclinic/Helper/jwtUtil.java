package org.springframework.samples.petclinic.Helper;

import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class jwtUtil {
	private String SECRET_KEY_STRING;
	private Long expiration;
	private Key SECRET_KEY(){
		return Keys.hmac
	}

}
