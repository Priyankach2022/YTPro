package org.tesing.assertions;

public class Assesrtion
{
public static void Assert(String expected, String actual)
{
	if(expected.equals(actual))
	{
		System.out.println("Assertion is  passed");
	}
	else
	{
		System.out.println("Assertion is failed");
	}
}
}
