package org.jboss.as.quickstarts.kitchensink.util;

import org.jboss.as.quickstarts.kitchensink.model.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.faces.context.FacesContext;

@Component
public class Resources {

    @Bean(value = "newMember")
    public Member createNewMember() {
        return new Member();
    }

}
