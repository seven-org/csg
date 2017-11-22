package org.seven.caishigou.test.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_bank database table.
 * 
 */
@Entity
@Table(name="t_bank")
@NamedQuery(name="Bank.findAll", query="SELECT b FROM Bank b")
public class Bank implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="bank_card")
	private String bankCard;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_info_id")
	private BankInfo bankInfo;

	@Column(name="bank_name")
	private String bankName;

	@Column(name="card_holder")
	private String cardHolder;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="id_card")
	private String idCard;

	@Column(name="item_id")
	private Integer itemId;

	@Column(name="open_bank")
	private String openBank;

	private String phone;

	private String photo;

	private Integer status;

	private Integer type;

	public Bank() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public BankInfo getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardHolder() {
		return this.cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getOpenBank() {
		return this.openBank;
	}

	public void setOpenBank(String openBank) {
		this.openBank = openBank;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}