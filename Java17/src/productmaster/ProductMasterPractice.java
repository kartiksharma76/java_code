package com.jdbc.productmaster;

/**
 * private String product_no; private String description; private int percent;
 * private String unit_measure; private int qty_on_hand; private int reoder_lvl;
 * private int sell_price; private int cost_price;
 * 
 */
public class ProductMasterPractice {
	public static void main(String[] args) {
		ProductMaster master = new ProductMaster();
		master.setProduct_no("P00001");
		master.setDescription("1.44floppies");
		master.setPercent(5);
		master.setUnit_measure("piece");
		master.setQty_on_hand(100);
		master.setReoder_lvl(20);
		master.setSell_price(525);
		master.setCost_price(500);
		// ProductmasterP.insert(master);

		master.setProduct_no("P03453");
		master.setDescription("Monitors");
		master.setPercent(6);
		master.setUnit_measure("Piece");
		master.setQty_on_hand(10);
		master.setReoder_lvl(3);
		master.setSell_price(12000);
		master.setCost_price(11200);
		ProductmasterP.insert(master);

		master.setProduct_no("P06734");
		master.setDescription("Mouse");
		master.setPercent(5);
		master.setUnit_measure("Piece");
		master.setQty_on_hand(20);
		master.setReoder_lvl(5);
		master.setSell_price(1050);
		master.setCost_price(500);
		ProductmasterP.insert(master);

		master.setProduct_no("P07865");
		master.setDescription("1.22 floppies");
		master.setPercent(5);
		master.setUnit_measure("Piece");
		master.setQty_on_hand(100);
		master.setReoder_lvl(20);
		master.setSell_price(525);
		master.setCost_price(500);
		ProductmasterP.insert(master);

		master.setProduct_no("P07868");
		master.setDescription("Keyboards");
		master.setPercent(2);
		master.setUnit_measure("Piece");
		master.setQty_on_hand(10);
		master.setReoder_lvl(3);
		master.setSell_price(3150);
		master.setCost_price(3050);
		ProductmasterP.insert(master);

		master.setProduct_no("P07885");
		master.setDescription("CD Drive");
		master.setPercent(2); // originally 2.5 — make sure to change your model to `double` if needed
		master.setUnit_measure("Piece");
		master.setQty_on_hand(10);
		master.setReoder_lvl(3);
		master.setSell_price(5250);
		master.setCost_price(5100);
		ProductmasterP.insert(master);

		master.setProduct_no("P07965");
		master.setDescription("540 HDD");
		master.setPercent(4);
		master.setUnit_measure("Piece");
		master.setQty_on_hand(10);
		master.setReoder_lvl(3);
		master.setSell_price(8400);
		master.setCost_price(8000);
		ProductmasterP.insert(master);

		master.setProduct_no("P07975");
		master.setDescription("1.44 Drive");
		master.setPercent(5);
		master.setUnit_measure("Piece");
		master.setQty_on_hand(10);
		master.setReoder_lvl(3);
		master.setSell_price(1050);
		master.setCost_price(1000);
		ProductmasterP.insert(master);

		master.setProduct_no("P08865");
		master.setDescription("1.22 Drive");
		master.setPercent(5);
		master.setUnit_measure("Piece");
		master.setQty_on_hand(2);
		master.setReoder_lvl(3);
		master.setSell_price(1050);
		master.setCost_price(1000);
		ProductmasterP.insert(master);
	}
}
