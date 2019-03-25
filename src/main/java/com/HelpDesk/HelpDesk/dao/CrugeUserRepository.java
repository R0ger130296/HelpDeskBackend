package com.HelpDesk.HelpDesk.dao;

import org.springframework.data.repository.CrudRepository;

import com.HelpDesk.HelpDesk.model.CrugeUser;

public interface CrugeUserRepository extends CrudRepository<CrugeUser, Long>{
	@SuppressWarnings("unchecked")
	CrugeUser save (CrugeUser gestionCrugeUser);
}
