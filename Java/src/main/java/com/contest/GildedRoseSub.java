package com.contest;

public class GildedRoseSub extends GildedRose {

	public GildedRoseSub(Item[] items) {
		super(items);
	}
	
	public  void  updateSellInAndQuality(BackstagePasses backstagePasses){
    	if(backstagePasses.showdate >DAY  && backstagePasses.quality<=GOODSQUALITY ) {
    		backstagePasses.quality++;
  	  } else if (backstagePasses.showdate>=5 && backstagePasses.showdate<=10 && backstagePasses.quality<=GOODSQUALITY ){
  		backstagePasses.quality=backstagePasses.quality+2;
  	  } else if(backstagePasses.showdate>0 && backstagePasses.showdate<=5 && backstagePasses.quality<=GOODSQUALITY){
	  		backstagePasses.quality=backstagePasses.quality+3;
	  }else {
		  backstagePasses.quality=0;
  	  }
		checkDate(backstagePasses);
}

	private void checkDate(BackstagePasses backstagePasses) {
		if(backstagePasses.showdate>=0){
			backstagePasses.showdate--;
		}
		calculationSellIn(backstagePasses);
	}

	private void calculationSellIn(BackstagePasses backstagePasses) {
		if(checkSellInIsValid(backstagePasses)){ 
			backstagePasses.sellIn--;
		}else {
			backstagePasses.sellIn=backstagePasses.sellIn-2;
		}
	}

}
