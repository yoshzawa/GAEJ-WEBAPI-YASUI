<%@page import="jp.jc21.t.yoshizawa.ofy.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>安い商品の一覧</title>
</head>
<body>
<% 
List<Item> items = (List<Item>)request.getAttribute("Items");
%>
<TABLE border=1>
<% for (Item item : items) {%>
<TR>
<TH><a href="/yasui/getPrice?JAN=<%= item.janCode %>"><%= item.janCode %></a></TH>
<TD><%= item.itemName %></TD>
<TD><a href="<%= item.itemUrl %>"><%= item.itemUrl %></a></TD>
<TD><%= item.price %></TD>
<TD><a href="/yasui/ShopList?SHOPNAME=<%= item.shopName %>"><%= item.shopName %></a></TD>
</TR>
<% } %>
</TABLE>

</body>
</html>