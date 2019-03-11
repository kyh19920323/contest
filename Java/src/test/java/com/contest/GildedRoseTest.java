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
          if (!validFlage) {
			System.out.println(validFlage);
		}
        
    }
    
    @Test
    public void check_item_AgeBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 20) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateSellInAndQuality(gildedRose.items[0]);
        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(21, gildedRose.items[0].quality);
        
    }
    
    @Test
    public void check_item_SellInIsValid() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 20) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateSellInAndQuality(gildedRose.items[0]);
        assertEquals(-1, (gildedRose.items[0]).sellIn);
        assertEquals(21, gildedRose.items[0].quality);
        
    }
    
    @Test
    public void check_item_sulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras", 10, 20) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateSellInAndQuality(gildedRose.items[0]);
        assertEquals(10, (gildedRose.items[0]).sellIn);
        assertEquals(10, gildedRose.items[0].quality);
        
    }
    
    @Test
    public void check_item_BackstagePasses() {
        Item[] items = new Item[] { new BackstagePasses("Backstage passes", 10, 20,10) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateSellInAndQuality(gildedRose.items[0]);
        assertEquals(10, (gildedRose.items[0]).sellIn);
        assertEquals(10, gildedRose.items[0].quality);
        
    }
    
    
}
