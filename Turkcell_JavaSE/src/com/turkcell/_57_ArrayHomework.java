package com.turkcell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class _57_ArrayHomework {
	// NOT: birden fazla metotla yapalım
	// kullanıcıdan alınan sayı kadar dizi elemanı olsun rastgele 1-10 arasındaki bu
	// sayıları bir diziye atayalım
	// sonra bu diziyi başka bir diziye clone edelim.
	// clonelanmış bu dizi bu sayıları küçükten büyüğe doğru sıralayın
	// (Arrays.sort())
	// en küçük sayıyı ve en büyük sayıyı bulalım ? ( diziyele yapalım)
	// bu sayıların toplamını ?
	// bu sayıların ortalaması ?
	
	// bu dizideki elemanlardan tek sayılardan kaç tane ve tek sayı toplamları (tek
	// sayı dizisi)
	// bu dizideki elemanlardan çift sayılardan kaç tane ve çift sayı toplamları
	// (çift sayı dizisi)
	// dizilerde en büyük ile 25 karşılatıralım dizideki eleman 25 büyük mü
	// dizideki elemanlardan 5 sayısı var mı ? (java.util.Arrays.binarySearch())
	// dizideki tekrar eden sayıları bir dizide göstrerelim ?
	// dizideki tekrar eden sayılar yerine 1 kere tekrar sayı göstersin (tekrarsız
	// dizi elemanları)
	public static void main(String[] args) {
		
		int[] arr = getArray();
		System.out.println(Arrays.toString(arr));
		
		findOddNumbers(arr);
		System.out.println("****************");
		findEvenNumbers(arr);
		System.out.println("************");
		// repeatedNumbers(arr);
		System.out.println("**************");
		// isArrayContainFive(arr);
		
	}
	
	public static int[] getArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers do you wanna add to array : ");
		
		int number = input.nextInt();
		int[] intArr = new int[number];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 11);
		}
		
		return intArr;
	}
	
	public static void cloneAndSortAndFindMinMaxSumArray(int[] arr) {
		int[] cloneArray = arr.clone();
		Arrays.sort(cloneArray);
		
		int minNumber = cloneArray[0];
		int maxNumber = cloneArray[cloneArray.length - 1];
		
		int sum = 0;
		for (int i = 0; i < cloneArray.length; i++) {
			sum += cloneArray[i];
		}
		
		double average = sum / cloneArray.length;
		
		System.out.println("Min Number : " + minNumber);
		System.out.println("Max Number : " + maxNumber);
		System.out.println("Average : " + average);
	}
	
	public static void findOddNumbers(int[] arr) {
		int countOddNumbers = 0;
		int sumOfOddNumbers = 0;
		Set<Integer> setOfOddNumbers = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sumOfOddNumbers += arr[i];
				setOfOddNumbers.add(arr[i]);
				countOddNumbers++;
			}
		}
		
		Integer[] oddNumbersArray = new Integer[setOfOddNumbers.size()];
		setOfOddNumbers.toArray(oddNumbersArray);
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Set Of Odd Numbers : " + Arrays.toString(oddNumbersArray));
		System.out.println("Sum Of Odd Numbers : " + sumOfOddNumbers);
		System.out.println("There are " + countOddNumbers + " odd numbers");
	}
	
	public static void findEvenNumbers(int[] arr) {
		int countEvenNumbers = 0;
		int sumOfEvenNumbers = 0;
		Set<Integer> setOfEvenNumbers = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sumOfEvenNumbers += arr[i];
				setOfEvenNumbers.add(arr[i]);
				countEvenNumbers++;
			}
		}
		
		Integer[] evenNumbersArray = new Integer[setOfEvenNumbers.size()];
		setOfEvenNumbers.toArray(evenNumbersArray);
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Set Of Even Numbers : " + Arrays.toString(evenNumbersArray));
		System.out.println("Sum Of Even Numbers : " + sumOfEvenNumbers);
		System.out.println("There are " + countEvenNumbers + " even numbers");
	}
	
	public static void compareTo25(int[] arr) {
		Arrays.sort(arr);
		int maxNumber = arr[arr.length - 1];
		
		String result = (maxNumber > 25) ? "Max Number Greater Than 25" : "Max Number Not Greater Than 25";
		System.out.println(result);
	}
	
	public static boolean isArrayContainFive(int[] arr) {
		Arrays.sort(arr);
		
		int result = Arrays.binarySearch(arr, 5);
		
		if (result > 0) {
			System.out.println("Array icinde  5 sayisi vardir");
			return true;
		} else {
			System.out.println("Array icinde  5 sayisi yoktur");
			return false;
		}
	}
	
	public static void repeatedNumbers(int[] arr) {
		List<Integer> intList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) { // [1 2 3 4 5]
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					intList.add(arr[i]);
				}
			}
		}
		
		Integer[] duplicateNumbers = new Integer[intList.size()];
		intList.toArray(duplicateNumbers);
		
		System.out.println(Arrays.toString(duplicateNumbers));
	}
	
	public static void withoutMultipleValues(int[] array) {
		Set<Integer> arrayWithoutMultipleValues = (Set<Integer>) Arrays.stream(array).boxed()
				.collect(Collectors.toSet());
		Integer[] temp = new Integer[arrayWithoutMultipleValues.size()];
		arrayWithoutMultipleValues.toArray(temp);
		Arrays.sort(temp);
		System.out.println("Dizide birden fazla elemanlarin cikarilmis hali : " + Arrays.toString(temp));
	}
	
}
