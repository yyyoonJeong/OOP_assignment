import java.io.File;
import java.io.FileWriter;
//import java.io.OutputStream;
//import java.io.FileInputStream;
//import java.io.InputStream;
import java.io.IOException;

public class HallyuFile {
	public static void main(String[] args) {
		try {
			File file = new File("C:/Users/user/Desktop/Java/OOP_assignment/Hallyu.txt"); // 파일 객체 생성
			
			if (file.exists() == false) { file.createNewFile(); } // 파일이 존재하지 않으면 생성
			
			FileWriter KpopInfo = new FileWriter(file); // getBytes() 없이 문자열 쓰기
			
			KpopInfo.write("국가별 K-pop 연상 이미지 비율\n");
			KpopInfo.write("China = 5.8%\n");
			KpopInfo.write("Japan = 21.4%\n");
			KpopInfo.write("Taiwan = 10.3%\n");
			KpopInfo.write("Thailand = 21.8%\n");
			KpopInfo.write("Vietnam = 15.2%\n");
			
			KpopInfo.close();
			}
		
		 catch (IOException e) {
			 e.printStackTrace(); // 예외 발생 정보 출력
		}
	}
}

