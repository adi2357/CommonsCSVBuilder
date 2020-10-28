package com.bridgelabz.jarfile.commonscsvbuilder;

public class CSVBuilderFactory {

	public static <E> ICSVBuilder<E> createCSVBuilder() {
		return new CommonsCSVBuilder<E>();
	}
	
}
