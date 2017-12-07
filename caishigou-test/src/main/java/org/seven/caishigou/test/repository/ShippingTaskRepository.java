/**
 * Copyright (c) 2015-2017 <a href="">caishigou</a> All rights reserved.
 */
package org.seven.caishigou.test.repository;

import org.seven.caishigou.test.domain.ShippingTask;
import org.seven.caishigou.test.repository.custom.CustomRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


/**
 * createTime: 2017-11-21 11:21:57
 * @author seven
 * @version
 */
public interface ShippingTaskRepository extends CustomRepository<ShippingTask, Integer> {

	/**
	 * 
	 * @date Dec 7, 2017 10:47:06 AM
	 * @Title: findByshippingIdIs 
	 * @Description: select o from Shipping o where o.shippingId=?1
	 * @param @param shippingId
	 * @param @param pageable
	 * @param @return
	 * @return Page<ShippingTask>
	 * @throws
	 */
	@RestResource(path = "shippingIdIs", rel = "shippingIdIs")
	Page<ShippingTask> findByshippingIdIs(@Param("shippingId") Integer shippingId, Pageable pageable);
	
}