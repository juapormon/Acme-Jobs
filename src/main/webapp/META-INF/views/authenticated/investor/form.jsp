<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="authenticated.investor.form.label.name" path="name"/>
	<acme:form-textbox code="authenticated.investor.form.label.sector" path="sector"/>
	<acme:form-textbox code="authenticated.investor.form.label.statement" path="statement"/>
	<acme:form-integer code="authenticated.investor.form.label.stars" path="stars"/>
	
  	<acme:form-return code="authenticated.investor.form.button.return"/>
</acme:form>