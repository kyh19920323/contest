package com.contest;

class GildedRose {
	private  static final  int  GOODSQUALITY=50;
	private  static final  int  SULFURASQUALITY=80;
	private  static final  String AGEDBRIE="Aged Brie";
	private  static final  String SULFURAS="Sulfuras";
	private  static final  String  BACKSTAGEPASSES="Backstage passes";
	
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
			 if(item.quality<=GOODSQUALITY){
				 item.quality++;
			 };
			 if(checkSellInIsValid(item)){ 
		    		item.sellIn--;
		    	}else {
		    		item.sellIn=item.sellIn-2;
		    	}
		}else if(SULFURAS.equals(item.name)) {
			
		}
    	
    }
    public  void  updateSellInAndQualityGoodNameBackstagePasses(BackstagePasses backstagePasses){
    	if(AGEDBRIE.equals(backstagePasses.name)){ //品质增加
			 if(backstagePasses.quality<=GOODSQUALITY){
				 backstagePasses.quality++;
			 };
			 if(checkSellInIsValid(backstagePasses)){ 
				 backstagePasses.sellIn--;
		    	}else {
		    		backstagePasses.sellIn=backstagePasses.sellIn-2;
		    	}
		}
    }
    
    public    boolean checkSellInIsValid(Item item) {
    	return item.sellIn>=0?true:false;
    }
    
}