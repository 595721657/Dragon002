<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生管理系统</title>
</head>
<body>
<h1 style="text-align: center;">学生管理系统</h1>
<h3 style="text-align: center;"><a href="add.jsp">增加</a></h3>
<table style="text-align: center; margin: 0px auto;padding: 0px; "border="1" cellpadding="10" cellspacing="0"> 
  <tr>
    <th>序号</th>
    <th>学号</th>
    <th>姓名</th>
    <th>年龄</th>
    <th>性别</th>
    <th>专业</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${student}" var="stu" varStatus="status">
  <tr>
    <td><c:out value="${status.count}"></c:out></td>
    <td>${stu.sno }</td>
    <td>${stu.name }</td>
    <td>${stu.age}</td>
    <td>${stu.sex }</td>
    <td>${stu.special }</td>
    <td><a href="Findsno?sno=${stu.sno}">修改</a>&nbsp;&nbsp;<a href="Delete?sno=${stu.sno}">删除</a></td>
  </tr>
  </c:forEach>
</table>
</body>
</html>