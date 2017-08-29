package com.oauthclient.oauth2;

import org.apache.shiro.authc.AuthenticationException;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-18
 * <p>Version: 1.0
 */
public class OAuth2AuthenticationException extends AuthenticationException {


	private static final long serialVersionUID = 742959339656362503L;

	public OAuth2AuthenticationException(Throwable cause) {
        super(cause);
    }
}
