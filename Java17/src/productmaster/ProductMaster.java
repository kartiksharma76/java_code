package com.jdbc.productmaster;

public class ProductMaster {
	/**
	 * product_no VARCHAR(10), description VARCHAR(50), profit_percent DECIMAL(5,2),
	 * unit_measure VARCHAR(5), qty_on_hand INT, reoder_lvl INT, sell_price INT,
	 * cost_price INT
	 */
	private String product_no;
	private String description;
	private int percent;
	private String unit_measure;
	private int qty_on_hand;
	private int reoder_lvl;
	private int sell_price;
	private int cost_price;

	public String getProduct_no() {
		return product_no;
	}

	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public String getUnit_measure() {
		return unit_measure;
	}

	public void setUnit_measure(String unit_measure) {
		this.unit_measure = unit_measure;
	}

	public int getQty_on_hand() {
		return qty_on_hand;
	}

	public void setQty_on_hand(int qty_on_hand) {
		this.qty_on_hand = qty_on_hand;
	}

	public int getReoder_lvl() {
		return reoder_lvl;
	}

	public void setReoder_lvl(int reoder_lvl) {
		this.reoder_lvl = reoder_lvl;
	}

	public int getSell_price() {
		return sell_price;
	}

	public void setSell_price(int sell_price) {
		this.sell_price = sell_price;
	}

	public int getCost_price() {
		return cost_price;
	}

	public void setCost_price(int cost_price) {
		this.cost_price = cost_price;
	}
}
