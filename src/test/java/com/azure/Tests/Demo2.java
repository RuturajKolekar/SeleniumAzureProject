package com.azure.Tests;

import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public static void mynewfile() {
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\com\\azure\\testData\\TestData.xlsx";
		System.out.println(path);
	}
}
