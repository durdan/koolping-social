package com.koolping.rest.user.exception;

import com.koolping.rest.exception.BaseWebApplicationException;

/**
 *
 * @version 1.0
 * @author: Iain Porter iain.porter@koolping.com
 * @since 14/09/2012
 */
public class TokenHasExpiredException extends BaseWebApplicationException {

    public TokenHasExpiredException() {
        super(403, "40304", "Token has expired", "An attempt was made to load a token that has expired");
    }
}
