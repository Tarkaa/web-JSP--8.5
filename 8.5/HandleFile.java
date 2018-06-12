package myservlet.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybean.data.FileMessage;

public class HandleFile extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");		
		FileMessage file = new FileMessage();// ����javabean����
		request.setAttribute("file", file);
		String filePath = request.getParameter("filePath");
		String fileName = request.getParameter("fileName");
		file.setFilePath(filePath);
		file.setFileName(fileName);// �����ݴ洢��file��
		try {
			//File(File parent, String child) 
	        //���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
			File f = new File(filePath, fileName);			
			long length = f.length();
			file.setFileLength(length);
			 FileReader in = new FileReader(f);
			 BufferedReader inTwo = new BufferedReader(in);
		    StringBuffer stringBuffer = new StringBuffer();			
			//BufferedReader inTwo = new BufferedReader(new FileReader(f));
			String s = null;
			while ((s = inTwo.readLine()) != null) {
				stringBuffer.append("\n" + s);
			}
			String content = new String(stringBuffer);
			file.setFileContent(content);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/showFile.jsp");
		dispatcher.forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}