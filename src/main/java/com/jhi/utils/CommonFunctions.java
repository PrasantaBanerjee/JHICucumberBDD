package com.jhi.utils;

public class CommonFunctions {

	public void sleepWait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
