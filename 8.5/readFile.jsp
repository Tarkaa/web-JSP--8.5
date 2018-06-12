<%@ page language="java" contentType="text/html; charset=gb2312"%>
<html>
<body>
<jsp:useBean id="fileBean" class="mybean.data.FileMessage" scope="request"/>
<form action ="readFileByLine" method="post" name="form">
<input type="text" name="filePath" size=12>
<br>输入文件的名字：
<input type="text" name="fileName" size=9>
<br><input type="submit" value="读取" name="submit">
</form>
</body>
</html>