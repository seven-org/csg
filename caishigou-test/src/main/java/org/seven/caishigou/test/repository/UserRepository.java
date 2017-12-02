/**
 * Copyright (c) 2015-2017 <a href="">caishigou</a> All rights reserved.
 */
package org.seven.caishigou.test.repository;

import java.util.List;

import org.seven.caishigou.test.domain.User;
import org.seven.caishigou.test.repository.custom.CustomRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


/**
 * createTime: 2017-11-21 11:21:58
 * @author seven
 * @version
 */
public interface UserRepository extends CustomRepository<User, Integer> {

	/**
	 * 
	 * @date Dec 2, 2017 5:00:20 PM
	 * @Title: findByNameContaining 
	 * @Description: select p from Person p where p.name like ?1
	 * @param @param name
	 * @param @return
	 * @return List<User>
	 * @throws
	 */
	@RestResource(path = "nameContaining", rel = "nameContaining")
	List<User> findByNameContaining(@Param("name") String name);
	
	/**
	 * 
	 * @date Dec 2, 2017 5:01:41 PM
	 * @Title: findByPhoneContaining 
	 * @Description: select p from Person p where p.phone like ?1
	 * @param @param name
	 * @param @return
	 * @return List<User>
	 * @throws
	 */
	@RestResource(path = "phoneContaining", rel = "phoneContaining")
	List<User> findByPhoneContaining(@Param("phone") String phone);
	
}