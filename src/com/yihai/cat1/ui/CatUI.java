package com.yihai.cat1.ui;


import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;


import com.yihai.cat1.HttpServer;

/** 
 * 类名: CatUI.java    
 * 描述: 这个类是用来
 * 作者: honourx@foxmail.com  
 * 时间: 2018-07-01 17:41  
 */
public class CatUI extends JFrame{
	
	private static final long serialVersionUID = 5573766838854790074L;

	public static void main(String[] args) {
		new CatUI();
	}
	
	public CatUI(){
		getTop();//开始
		Container jp = this.getContentPane();
		JTextArea txt = new JTextArea();
		txt.setLineWrap(true); // 当字符串太长时，允许自动换行
		txt.setText("保持窗口运行，在浏览器访问：localhost/index.html \n\n如要停止运行,关闭窗口，或者在地址栏输入：localhost/SHOTDWON。");
        jp.add(txt);
		getBottom();//结束
		
		//启动服务器
		startUp();
	}
	
	public void startUp(){
		HttpServer server = new HttpServer();
		server.await();
	}
	
	public void getTop(){
		this.setTitle("MyCat Server");
		this.setSize(300, 250);
		Toolkit tk=Toolkit.getDefaultToolkit(); 
		Image image=tk.createImage("ooopic_1512308409.png"); /*image.gif是你的图标*/ 
		this.setIconImage(image); 
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	public void getBottom(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
