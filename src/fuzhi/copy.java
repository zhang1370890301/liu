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
		//  用BufferedReader来读   出现故障，结果是在一行
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
		System.out.println("写入完成");*/
	

		InputStream is=new FileInputStream(file);
		//把他们全部读取；file.length比较小就用int，超过另说，还没讲
		byte[] b=new byte[(int) file.length()];
		is.read(b);
	
		File wenjian=new File("D:/copyIP/sb.txt");
		OutputStream os=new FileOutputStream(wenjian);
		is.close();
		os.write(b);
		System.out.println("写入完成");
		
	}
}
