package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_red_packet_rule database table.
 * 
 */
@Entity
@Table(name="t_red_packet_rule")
@NamedQuery(name="RedPacketRule.findAll", query="SELECT r FROM RedPacketRule r")
public class RedPacketRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="red_packet_id")
	private Integer redPacketId;

	private String rule;

	private Integer tag;

	public RedPacketRule() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getRedPacketId() {
		return this.redPacketId;
	}

	public void setRedPacketId(int redPacketId) {
		this.redPacketId = redPacketId;
	}

	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public Integer getTag() {
		return this.tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

}