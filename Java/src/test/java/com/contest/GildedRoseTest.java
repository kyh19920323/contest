package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void should_fix_me() {
        Item[] items = new Item[] { new Item("normal", 10, 20) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
    }
    @Test
    public void check_item_SellIn() {
        Item[] items = new Item[] { new Item("normal", 10, 20) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();
        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
        
        gildedRose.updateSellInAndQuality((gildedRose.items[0]));
        assertEquals(8, (gildedRose.items[0]).sellIn);
        assertEquals(18, gildedRose.items[0].quality);
        
        
    }
    
    @Test
    public void check_item_SellIsValid() {
        Item[] items = new Item[] { new Item("normal", 10, 20) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();
        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
        
        gildedRose.updateSellInAndQuality((gildedRose.items[0]));
        assertEquals(8, (gildedRose.items[0]).sellIn);
        assertEquals(18, gildedRose.items[0].quality);
         boolean validFlage= gildedRose.checkSellInIsValid(gildedRose.items[0]);
          if (validFlage) {
			System.out.println(validFlage);
		}
        
    }
    
}
