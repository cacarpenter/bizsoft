package us.craigcarpenter.bizsoft.svc.user.impl;

import us.craigcarpenter.bizsoft.model.BizUser;
import us.craigcarpenter.bizsoft.repository.BizUserRepository;
import us.craigcarpenter.bizsoft.svc.user.BizUserService;

import javax.inject.Named;
import java.util.Optional;

@Named
public class BizUserServiceImpl implements BizUserService {

	private final BizUserRepository bizUserRepository;

	public BizUserServiceImpl(BizUserRepository bur) {
		this.bizUserRepository = bur;
	}

	@Override
	public Optional<BizUser> findById(String bizUserId) {
		return bizUserRepository.findById(bizUserId);
	}
}
