package com;

public class CacheTest1 {

	public static void main(String[] args) {
		
		       // 1. initiate the cache with capacity 5 
				TimeAndSizeBasedEvictionCache<String, String> cache = new TimeAndSizeBasedEvictionCache<String, String>(5,1);

				// 2. insert 5 objects to cache
				for(int i=1; i<=5; i++) {
				cache.put(String.format("key-%d",  i), String.format("value-%d",  i));
				}

				// 3. print the cache objects
				System.out.println("printing cache:");
				cache.printCache();

				// 4. access the first object and print the cache
				cache.get("key-1");
				System.out.println("printing cache after accessing key-1:");
				cache.printCache();
				
				// 5. insert one more  objects to cache
				for(int i=6; i<7; i++) {
					cache.put(String.format("key-%d",  i), String.format("value-%d",  i));
				}
				
				
				// 6. print after adding one more object to cache 
				System.out.println("print after adding one more object to cache");
				cache.printCache();
				
				try {
					Thread.currentThread().sleep(61000);
					// 7. insert one more  objects to cache
					for(int i=7; i<8; i++) {
						cache.put(String.format("key-%d",  i), String.format("value-%d",  i));
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 8. print after adding one more object to cache after main thread sleep 
				System.out.println("print after adding one more object to cache after main thread sleep");
				cache.printCache();
				
	}
	
}
