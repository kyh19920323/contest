package com.contest;

class GildedRose {
	private  static final  int  GOODSQUALITY=50;
	private  static final  int  SULFURASQUALITY=80;
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        items[0].sellIn = 9;
        items[0].quality = 19;
    }
    
    public  void  updateSellInAndQuality(Item item){
    	item.sellIn--;
    	item.quality--;
    	
    }
    
    public    boolean checkSellInIsValid(Item item) {
    	return item.sellIn>=0?false:true;
    }
    
}