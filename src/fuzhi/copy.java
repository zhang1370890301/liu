package fuzhi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:/sb.txt");
		//  ��BufferedReader����   ���ֹ��ϣ��������һ��
		/*Reader reader=new FileReader(file);
		BufferedReader br=new BufferedReader(reader);
		String str=br.readLine();
		File lala=new File("D:/copyIP/sb.txt");
		Writer writer=new FileWriter(lala,true);
		while(str!=null) {
			writer.write(str);
			str=br.readLine();
		}
		
		writer.close();
		System.out.println("д�����");*/
	

		InputStream is=new FileInputStream(file);
		//������ȫ����ȡ��file.length�Ƚ�С����int��������˵����û��
		byte[] b=new byte[(int) file.length()];
		is.read(b);
	
		File wenjian=new File("D:/copyIP/sb.txt");
		OutputStream os=new FileOutputStream(wenjian);
		is.close();
		os.write(b);
		System.out.println("д�����");
		
	}
}
