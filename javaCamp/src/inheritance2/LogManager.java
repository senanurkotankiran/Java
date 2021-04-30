package inheritance2;

public class LogManager {
	
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabanına loglandı");
		}else if(logType == 2) {
			System.out.println("Dosyaya loglandı");
		}else {
			System.out.println("Email loglandı");
		}
		
	}
}


//1 - Database
//2 - File
//3 - Email