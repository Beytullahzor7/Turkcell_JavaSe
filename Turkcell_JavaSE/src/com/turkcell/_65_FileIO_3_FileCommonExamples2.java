package com.turkcell;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class _65_FileIO_3_FileCommonExamples2 {
	
	// Sinif degiskeni(Class variable)
	private static Scanner klavye;
	
	// File path
	private static String MY_PATH = new _65_FileIO_1_FileClass().getPath();
	
	// File new
	private static File file = new File(MY_PATH);
	
	// Roles
	private static int MY_ROLES;
	
	// File class
	_65_FileIO_1_FileClass pathClass;
	
	// Parametreli Constructor
	public _65_FileIO_3_FileCommonExamples2(_65_FileIO_1_FileClass pathClass) {
		this.pathClass = pathClass;
	}
	
	// Chooise Method
	public static int choice() {
		klavye = new Scanner(System.in);
		System.out.println("Seçim yapýnýz.");
		System.out.println("0-)Çýkýþ\n1-)Dosya oluþtur\n2-)Dosya Yaz\n3-)Dosya Oku"
				+ "\n4-)Dosya Sil\n5-)Dosya Bilgileri\n6-)Rol deðiþtir\n7-)Bütün Dosyalar");
		return klavye.nextInt();
	}
	
	// ADMIN(1, "admin"), WRITER(2, "writer"), USER(3, "user");
	// mainMethod
	public static void mainMethod(int perm) throws IOException, _65_FileIO_0_FileClassException {
		int key = choice();
		switch (key) {
			case 1:
				if (MY_ROLES != _65_FileIO_2_Enum.ADMIN.getKey())
					System.out.println("++++++++\nyetkiniz yok\n");
				else
					createDataFile(perm);
				break;
			
			case 2:
				System.out.println("Roles: " + MY_ROLES);
				System.out.println("enum: " + _65_FileIO_2_Enum.USER.getKey());
				if (MY_ROLES == _65_FileIO_2_Enum.USER.getKey()) // MY_ROLES == "USER"
					System.out.println("++++++++\nyetkiniz yok\n");
				else
					writeDataFile();
				break;
			
			case 3:
				ReadDataFile();
				break;
			
			case 4:
				if (MY_ROLES != _65_FileIO_2_Enum.ADMIN.getKey()) // MY_ROLES != "ADMIN"
					System.out.println("++++++++\nyetkiniz yok\n");
				else
					deleteDataFile();
				break;
			
			case 5:
				showFileData();
				break;
			case 6:
				permission();
				break;
			case 7:
				allFiles();
				break;
			
			case 0:
				systemExist();
				break;
			
			default:
				System.out.println("Seçim dýþýnda bir deðer girdiniz....");
				break;
		}
	}
	
	// permission
	private static int permission() {
		klavye = new Scanner(System.in);
		System.out.println("Rolunüzü yazýnýz\n1-)ADMIN\n2-)WRITER\n3-)USER");
		int roles = klavye.nextInt();
		MY_ROLES = roles;
		return roles;
	}
	
	// data Merge
	private static String dataMerge(String fileName) {
		StringBuilder builder = new StringBuilder();
		// C:\\Javakamp\\Turkcell_JavaSe\\data.txt
		builder.append("C:\\Javakamp\\Turkcell_JavaSe\\").append(fileName).append(".txt");
		return builder.toString();
	}
	
	// create path
	private static String createPath() {
		klavye = new Scanner(System.in);
		// C:\\Javakamp\\Turkcell_JavaSe\\data.txt
		System.out.println("Dosya adýný giriniz...");
		String fileName = klavye.nextLine();
		_65_FileIO_1_FileClass pathClass = new _65_FileIO_1_FileClass(dataMerge(fileName));
		return pathClass.getPath();
	}
	
	// create method
	private static void createDataFile(int perm) throws IOException {
		System.out.println("*** Dosya Oluþturmak ***");
		String path = createPath();
		MY_PATH = path;
		file = new File(path);
		if (file.createNewFile()) {
			System.out.println(file.getAbsolutePath() + " Dosya oluþturuldu");
		} else {
			System.out.println("Oluþturulmadý");
		}
	}
	
	/////// write method
	private static void writeDataFile() {
		System.out.println("*** Dosya Yaz ***");
		klavye = new Scanner(System.in);
		System.out.println("Dosya yazmak için birþeyler yazýnýz...");
		String vocabulary = klavye.nextLine();
		System.out.println(MY_PATH);
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
			// _35_FileIO4_1_FileClass class1 = new _35_FileIO4_1_FileClass();
			// bufferedWriter.write("ROL: " + MY_ROLES + " ==>" + class1.getDate() + " ==> "
			// + vocabulary);
			bufferedWriter.write(vocabulary);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//////// read method
	private static void ReadDataFile() {
		System.out.println("*** Dosya Oku ***");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
			StringBuilder builder = new StringBuilder();
			String satir = "";
			while ((satir = bufferedReader.readLine()) != null) {
				builder.append(satir);
			}
			System.out.println(builder);
		} catch (Exception e) {
			System.out.println("Okumada sorun oluþtu");
			e.printStackTrace();
		}
		
	}
	
	// bütün dosyalar
	private static String allFiles() {
		String baseFilePath = file.getParent();
		System.out.println(baseFilePath);
		System.out.println("#########");
		for (File temp : new File(baseFilePath).listFiles()) {
			System.err.println(temp.getName());
		}
		System.out.println("#########");
		return baseFilePath;
	}
	
	///// delete method
	private static void deleteDataFile() throws _65_FileIO_0_FileClassException {
		System.out.println("*** Dosya Sil ***");
		klavye = new Scanner(System.in);
		String tempBaseFile = allFiles();
		System.out.println("Silmek istediðiniz dosya yazýnýz");
		String filesName = klavye.nextLine();
		String fileConcat = tempBaseFile + "\\" + filesName + ".txt";
		File deleteFile = new File(fileConcat);
		
		// try-with resources
		if (deleteFile.exists()) {
			System.out.println("Dosyanýz siliniyor");
			deleteFile.delete();
		} else {
			System.out.println("Dosyanýz silinemedi");
			// kendi exception yazdým
			throw new _65_FileIO_0_FileClassException("Silinemedi");
		}
	}
	
	////// exit
	private static void systemExist() {
		System.out.println("*** Çýkýþ ***");
		System.exit(0);
		
	}
	
	// show file
	private static void showFileData() {
		File file = new File(MY_PATH);
		System.out.println("toplam karakter sayýsý: " + file.length());
		System.out.println("toplam GB : " + file.getTotalSpace());
		System.out.println("absolute path: " + file.getAbsolutePath());
		System.out.println("kullanýlabileceðin GB : " + file.getUsableSpace());
		System.out.println("Deðiþikliði Tarihi: " + new Date(file.lastModified()));
	}
	
	public static void main(String[] args) throws _65_FileIO_0_FileClassException {
		try {
			// sadece 1 kere rol istesin
			int perm = permission();
			MY_ROLES = perm;
			for (;;) {
				
				synchronized (args) {
					mainMethod(perm);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
