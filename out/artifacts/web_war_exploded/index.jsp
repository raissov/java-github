<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <meta charset="UTF-8">
  <title>My super project!</title>
</head>
<%@include file="header.jsp"%>
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
  <h1>Super app!</h1>
</div>

<div class="w3-container w3-center">
  <div class="w3-bar w3-padding-large w3-padding-24">
    <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='list.jsp'">List users</button>
    <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='add.jsp'">Add user</button>
  </div>
</div>
<%@include file="footer.jsp"%>
