<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
	<h2>Employee info</h2>
	<br>
	<form:form action="saveEmployee" modelAttribute="employee">
		<p>Name <form:input path="name" value="Xenos" /></p>
		<p>Surname <form:input path="surname" value="Zena"/></p>
		<p>Department <form:input path="department" value="HR" /></p>
		<p>Salary <form:input path="salary" value="900" /></p>
		<p><input type="submit" value="OK"></p>
	</form:form>
</body>
</html>
