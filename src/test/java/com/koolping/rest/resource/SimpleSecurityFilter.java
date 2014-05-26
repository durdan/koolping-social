package com.koolping.rest.resource;

import com.koolping.rest.user.api.ExternalUser;
import com.koolping.rest.authorization.impl.SecurityContextImpl;
import com.koolping.rest.user.domain.User;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

/**
 * User: porter
 * Date: 08/05/2012
 * Time: 09:01
 */
public abstract class SimpleSecurityFilter implements ContainerRequestFilter {

    public ContainerRequest filter(ContainerRequest request) {
        ExternalUser externalUser = new ExternalUser(getUser());
        request.setSecurityContext(new SecurityContextImpl(externalUser));
        return request;
    }

    abstract User getUser();
}
