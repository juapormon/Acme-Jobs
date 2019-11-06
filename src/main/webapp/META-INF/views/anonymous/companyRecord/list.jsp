<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>

	<acme:list-column code="anonymous.companyRecord.list.label.companyName" path="companyName" width="33%"/>
	<acme:list-column code="anonymous.companyRecord.list.label.sector" path="sector" width="33%"/>
	<acme:list-column code="anonymous.companyRecord.list.label.ceo" path="ceo" width="34%"/>

</acme:list>