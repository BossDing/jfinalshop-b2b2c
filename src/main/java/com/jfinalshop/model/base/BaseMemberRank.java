package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMemberRank<M extends BaseMemberRank<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setCreatedDate(java.util.Date createdDate) {
		set("created_date", createdDate);
	}

	public java.util.Date getCreatedDate() {
		return get("created_date");
	}

	public void setLastModifiedDate(java.util.Date lastModifiedDate) {
		set("last_modified_date", lastModifiedDate);
	}

	public java.util.Date getLastModifiedDate() {
		return get("last_modified_date");
	}

	public void setVersion(java.lang.Long version) {
		set("version", version);
	}

	public java.lang.Long getVersion() {
		return getLong("version");
	}

	public void setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
	}

	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public void setIsDefault(java.lang.Boolean isDefault) {
		set("is_default", isDefault);
	}

	public java.lang.Boolean getIsDefault() {
		return get("is_default");
	}

	public void setIsSpecial(java.lang.Boolean isSpecial) {
		set("is_special", isSpecial);
	}

	public java.lang.Boolean getIsSpecial() {
		return get("is_special");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return getStr("name");
	}

	public void setScale(java.lang.Double scale) {
		set("scale", scale);
	}

	public java.lang.Double getScale() {
		return getDouble("scale");
	}

}
