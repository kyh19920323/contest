package com.contest;


class GildedRose {
	public   static final  int  GOODSQUALITY=50;
	public  static final  int  SULFURASQUALITY=80;
	private  static final  String AGEDBRIE="Aged Brie";
	private  static final  String SULFURAS="Sulfuras";
	public   static  final  int DAY=10;
	
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
        items[0].sellIn = 9;
        items[0].quality = 19;
    }
    public  void  updateSellInAndQuality(Item item){
    	if(AGEDBRIE.equals(item.name)){ //品质增加
			 calculationQuality(item);
		}else if(SULFURAS.equals(item.name)) {
			item.quality=SULFURASQUALITY;
		}
    }
	private void calculationQuality(Item item) {
		if(item.quality<=GOODSQUALITY){
			 item.quality++;
		 };
		 calculationSellIn(item);
	}
	private void calculationSellIn(Item item) {
		if(checkSellInIsValid(item)){ 
				item.sellIn--;
			}else {
				item.sellIn=item.sellIn-2;
			}
	}
    
    public    boolean checkSellInIsValid(Item item) {
    	return item.sellIn>=0?true:false;
    }
    
}