package com.turkcell;

public class _68_OOP {
	
	/*
	 * OOP: Object Oriented Programming
	 * Obje(nesne) nedir ? Tan�mlayabildi�imiz �zellikleri olan her�eydir.
	 * Java 100 % OOP de�ildir (Primitive t�rden dolay�)
	 * ----------------------------------------------------------------------------
	 * Nesne : Ozelligi olan her seydir
	 * Class : Nesneler toplulugudur
	 * Package : Classlar toplulugudur
	 * ----------------------------------------------------------------------------
	 * Nesne Degiskeni: (static yoksa) ==> private String name;
	 * Class Degiskeni: (static varsa) ==> private static String name;
	 * ----------------------------------------------------------------------------
	 * Encapsulation(kapsulleme)
	 * Private kullanarak verileri sadece ilgili yerde gostermektir
	 * Dis dunyaya erisim getter ve setter metodlari uzerinde saglanir
	 * Dis dunyadan ic verileri saklamak icin kullanilir
	 * ----------------------------------------------------------------------------
	 * Constructor
	 * Yapici metoddur bir class uzerinden nesne olusturmak isteyip
	 * new keywordunu kullandigimizda o nesnenin almasi gereken parametreleri
	 * belirtir
	 * return edilemez
	 * class ismiyle anilir
	 * Parametreli ve parametresiz olabilir
	 * biz constructor olusturmazsak default olarak parametresiz contsructor olusur
	 * ----------------------------------------------------------------------------
	 * break : donguyu kirmak
	 * return : metodu kirmak
	 * continue : dongude sadece o sart calismasin sonrasinda donguye devam etsin
	 * cast: donusturmek
	 * ----------------------------------------------------------------------------
	 * toString() ==> variable kullanilirsa cevirmek icindir.
	 * Classda kullanirsak o classa ait verileri duzgun bir sekilde gostermek
	 * icindir
	 * ----------------------------------------------------------------------------
	 * hashCode() : Her classin unique olmasini saglayan bir hashCode u vardir
	 * boxing : primitive turu Wrapper classa cevirmektir
	 * unboxing : Wrapper bir classi primitive veri tipine donusturmektir
	 * ----------------------------------------------------------------------------
	 * null pointer exception : olmayan bir seye erismeye calisiyorsunuz hatasidir
	 * exception handling : exception yakalamaktir
	 * arguman : metodu cagirirken verdigimiz gercek degerlerdir
	 * parametre : metod tanimlamasi yaparken icerisine verdigimiz degerlerdir
	 * ----------------------------------------------------------------------------
	 * Override : Ust yapidan aldigimiz metodu icerisinde bulundugumuz classa uygun
	 * bir sekilde yeniden yorumlamaktir
	 * Overloading : Ayni isme sahip 2 metodun farkli parametre sayisi veya tipi ile
	 * yeniden yorumlanmasidir
	 * ----------------------------------------------------------------------------
	 * Final keywordunun 3 kullanim yeri vardir
	 * class : extend edilemez
	 * method : override edilemez
	 * variable : degistirilemez
	 * ----------------------------------------------------------------------------
	 * Static : Sinif uzerinden nesne olusturmadan dogrudan kullanimamiza izin verir
	 * Ornegin Math classi
	 * ----------------------------------------------------------------------------
	 * new(instance) : yeni bir obje olusturur ve hafizada yeni bir yer acar
	 * null : degisken tanimlamasi yapilmistir ancak deger atamasi yapilmamistir
	 * (dogmamis)
	 * sifir : degisken tanimlamasi yapilmis ve deger olarak 0 atanmistir. Hafizada
	 * yer kaplar
	 * ----------------------------------------------------------------------------
	 * this : global degisken uzerindeki verilere erismek icin kullanilir
	 * baska constructorlari cagirmak ==> this("55", merhaba)
	 * super : ust atadaki verilere, metodlara erisim saglar
	 * ? : Buraya her seyin gelebilecegi anlamini tasir
	 * inial Data: baslangic degeri vermektir
	 * ----------------------------------------------------------------------------
	 * is-a : inheritance
	 * has-a : composition
	 * can-do : interface
	 * ----------------------------------------------------------------------------
	 * Bean : cekirdek
	 * POJO < bean < @ManagementBean < CDI(@Named)
	 * POJO : Plain Old Java Object : Sadece nesne degiskeni ve getter setter icerir
	 * CDI : Spring Framework(@Inject) SpringBoot(@Autowired)
	 * ----------------------------------------------------------------------------
	 * UML diagram (Unifield Modeling Language)
	 * 1995 standart bir dil oluşturalım. bunun adına UML diyelim
	 * UML: Bir modelleme dilidir. standartlaştırılmış kalıplar bize sunar
	 * Büyük resmi görmemize olanak sağlar.
	 * Yazılımıclar ve diğer deparmandan kişilerin basit , kolay, bir şekilde
	 * anlaşabilmesini sağlar.
	 * Karmaşıklık basitleştirilmesini sağlamak
	 * ----------------------------------------------------------------------------
	 * UML Çeşitleri:
	 * 1-) Yapı Diagram (database modelleme vs)
	 * 2-) Davranış modelleme (Başlangıç-Bitiş göstermek)
	 * ----------------------------------------------------------------------------
	 * UML class
	 * 1-) CLASS
	 * 2-) DEĞİŞKENLER
	 * 3-) METOTLAR
	 * ----------------------------------------------------------------------------
	 * public (+)
	 * private (-)
	 * protected (#)
	 * static (__)
	 * public void deneme(int sayi1,int sayi2) {} ==>
	 * +deneme(sayi1:number,sayi:number):void
	 */
	
}
