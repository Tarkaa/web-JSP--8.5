<%@ page language="java" contentType="text/html; charset=gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:useBean id="fileBean" class="mybean.data.FileMessage" scope="request"/>
<body>
<b><br>读入的内容：<br>
<br><%= fileBean.getFileContent() %>
</body>
</html>