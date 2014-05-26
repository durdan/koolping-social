package com.koolping.rest.authorization.impl;

import com.koolping.rest.user.api.ExternalUser;
import com.koolping.rest.user.domain.Role;
import com.koolping.rest.authorization.exception.InvalidAuthorizationHeaderException;

import javax.ws.rs.core.SecurityContext;
import java.security.Principal;

/**
 * Implementation of {@link javax.ws.rs.core.SecurityContext}
 *
 * User: porter
 * Date: 16/03/2012
 * Time: 16:13
 */
public class SecurityContextImpl implements SecurityContext {

    private final ExternalUser user;

    public SecurityContextImpl(ExternalUser user) {
        this.user = user;
    }

    public Principal getUserPrincipal() {
        return user;
    }

    public boolean isUserInRole(String role) {
        if(role.equalsIgnoreCase(Role.anonymous.name())) {
             return true;
        }
        if(user == null) {
            throw new InvalidAuthorizationHeaderException();
        }
        return user.getRole().equalsIgnoreCase(role);
    }

    public boolean isSecure() {
        return false;
    }

    public String getAuthenticationScheme() {
        return SecurityContext.BASIC_AUTH;
    }
}
