package us.craigcarpenter.bizsoft.svc.session;

import java.util.Optional;

public interface BizSessionService {
	Optional<BizSession> login(LoginCredentials credentials);
}
