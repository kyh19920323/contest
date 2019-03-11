package com.contest;

public class BackstagePasses extends Item {
	public  int showdate;
	
	public BackstagePasses(String name, int sellIn, int quality,int showdate) {
			super(name, sellIn, quality);
	        this.showdate=showdate;
		}

}
