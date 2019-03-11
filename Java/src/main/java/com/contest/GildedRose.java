package com.contest;


class GildedRose {
	private  static final  int  GOODSQUALITY=50;
	private  static final  int  SULFURASQUALITY=80;
	private  static final  String AGEDBRIE="Aged Brie";
	private  static final  String SULFURAS="Sulfuras";
	private  static final  String  BACKSTAGEPASSES="Backstage passes";
	private  static  final  int DAY=10;
	
	
	
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
			item.quality=SULFURASQUALITY;
		}
    	
    }
    public  void  updateSellInAndQualityGoodNameBackstagePasses(BackstagePasses backstagePasses){
	    	if(backstagePasses.showdate >DAY  && backstagePasses.quality<=GOODSQUALITY ) {
	    		backstagePasses.quality++;
	    		
	  	  } else if (backstagePasses.showdate>=5 && backstagePasses.showdate<=10 && backstagePasses.quality<=GOODSQUALITY ){
	  		backstagePasses.quality=backstagePasses.quality+2;
	  	  } else if(backstagePasses.showdate>0 && backstagePasses.showdate<=5 && backstagePasses.quality<=GOODSQUALITY){
		  		backstagePasses.quality=backstagePasses.quality+3;
		  }else {
			  backstagePasses.quality=0;
	  	  }
			if(backstagePasses.showdate>=0){
				backstagePasses.showdate--;
			}
			if(checkSellInIsValid(backstagePasses)){ 
				backstagePasses.sellIn--;
	    	}else {
	    		backstagePasses.sellIn=backstagePasses.sellIn-2;
	    	}
    }
    
    public    boolean checkSellInIsValid(Item item) {
    	return item.sellIn>=0?true:false;
    }
    
}