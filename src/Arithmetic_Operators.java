/**
 * 
 */
package com.Arithmetic;

/**
 * @author Kunal
 * This change has been done by Kunal
 * This code is to show how arithmetic operators are used in Java. Updated Description
 */
public class Arithmetic_Operators
{
	public static void main(String... args)
	{
		int a, b = 10, c = 5, d=10, e = 15;
		a = b + c;
		System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
		a = b - c;
		System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
		a = b * c;
		System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
		a = b / c;
		System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
		a = b % c;
		System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
		System.out.println("Value of 'b' after '++' Arithmetic operation is " + b++);
		System.out.println("Value of 'c' after '--' Arithmetic operation is " + c--);
	}
}
