/**
 * Copyright (c) 2015-2017 <a href="">caishigou</a> All rights reserved.
 */
package org.seven.caishigou.test.repository;

import org.seven.caishigou.test.domain.Order;
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
public interface OrderRepository extends CustomRepository<Order, Integer> {

	/**
	 * 
	 * @date Dec 2, 2017 7:36:31 PM
	 * @Title: findByOrderNumberContaining 
	 * @Description: select o from Order o where o.orderNumber like ?1
	 * @param @param orderNumber
	 * @param @return
	 * @return List<Order>
	 * @throws
	 */
	@RestResource(path = "orderNumberContaining", rel = "orderNumberContaining")
	Page<Order> findByOrderNumberContaining(@Param("orderNumber") String orderNumber, Pageable pageable);
	
	/**
	 * 
	 * @date Dec 2, 2017 7:42:53 PM
	 * @Title: findByPhoneContaining 
	 * @Description: select o from Order o where o.phone like ?1
	 * @param @param userPhone
	 * @param @return
	 * @return List<Order>
	 * @throws
	 */
	@RestResource(path = "userPhoneContaining", rel = "userPhoneContaining")
	Page<Order> findByPhoneContaining(@Param("userPhone") String userPhone, Pageable pageable);
	
	/**
	 * 
	 * @date Dec 2, 2017 7:42:59 PM
	 * @Title: findByManagerPhoneContaining 
	 * @Description: select o from Order o where o.managerPhone like ?1
	 * @param @param managerPhone
	 * @param @return
	 * @return List<Order>
	 * @throws
	 */
	@RestResource(path = "managerPhoneContaining", rel = "managerPhoneContaining")
	Page<Order> findByManagerPhoneContaining(@Param("managerPhone") String managerPhone, Pageable pageable);
	
//	@RestResource(path = "shippingPhoneContaining", rel = "shippingPhoneContaining")
//	@Query("select o from Order o left join Shipping s on o.")
//	List<Order> withShippingPhoneQuery(@Param("shippingPhone") String shippingPhone);
	
	/**
	 * 
	 * @date Dec 2, 2017 7:43:04 PM
	 * @Title: findByUserIdIs 
	 * @Description: select o from Order o where o.userId=?1
	 * @param @param userId
	 * @param @return
	 * @return List<Order>
	 * @throws
	 */
	@RestResource(path = "userIdIs", rel = "userIdIs")
	Page<Order> findByUserIdIs(@Param("userId") Integer userId, Pageable pageable);
	
}