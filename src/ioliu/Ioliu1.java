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
		//是否是文件或者文件夹
		/*System.out.println(file.exists());
		//是否文件
		System.out.println(file.isFile());
		//获取文件或者文件夹的名字
		System.out.println(file.getName());
		//它的绝对路径
		System.out.println(file.getAbsolutePath());
		//找他的父级目录
		System.out.println(file.getParent());
		//文件的大小（单位字节）
		System.out.println(file.length());
		//创建文件，前提是上面让找的文件名不存在，存在输出flase，不存在就创建
		System.out.println(file.createNewFile());*/
		//创建文件夹
		/*System.out.println(file.mkdir());*/
		//创建递归文件夹
		/*System.out.println(file.mkdirs());*/  
		//io流按照方向分为输出刘和输入流，按传递内容分为字节流和字符流
		//所有文件都能用字节流，但是用字符流 ，只有文本文件才能用字符流，比如视频，音乐
		//压缩文件都是字节流
		
		
		//对于文件进行操作的字节输入流     字节流  读取文件中的内容
		/*InputStream is=new FileInputStream(file);
		//把他们全部读取；file.length比较小就用int，超过另说，还没讲
		byte[] b=new byte[(int) file.length()];
		is.read(b);
		System.out.println(new String(b));*/
		
		
		//   字符输入流       用字符流读取文件中的内容
		/*Reader  reader=new FileReader(file);
		char[] c=new char[(int) file.length()];
		reader.read(c);
		String str=new String(c);
		System.out.println(str);*/
		
		//文件输出流（字节输出流）     向文件中写入东西  默认是替换，就是覆盖原来的内容
		/*OutputStream os=new FileOutputStream(file);
		String ab="231456";
		os.write(ab.getBytes());
		System.out.println("写入完成");*/
		
		//向文件中追加内容（字节输出流）   
		/*OutputStream mm=new FileOutputStream(file, true);
		String aa="张桐真帅";
		mm.write(aa.getBytes());
		mm.close();
		System.out.println("写入完成");*/
		
		
		//字符输出流   以后不管是字节还是字符输出流，写完后都要将其关闭。就是要用到close方法；
		/*Writer writer=new FileWriter(file,true);
		writer.write("王禹真帅");
		writer.close();
		System.out.println("写入完成");*/
		
		//字符流转字节流转不了，字节流转字符流可以；
		/*InputStream is=new FileInputStream(file);
		InputStreamReader iso=new InputStreamReader(is);*/
		
		// BufferedReader 传一个字符流 生成 一个字符流（更高级）可以按行来读取
		Reader  reader=new FileReader(file);
		BufferedReader br=new BufferedReader(reader);
		//一行一行读
		/*String str=br.readLine();
		System.out.println(str);
		String str2=br.readLine();
		System.out.println(str2);*/
		//读完
		String str=br.readLine();
		while(str!=null) {
			System.out.println(str);
			str=br.readLine();
		}
		br.close();
		reader.close();	
	}

}
