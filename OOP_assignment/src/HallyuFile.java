import java.io.File;
import java.io.FileWriter;
//import java.io.OutputStream;
//import java.io.FileInputStream;
//import java.io.InputStream;
import java.io.IOException;

public class HallyuFile {
	public static void main(String[] args) {
		try {
			File file = new File("C:/Users/user/Desktop/Java/OOP_assignment/Hallyu.txt"); // ���� ��ü ����
			
			if (file.exists() == false) { file.createNewFile(); } // ������ �������� ������ ����
			
			FileWriter KpopInfo = new FileWriter(file); // getBytes() ���� ���ڿ� ����
			
			KpopInfo.write("������ K-pop ���� �̹��� ����\n");
			KpopInfo.write("China = 5.8%\n");
			KpopInfo.write("Japan = 21.4%\n");
			KpopInfo.write("Taiwan = 10.3%\n");
			KpopInfo.write("Thailand = 21.8%\n");
			KpopInfo.write("Vietnam = 15.2%\n");
			
			KpopInfo.close();
			}
		
		 catch (IOException e) {
			 e.printStackTrace(); // ���� �߻� ���� ���
		}
	}
}

