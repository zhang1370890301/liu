package ioliu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Ioliu1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("D:/sb.txt");
		//�Ƿ����ļ������ļ���
		/*System.out.println(file.exists());
		//�Ƿ��ļ�
		System.out.println(file.isFile());
		//��ȡ�ļ������ļ��е�����
		System.out.println(file.getName());
		//���ľ���·��
		System.out.println(file.getAbsolutePath());
		//�����ĸ���Ŀ¼
		System.out.println(file.getParent());
		//�ļ��Ĵ�С����λ�ֽڣ�
		System.out.println(file.length());
		//�����ļ���ǰ�����������ҵ��ļ��������ڣ��������flase�������ھʹ���
		System.out.println(file.createNewFile());*/
		//�����ļ���
		/*System.out.println(file.mkdir());*/
		//�����ݹ��ļ���
		/*System.out.println(file.mkdirs());*/  
		//io�����շ����Ϊ������������������������ݷ�Ϊ�ֽ������ַ���
		//�����ļ��������ֽ������������ַ��� ��ֻ���ı��ļ��������ַ�����������Ƶ������
		//ѹ���ļ������ֽ���
		
		
		//�����ļ����в������ֽ�������     �ֽ���  ��ȡ�ļ��е�����
		/*InputStream is=new FileInputStream(file);
		//������ȫ����ȡ��file.length�Ƚ�С����int��������˵����û��
		byte[] b=new byte[(int) file.length()];
		is.read(b);
		System.out.println(new String(b));*/
		
		
		//   �ַ�������       ���ַ�����ȡ�ļ��е�����
		/*Reader  reader=new FileReader(file);
		char[] c=new char[(int) file.length()];
		reader.read(c);
		String str=new String(c);
		System.out.println(str);*/
		
		//�ļ���������ֽ��������     ���ļ���д�붫��  Ĭ�����滻�����Ǹ���ԭ��������
		/*OutputStream os=new FileOutputStream(file);
		String ab="231456";
		os.write(ab.getBytes());
		System.out.println("д�����");*/
		
		//���ļ���׷�����ݣ��ֽ��������   
		/*OutputStream mm=new FileOutputStream(file, true);
		String aa="��ͩ��˧";
		mm.write(aa.getBytes());
		mm.close();
		System.out.println("д�����");*/
		
		
		//�ַ������   �Ժ󲻹����ֽڻ����ַ��������д���Ҫ����رա�����Ҫ�õ�close������
		/*Writer writer=new FileWriter(file,true);
		writer.write("������˧");
		writer.close();
		System.out.println("д�����");*/
		
		//�ַ���ת�ֽ���ת���ˣ��ֽ���ת�ַ������ԣ�
		/*InputStream is=new FileInputStream(file);
		InputStreamReader iso=new InputStreamReader(is);*/
		
		// BufferedReader ��һ���ַ��� ���� һ���ַ��������߼������԰�������ȡ
		Reader  reader=new FileReader(file);
		BufferedReader br=new BufferedReader(reader);
		//һ��һ�ж�
		/*String str=br.readLine();
		System.out.println(str);
		String str2=br.readLine();
		System.out.println(str2);*/
		//����
		String str=br.readLine();
		while(str!=null) {
			System.out.println(str);
			str=br.readLine();
		}
		br.close();
		reader.close();	
	}

}
