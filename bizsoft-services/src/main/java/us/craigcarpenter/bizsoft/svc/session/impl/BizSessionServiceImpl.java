package us.craigcarpenter.bizsoft.svc.session.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.craigcarpenter.bizsoft.model.BizUser;
import us.craigcarpenter.bizsoft.repository.BizUserRepository;
import us.craigcarpenter.bizsoft.svc.session.BizSession;
import us.craigcarpenter.bizsoft.svc.session.BizSessionService;
import us.craigcarpenter.bizsoft.svc.session.LoginCredentials;

import javax.inject.Named;
import java.util.Optional;
import java.util.UUID;

@Named
public class BizSessionServiceImpl implements BizSessionService	 {
	private static final Logger log = LoggerFactory.getLogger(BizSessionServiceImpl.class);

	private final BizUserRepository bizUserRepository;

	public BizSessionServiceImpl(BizUserRepository bur) {
		this.bizUserRepository = bur;
	}

	@Override
	public Optional<BizSession> login(LoginCredentials credentials) {
		log.debug("Login {}", credentials.getUsername());
		Optional<BizUser> opUser = bizUserRepository.findByName(credentials.getUsername());
		if(!opUser.isPresent()) {
			log.info("No Such User {}", credentials.getUsername());
			return Optional.empty();
		}
		BizUser user = opUser.get();
		log.debug("Found user {}", user.getName());
		BizSession session = new BizSession().setSessionId(UUID.randomUUID().toString());
		return Optional.ofNullable(session);
	}
}
