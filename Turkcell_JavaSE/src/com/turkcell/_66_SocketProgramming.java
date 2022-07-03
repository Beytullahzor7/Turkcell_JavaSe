package com.turkcell;

import java.util.Random;

public class _66_SocketProgramming {
	// Da��t�k sistem birden fazla otomatik bilgisayar�n bir a� �zerindeki
	// ileti�imidir. A�daki bilgisayarlar belirli bir hedefe ula�mak i�in
	// birbirleriyle etkile�im i�erisindedirler. Da��t�k sistemi �al��t�ran
	// bilgisayar program�na da��t�k program denir. Bu t�r programlar� yazma
	// i�lemine da��t�k programlama ad� verilir.
	
	// Da��t�k programlama, bir bilgisayar ile ��zebilece�iniz bir sorunu birden
	// fazla bilgisayar kullanarak ��zmeye �al��ma sanat�d�r.
	
	/*
	 * Neden ihtiya� var?
	 * Burada akla ilk gelen soru �Madem bir bilgisayarla ��zebiliyorduk neden
	 * birden fazla bilgisayar kullan�yoruz?� olacakt�r. Asl�nda elimizde sonsuz
	 * i�lem yapma g�c�nde, sonsuz veri saklama kapasitesinde ve D�nya�n�n her
	 * noktas�ndan h�zl�ca eri�ilebilir bir bilgisayar olsayd� da��t�k sistemler
	 * kurmaya gerek kalmazd�. Fakat b�yle bir bilgisayar yok. Bizim i�imizi g�recek
	 * kadar�n� yapsak bize yeter diye d���nebilirsiniz. Orada da ��yle bir sorun
	 * devreye giriyor: Da��t�k sistemler kurmak yerine elimizdeki donan�mlar�n
	 * �zelliklerini artt�rd�k�a bu donan�mlar�n maaliyetleri a��r� y�kseliyor.
	 * A�a��daki g�rselde de g�r�lece�i �zere makina say�s�n� artt�rarak yatayda
	 * �l�ekleme yapman�n (horizontal scaling/scale out) maaliyeti lineer artarken,
	 * makinan�n �zelliklerini art�rarak dikeyde �l�ekleme yapman�n (vertical
	 * scaling/scale up) maaliyeti �ssel �ekilde art�yor.
	 */
	
	// Da��t�k Programlama (distributed System) :Ayn� networkteki bilgisayarlar�n
	// birbiriyle haberle�mesine denilir.
	// Senkron : Ayn� anda tek bir i�lem yapabilme yetene�idir.
	// Asenkron : Ayn� anda birden fazla i�lem yapabilme yetene�idir.
	// TCP/IP UDP (Client:istemci(Hizmet alan) Server:Hizmet veren :
	// TCP/IP ~ UDP ==> A�daki Bilgisayarlar�n birbiriyle haberle�mesini sa�layan
	// protokol ad�d�r.
	
	// TCP/IP ile UDP aras�ndaki farklar
	// TCP/IP: g�venli ,kar�� tarafa data gidip gitmedi�ini kontrol eder. Yava�t�r.
	// UDP:g�vensizdir,kar�� tarafa data gidip gitmedi�ini kontrol etmeezzzzzz.
	// H�zl�d�r. Canl� Live Stream (Online system)
	
	// RMI: Remote Method Invocation: Farkl� sunuculardaki metotlar� �a��r�p i�lem
	// yap�lmas� durumudur.
	
	// 2^16=65536 port say�s� (Kap�)
	// 0<=X<=1023 (Well-Know-Port)
	// SSH:22
	// FTP:20
	// HTTP:80, 443
	
	// 1024<=Y<=49151 ( Registered Port):sabitlenmi�
	// Mongo: 27017
	// Postgresql:5432
	// Mysql:3306
	
	// 49152<=X<=65535 Dynamic Port
	
	public static int PORT = 9696;
	public static String ipAddress = "localhost"; // 127.0.0.1
	
	public static int generateRandomPort() {
		Random random = new Random();
		int low = 49152;
		int high = 65536;
		int result = random.nextInt(high - low) + low;
		
		return result;
	}
	
	public _66_SocketProgramming() {
		
	}
	
	public static void main(String[] args) {
		// System.out.println(Math.pow(2, 16)); // 65536 port
	}
}
