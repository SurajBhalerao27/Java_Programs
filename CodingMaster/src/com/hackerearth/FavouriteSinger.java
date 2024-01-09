package com.hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FavouriteSinger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] playlist = new int[n];
		for (int i = 0; i < n; i++) {
			playlist[i] = scanner.nextInt();
		}
		int result = countFavouriteSingers(n, playlist);
		System.out.println(result);
	}

	static int countFavouriteSingers(int n, int[] playlist) {
		Map<Integer, Integer> singerCount = new HashMap<>();
		int maxCount = 0;
		int numFavouriteSingers = 0;
		for (int singer : playlist) {
			singerCount.put(singer, singerCount.getOrDefault(singer, 0) + 1);
		}
		for (int count : singerCount.values()) {
			maxCount = Math.max(maxCount, count);
			if (count == maxCount) {
				numFavouriteSingers++;
			}
		}
		return numFavouriteSingers;
	}
}
