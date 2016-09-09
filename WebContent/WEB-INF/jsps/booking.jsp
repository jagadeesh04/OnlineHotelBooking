<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	text-align: center;
	vertical-align: middle;
}
</style>

</head>
<body>
	<h1>UKP Hotels Online Booking</h1>

	<hr>

	<br>
	<h3>Book a Room</h3>
	<br>
	
	<table>
	<tr>
	<td>Customer Name:</td>
	<td><input /></td>
	</tr>
	
	<tr>
	<td>Email:</td>
	<td><input /></td>
	</tr>
	
	<tr>
	<td>Phone:</td>
	<td><input /></td>
	</tr>
	
	<tr>
	<td>Address:</td>
	<td><input /></td>
	</tr>
	
	<tr>
	<td>Room:</td>
	<td>
<select>
  <option value="select" selected="selected">Select</option>
  <option value="saab">Saab</option>
  <option value="opel">Opel</option>
  <option value="audi">Audi</option>
</select></td>
	</tr>
	
	<tr>
	<td>No of Persons:</td>
	<td><input /></td>
	</tr>
	
	<tr>
	<td>No of Rooms:</td>
	<td><input /></td>
	</tr>
	
	<tr>
	<td>Breakfast:</td>
	<td><input type="radio" name="breakfast" value="yes"> Yes<br>
  <input type="radio" name="breakfast" value="no"> No<br></td>
	</tr>
	
	<tr>
	<td>Check In(dd-MMM-yyyy):</td>
	<td><input type="text" name="fname" placeholder="dd-MMM-yyyy" ></td>
	</tr>
	
	<tr>
	<td>Check Out(dd-MMM-yyyy):</td>
	<td><input type="text" name="fname" placeholder="dd-MMM-yyyy" ></td>
	</tr>
	
	</table>
	
	
	
</body>
</html>