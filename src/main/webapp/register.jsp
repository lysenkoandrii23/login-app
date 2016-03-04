<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Register App - Register new person</title>
</head>
<body>
<h3>Register person by completing this form.</h3>

<s:form action="register">

		<s:textfield key="personBean.firstName" label="First name" />
		<s:textfield key="personBean.lastName" label="Last name" />
		<s:textfield key="personBean.dateOfBirth" label="Date of birth (dd-mm-yyyy)" />
		<s:textfield key="personBean.phoneNumber" label="Phone number (999-999-9999)" />
		<s:textfield key="personBean.city" label="City" />
		<s:textfield key="personBean.street" label="Street" />
		<s:textfield key="personBean.apartment" label="Apartment" />
 	  
   	  <s:submit/>
   	  
</s:form>	
 
</body>
</html>