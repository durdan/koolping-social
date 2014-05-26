package com.koolping.rest.authorization;

import com.koolping.rest.user.api.ExternalUser;

/**
 *
 * @author: Iain Porter
 */
public interface AuthorizationService {

    /**
     * Given an AuthorizationRequestContext validate and authorize a User
     *
     * @param authorizationRequestContext the context required to authorize a user for a particular request
     * @return ExternalUser
     */
    public ExternalUser authorize(AuthorizationRequestContext authorizationRequestContext);
}
