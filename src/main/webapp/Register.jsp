<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<font color="red"> ${message}</font>
	<form action="foundation" method="post">



		Email : <input type="text" name="mail" /><br> Password : <input
			type="password" name="pass"><br> FullName : <input
			type="text" name="fnme" maxlength="16" /><br> Age : <input
			type="text" name="age" /><br> Gender : <input type="radio"
			name="gender" value="male"> Male <input type="radio"
			name="gender" value="female"> Female <input type="radio"
			name="gender" value="other"> Other<br> Date OF Birth : <select
			name="dateofbirth">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>








		</select> Month <select name="dateofbirth">
			<option value="January">January</option>
			<option value="February">February</option>
			<option value="March">March</option>
			<option value="April">April</option>
			<option value="May">May</option>
			<option value="june">May</option>
			<option value="july">May</option>
			<option value="agust">AGUST</option>
			<option value="sept">SEPT</option>
			<option value="oct">OCT</option>
			<option value="nov">NOV</option>
			<option value="dec">DEC</option>









		</select> Year <select name="dateofbirth">
			<option value="1947">1947</option>
			<option value="1948">1948</option>
			<option value="1949">1949</option>
			<option value="1950">1950</option>
			<option value="1951">1951</option>
			<option value="1994">1994</option>
			<option value="1995">1995</option>
			<option value="1996">1996</option>
			<option value="2000">2000</option>




		</select> Country Code : <label for="country">Country</label><span
			style="color: red !important; display: inline; float: none;">*</span>

		<select id="country" name="country" class="form-control">
			<option value="Afghanistan">Afghanistan</option>
			<option value="Åland Islands">Åland Islands</option>
			<option value="america">AMERICA</option>
			<option value="india">INDIA</option>
			<option value="American Samoa">American Samoa</option>


		</select>
		
		<br> AdharCard No : <input type="text" name="adhar" /><br>
		<br> PANCard No : <input type="text" name="pan" /><br>
		Mobile No : <input type="text" name="mobileno" /><br> <font
			color="yellow"><input type="submit" value="Registration"></font>
		<br>

		<!-- <form class="example" action="foundation">
  <input type="text" placeholder="Search.." name="search">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>
 -->

		<font color="yellow"><a href="login.jsp">LOGINPAGE</a></font>
	</form>

</body>
</html>