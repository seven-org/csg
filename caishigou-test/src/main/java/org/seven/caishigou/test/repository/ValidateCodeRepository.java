/**
 * Copyright (c) 2015-2017 <a href="">caishigou</a> All rights reserved.
 */
package org.seven.caishigou.test.repository;

import java.util.List;

import org.seven.caishigou.test.domain.ValidateCode;
import org.seven.caishigou.test.repository.custom.CustomRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


/**
 * createTime: 2017-11-21 11:21:58
 * @author seven
 * @version
 */
public interface ValidateCodeRepository extends CustomRepository<ValidateCode, Integer> {
	
	/**
	 * 
	 * @date Dec 2, 2017 5:03:48 PM
	 * @Title: findByPhoneContaining 
	 * @Description: select v from ValidateCode v where v.phone like ?1
	 * @param @param phone
	 * @param @return
	 * @return List<User>
	 * @throws
	 */
	@RestResource(path = "phoneContaining", rel = "phoneContaining")
	List<ValidateCode> findByPhoneContaining(@Param("phone") String phone);

}