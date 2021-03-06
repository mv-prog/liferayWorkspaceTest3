<%@ include file="/init.jsp" %>

    <%
        String buttonStyle = "";
        String buttonBgColor = request.getParameter("buttonBgColor");
        if (buttonBgColor != null && !buttonBgColor.isEmpty()) {
        	buttonStyle = "background-color: " + buttonBgColor+ ";";
        }
    %>


    <portlet:renderURL var="renderOrchid">
        <portlet:param name="buttonBgColor" value="orchid" />
    </portlet:renderURL>


        <a class="btn btn-default" style="<%=buttonStyle%>" href="<%=renderOrchid%>">Set orchid</a> 

    <portlet:actionURL name="formHandler" var="actionURL"/>

    <aui:form action="<%= actionURL %>" style="margin-top: 2rem;max-width:400px;">
    <p>Set other button background colors:</p>
        <aui:select name="buttonBgColor">
        <aui:option label="palevioletred"/>
            <aui:option label="mediumvioletred"/>
            <aui:option label="magenta"/>
            <aui:option label="hotpink" />
            <aui:option label="lightpink" />
            <aui:option label="deeppink" />
        </aui:select>
        <aui:button-row>
            <aui:button type="submit" style="<%=buttonStyle%>" value="send"/>
        </aui:button-row>
    </aui:form>
    <portlet:renderURL var="editURL">
<!--     	<portlet:param name="mvcPath" value="/edit.jsp"/> 	 -->
		<liferay-portlet:param name="mvcRenderCommandName" value="edit-component"/>
		<liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
    </portlet:renderURL>
    <aui:a href="<%= editURL %>"> Go to edit mode component </aui:a>
