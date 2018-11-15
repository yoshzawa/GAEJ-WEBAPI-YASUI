<%@page import="jp.jc21.t.yoshizawa.ofy.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
Item item = (Item)request.getAttribute("Item");
String result = (String)request.getAttribute("Result");
if(item == null ){
%>
{
	"RESULT" : "FAIL"	
}
<% } else { %>
{
	"RESULT" : "OK" ,
	"JAN" : "<%= item.getJanCode() %>" ,
	"PRODUCT" : "<%= item.getItemName() %>" ,
	"URL" : "<%= item.getItemUrl() %>" ,
	"PRICE" : "<%= item.getPrice() %>" 
}
<% }%>
