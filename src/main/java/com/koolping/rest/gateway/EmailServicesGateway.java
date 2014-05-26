package com.koolping.rest.gateway;

import com.koolping.rest.user.EmailServiceTokenModel;

/**
 *
 * @version 1.0
 * @author: Iain Porter iain.porter@koolping.com
 * @since 11/09/2012
 */
public interface EmailServicesGateway {

    public void sendVerificationToken(EmailServiceTokenModel model);
}
