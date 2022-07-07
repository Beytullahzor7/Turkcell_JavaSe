package com.examples.lambdaExpression;

/*
 * Lambda expression tek basina bir anlam ifade etmez
 * Java 8 ile gelen bir ozelliktir
 * Okunabilirligi ve yazilabilirligi artirir
 * Sade kodlarla islem yapmamizi saglar
 * --------------------------------------------------------
 * Lambda expressions, islevsel programlamayi kolaylastirir ve
 * gelistirmeyi cok basitlestirir
 * Koleksiyondan verilerin yinelenmesine, filtrelenmesine ve
 * cikarilmasina yardimci olur
 * --------------------------------------------------------
 * Lambda arkasindaki guc : JVM lambdalari birer interfaceye cevirir
 * Lambda Function: kullanmak icin interface olusturmaliyiz
 * gucunu interfaceden alir
 * stream api ile cok kullanilir
 * --------------------------------------------------------
 * NORMAL METHOD VS LAMBDA EXPRESSION
 * public void deneme()
 * (x) -> {x*5}
 * --------------------------------------------------------
 * @FunctionalInterface ==> interface 1 tane govdesiz method yazabiliriz
 * baska yazamayiz
 * --------------------------------------------------------
 * Lambda Expression yazarken dikkat edecegimiz hususlar
 * 1) @FunctionalInterface ==> 1 tane govdesiz method yaz
 * 2) Parametre sayiyi ve turu cagiranda ayni olmalidir
 * 3) return varsa return tipi yazilir
 */

@FunctionalInterface
interface ILambdaExpressionData {
	public void deneme(String adi);
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		// Normal Interface
		ILambdaExpressionData expressionData = new ILambdaExpressionData() {
			
			@Override
			public void deneme(String adi) {
				System.out.println(adi + " Normal interface yapisi");
				
			}
		};
		
		expressionData.deneme("Functional Interface");
		
		// Lambda Expression Interface
		ILambdaExpressionData expressionData2 = (temp) -> {
			System.out.println(temp + " Functional Interface Yapisi");
		};
		
		expressionData2.deneme("arguman verdim");
		
	}
	
}
