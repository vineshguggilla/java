

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function deleteUser(mailid1) {
		alert('triggred Delete button ' + mailid1);
		//http://localhost:8080/whatsapp/deleteUser?mailIdToDelete='virat@gmail.com'
		document.forms[0].action = "${pageContext.request.contextPath}/deleteUser?mailIdToDelete="
				+ mailid1;
		document.forms[0].method = "post";
		document.forms[0].submit();
		//submit to deleteUser action from here
	}

	function edituser(mailid2) {
		alert('triggred Edit button ' + mailid2);
		//http://localhost:8080/whatsapp/deleteUser?mailIdToDelete='virat@gmail.com'
		document.forms[0].action = "${pageContext.request.contextPath}/edituser?mailIdToEdit="
				+ mailid2;
		document.forms[0].method = "post";
		document.forms[0].submit();
		//submit to deleteUser action from here
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<font color="red"> ${mess }</font>
	<font color="blue"> ${message}</font>
	<form action=" ">
		<table border="10">

			<tr>
				<th>Name</th>
				<th>Mail</th>
				<th>Password</th>
				<th>City</th>
				<th>Gender</th>
				<th>DateofBirth</th>
				<th>country</th>
				<th>Adhar</th>
				<th>MobileNo</th>

			</tr>

			<core:forEach var="userobject" items="${user}">

				<tr>

					<td>${userobject.fnme}</td>
					<td>${userobject.mail}</td>
					<td>${userobject.pass}</td>
					<td>${userobject.age}</td>
					<td>${userobject.dateofbirth}</td>
					<td>${userobject.country}</td>
					<td>${userobject.adhar}</td>
					<td>${userobject.mobileno}</td>
					<td>${userobject.gender}</td>
					<td><input type="button"
						onclick="deleteUser ('${userobject.mail}')" value="Delete" /></td>

					<td><input type="button"
						onclick="edituser ('${userobject.mail}' )" value="Edit" /></td>
				</tr>
			</core:forEach>

		</table>
	</form>
</body>
</html>









