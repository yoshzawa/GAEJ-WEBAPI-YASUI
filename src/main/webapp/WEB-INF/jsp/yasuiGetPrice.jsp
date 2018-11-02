<%@page import="jp.jc21.t.yoshizawa.ofy.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
List<Item> items = (List<Item>)request.getAttribute("Items");
String result = (String)request.getAttribute("Result");
if(items == null ){
%>
{
	"RESULT" : "FAIL"	
}
<% } else { 
Item item = items.get(0);
%>
{
	"RESULT" : "OK" ,
	"JAN" : "<%= item.getJanCode() %>" ,
	"PRODUCT" : "<%= item.getItemName() %>" ,
	"URL" : "<%= item.getItemUrl() %>" ,
	"PRICE" : "<%= item.getPrice() %>" 
}
<% }%>
