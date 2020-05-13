<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updateUser">
		Name : <input type="text" name="fnme" value="${userobject.fnme}"><br> 
		Mobile : <input type="text" name="mobileno" value="${userobject.mobileno}"><br> <br>
		mail id : <input type="text" name="mail" readonly="readonly" value="${userobject.mail}"><br> <br>
		country : <input type="text" name="country" value="${userobject.country}"><br> <br>
		Password : <input type="password" name="pass" value="${userobject.pass}"><br> <br>
		AGE      : <input type="text" name="age" value="${userobject.age}"><br> 
		DateofBirth : <input type="text" name="dateofbirth" value="${userobject.dateofbirth}"><br> 
		ADhar : <input type="text" name="adhar" value="${userobject.adhar}"><br> 
		Gender : <input type="text" name="gender" value="${userobject.gender}"><br> 
		<font color="green" ><input type="submit" value="Update"></font>
	</form>

</body>
</html>