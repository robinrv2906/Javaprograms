package com.javabasics;

public class Bitwise_Operators {
	public static void main(String[] args) {
		int a=9,b=5;	
	System.out.println(a & b);
	System.out.println(a | b);
	System.out.println(a ^ b);
	System.out.println(~a);
}

	//System.out.println(~a);//
	//}


// bitwise operators & | ^ ~ 
/*9=  1001
 *5=  0101
 *&=  0001  = 1
 *|=  1101  =13 
 *^=  1100                         //0000 1001
 */                             /*     1111 0110
                                             1
                                     1111 1111     */                  

}
