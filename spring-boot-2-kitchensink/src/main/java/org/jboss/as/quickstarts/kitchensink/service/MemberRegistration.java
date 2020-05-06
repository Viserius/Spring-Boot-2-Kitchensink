package org.jboss.as.quickstarts.kitchensink.service;

import org.jboss.as.quickstarts.kitchensink.data.MemberRepository;
import org.jboss.as.quickstarts.kitchensink.model.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MemberRegistration {

    Logger logger = LoggerFactory.getLogger(MemberRegistration.class);

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    public void register(Member member) {
        logger.info("Registering " + member.getName());
        memberRepository.save(member);
        applicationEventPublisher.publishEvent(member);
    }

}
