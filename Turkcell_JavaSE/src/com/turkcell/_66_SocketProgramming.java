package com.turkcell;

import java.util.Random;

public class _66_SocketProgramming {
	// Daðýtýk sistem birden fazla otomatik bilgisayarýn bir að üzerindeki
	// iletiþimidir. Aðdaki bilgisayarlar belirli bir hedefe ulaþmak için
	// birbirleriyle etkileþim içerisindedirler. Daðýtýk sistemi çalýþtýran
	// bilgisayar programýna daðýtýk program denir. Bu tür programlarý yazma
	// iþlemine daðýtýk programlama adý verilir.
	
	// Daðýtýk programlama, bir bilgisayar ile çözebileceðiniz bir sorunu birden
	// fazla bilgisayar kullanarak çözmeye çalýþma sanatýdýr.
	
	/*
	 * Neden ihtiyaç var?
	 * Burada akla ilk gelen soru “Madem bir bilgisayarla çözebiliyorduk neden
	 * birden fazla bilgisayar kullanýyoruz?” olacaktýr. Aslýnda elimizde sonsuz
	 * iþlem yapma gücünde, sonsuz veri saklama kapasitesinde ve Dünya’nýn her
	 * noktasýndan hýzlýca eriþilebilir bir bilgisayar olsaydý daðýtýk sistemler
	 * kurmaya gerek kalmazdý. Fakat böyle bir bilgisayar yok. Bizim iþimizi görecek
	 * kadarýný yapsak bize yeter diye düþünebilirsiniz. Orada da þöyle bir sorun
	 * devreye giriyor: Daðýtýk sistemler kurmak yerine elimizdeki donanýmlarýn
	 * özelliklerini arttýrdýkça bu donanýmlarýn maaliyetleri aþýrý yükseliyor.
	 * Aþaðýdaki görselde de görüleceði üzere makina sayýsýný arttýrarak yatayda
	 * ölçekleme yapmanýn (horizontal scaling/scale out) maaliyeti lineer artarken,
	 * makinanýn özelliklerini artýrarak dikeyde ölçekleme yapmanýn (vertical
	 * scaling/scale up) maaliyeti üssel þekilde artýyor.
	 */
	
	// Daðýtýk Programlama (distributed System) :Ayný networkteki bilgisayarlarýn
	// birbiriyle haberleþmesine denilir.
	// Senkron : Ayný anda tek bir iþlem yapabilme yeteneðidir.
	// Asenkron : Ayný anda birden fazla iþlem yapabilme yeteneðidir.
	// TCP/IP UDP (Client:istemci(Hizmet alan) Server:Hizmet veren :
	// TCP/IP ~ UDP ==> Aðdaki Bilgisayarlarýn birbiriyle haberleþmesini saðlayan
	// protokol adýdýr.
	
	// TCP/IP ile UDP arasýndaki farklar
	// TCP/IP: güvenli ,karþý tarafa data gidip gitmediðini kontrol eder. Yavaþtýr.
	// UDP:güvensizdir,karþý tarafa data gidip gitmediðini kontrol etmeezzzzzz.
	// Hýzlýdýr. Canlý Live Stream (Online system)
	
	// RMI: Remote Method Invocation: Farklý sunuculardaki metotlarý çaðýrýp iþlem
	// yapýlmasý durumudur.
	
	// 2^16=65536 port sayýsý (Kapý)
	// 0<=X<=1023 (Well-Know-Port)
	// SSH:22
	// FTP:20
	// HTTP:80, 443
	
	// 1024<=Y<=49151 ( Registered Port):sabitlenmiþ
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
