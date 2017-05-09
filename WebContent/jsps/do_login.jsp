<%@page import="service.serviceImpl.UserServiceImpl"%>
<%@page import="entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
	<%@ page import="service.UserService"%>
	<%@ page import="entity.User"%>
<%
String username="";
String password="";
String name="";
String school="";
String phone="";
String email="";

//防止中文乱码
request.setCharacterEncoding("utf-8");

username = request.getParameter("username");
password = request.getParameter("password");
name = request.getParameter("name");
school = request.getParameter("school");
email = request.getParameter("email");
phone = request.getParameter("phone");

session.setAttribute("name", name);
session.setAttribute("username", username);
session.setAttribute("school","school");


Customer customer = new Customer();
customer.setAccount(username);
customer.setPassword(password);
customer.setEmail(email);
customer.setPhone(phone);
customer.setSchool(school);
customer.setType("0");

UserService userService = new UserServiceImpl();
if(userService.register(customer))
{
    
	//request.getRequestDispatcher("login_success.jsp").forward(request, response);
	//response.sendRedirect("login_success.jsp");
	response.sendRedirect("login_success.jsp");
	
}
else
{   //请求重定向
	//response.sendRedirect("login_failure.jsp");	
}

%>
