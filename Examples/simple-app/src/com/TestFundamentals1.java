package com;

public class TestFundamentals1 {

	public static void main(String[] args) {
		int i1 = 10; // size of int is 4 bytes
		int i2 = 20;
		int i3 = i1 + i2;
		System.out.println(i1);
		System.out.println("i3 = "+i3);
		double salary = 35000.0; // size of double is 8 bytes
		float discount = 0.15f; // size of float is 4 bytes
		System.out.println("Salary = "+salary+", discount = "+discount);
		// create char & boolean type variables
		char gender = 'M';  // single character like 'M', 'F'
		boolean isEmployed = false; // true or false
		System.out.println("Gender = "+gender+", IsEmployed = "+isEmployed);
		// for integer values you have byte(1), short(2), int(4) & long(8)
		int age = 35; // age is of int type and its size is 4 bytes it has a range -21474,83,648 to +21474,83,647
		int maxValue = 2147483647; // this can be occupied in 32 bits
		long maxValue2 = 2147483648L; // long size is 8 bytes it has a range = -92233720368547,75,808 to +92233720368547,75,807
		System.out.println("Age = "+age+", maxValue = "+maxValue+", maxValue2 = "+maxValue2);
		byte byteValue = (byte)age; // byte takes 1 byte and its range is -128 to +127
		byte byteValue2 = (byte)maxValue; // since byte takes value within -128 to +127, then byteValue2 will be always within its range
		System.out.println("byteValue = "+byteValue+", byteValue2 = "+byteValue2);
		byte byteValue3 = (byte)130; // byteValue3 wouldn't be 130, instead it would be -128, -127, -126
		System.out.println("byteValue3 = "+byteValue3);
		long longValue = maxValue; // no need of conversion because 8 bytes can take 4 bytes
		System.out.println("longValue = "+longValue);
		long longFloatValue = (long)20.3f; // you need to do an explicit conversion here as long accepts only whole numbers
		System.out.println("longFloatValue = "+longFloatValue);
	}
	

}
