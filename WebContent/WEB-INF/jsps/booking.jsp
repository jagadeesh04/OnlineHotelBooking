<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

.alnright {
	text-align: left;
}
</style>

</head>
<body>
	<h1>UKP Hotels Online Booking</h1>

	<hr>

	<br>
	<h3>Book a Room</h3>
	<br>
	<form:form action="doBook.htm" method="post"
		modelAttribute="booking">

		<table align="center">
			<tr>
				<td class='alnright'>Customer Name:</td>
				<td><input type="text" name="customerName"/></td>
			</tr>

			<tr>
				<td class='alnright'>Email:</td>
				<td><input type="text" name="email"/></td>
			</tr>

			<tr>
				<td class='alnright'>Phone:</td>
				<td><input type="text" name="phone"/></td>
			</tr>

			<tr>
				<td class='alnright'>Address:</td>
				<td><input  type="text" name="address"/></td>
			</tr>

			<tr>
				<td class='alnright'>Room:</td>
				<td><select>
						<option value="select" selected="selected">Select</option>
						<option value="A/C Executive Double Room">A/C Executive
							Double Room</option>
						<option value="A/C Deluxe Double Room">A/C Deluxe Double
							Room</option>
						<option value="A/C Suite">A/C Suite</option>
						<option value="Dormitory">Dormitory</option>
				</select></td>
			</tr>

			<tr>
				<td class='alnright' >No of Persons:</td>
				<td><input  type="text" name="noOfPersons"/></td>
			</tr>

			<tr>
				<td class='alnright' >No of Rooms:</td>
				<td><input  type="text" name="noOfRooms"/></td>
			</tr>

			<tr>
				<td class='alnright'>Breakfast:</td>
				<td><input type="radio" name="breakfast" value="yes">
					Yes <input type="radio" name="breakfast" value="no"> No<br></td>
			</tr>

			<tr>
				<td class='alnright'>Check In(dd-MMM-yyyy):</td>
				<td><input type="text" name="fname" placeholder="dd-MMM-yyyy"></td>
			</tr>

			<tr>
				<td class='alnright'>Check Out(dd-MMM-yyyy):</td>
				<td><input type="text" name="fname" placeholder="dd-MMM-yyyy"></td>
			</tr>
			<tr>
				<td class='alnright'><input type="submit"
					value="Confirm Booking"></td>
			</tr>
		</table>

	</form:form>


</body>
</html>