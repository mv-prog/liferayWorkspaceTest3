<%@ include file="/init.jsp" %>
<div class="container">
<h2>Edit Mode</h2>
<h3>This is my edit mode component</h3>
<p><em>How many users are registered?</em> <%= request.getAttribute("howManyUsers") %> users in total.</p>
<!-- <portlet:resourceURL var="buttonClickURLA"> -->
<%--     <portlet:param name="cmd" value="buttonA"/> --%>
<!-- </portlet:resourceURL> -->

<!-- <portlet:resourceURL var="buttonClickURLB"> -->
<%--     <portlet:param name="cmd" value="buttonB"/> --%>
<!-- </portlet:resourceURL> -->

<%--  <a class="btn btn-default" href="<%= buttonA %>">ButtonA</a>  --%>
<%--  <a class="btn btn-default" href="<%= buttonB %>">ButtonB</a>  --%>
 
<liferay-ui:header title="edit.mode" backURL="<%= backURL %>"></liferay-ui:header>
</div>
