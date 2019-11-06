<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="authenticated.offer.form.label.title" path="title"/>
	<acme:form-moment code="authenticated.offer.form.label.moment" path="moment"/>
	<acme:form-moment code="authenticated.offer.form.label.deadline" path="deadline"/>
	<acme:form-textarea code="authenticated.offer.form.label.text" path="text"/>
	<acme:form-textbox code="authenticated.offer.form.label.minReward" path="minReward"/>
	<acme:form-textbox code="authenticated.offer.form.label.maxReward" path="maxReward"/>
	<acme:form-money code="authenticated.offer.form.label.ticker" path="ticker"/>
	
  	<acme:form-return code="authenticated.offer.form.button.return"/>
</acme:form>