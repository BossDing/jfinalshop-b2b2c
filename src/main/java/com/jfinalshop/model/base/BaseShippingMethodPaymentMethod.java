package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseShippingMethodPaymentMethod<M extends BaseShippingMethodPaymentMethod<M>> extends Model<M> implements IBean {

	public void setShippingMethodsId(java.lang.Long shippingMethodsId) {
		set("shipping_methods_id", shippingMethodsId);
	}

	public java.lang.Long getShippingMethodsId() {
		return getLong("shipping_methods_id");
	}

	public void setPaymentMethodsId(java.lang.Long paymentMethodsId) {
		set("payment_methods_id", paymentMethodsId);
	}

	public java.lang.Long getPaymentMethodsId() {
		return getLong("payment_methods_id");
	}

}
