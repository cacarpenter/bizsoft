package us.craigcarpenter.bizsoft.svc.user;

import us.craigcarpenter.bizsoft.model.BizUser;

import java.util.Optional;

public interface BizUserService {
	Optional<BizUser> findById(String bizUserId);

	BizUser createUser(BizUser user);
}
