<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/SpringMVCDemo/updateproduct" method="post">
Product Id<input type="text" name="prodid" value="${p.pid}" readonly>
Product Name<input type="text" name="prodname" value="${p.pname}">
Product Price<input type="text" name="price" value="${p.price}">
<button type="submit">Update</button>
</form>
</body>
</html>