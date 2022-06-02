package com;

public class CacheTest2 {

	public static void main(String[] args) {

		

		// 1. initiate the cache with capacity 5
		LeastRecentlyUsedCache<String, String> cache = new LeastRecentlyUsedCache<String, String>(5);

		// 2. insert 5 objects to cache
		for (int i = 1; i <= 5; i++) {
			cache.put(String.format("key-%d", i), String.format("value-%d", i));
		}

		// 3. print the cache objects
		System.out.println("printing cache:");
		cache.printCache();

		// 4. access the first object and print the cache
		cache.get("key-1");
		System.out.println("printing cache after accessing key-1:");
		cache.printCache();

		// 5. insert one more objects to cache
		for (int i = 5; i <= 6; i++) {
			cache.put(String.format("key-%d", i), String.format("value-%d", i));
		}

		// 6. print the cache and observe that the least recently used objects are
		// evicted
		System.out.println("printing cache after adding new objects:");
		cache.printCache();

	}

}
