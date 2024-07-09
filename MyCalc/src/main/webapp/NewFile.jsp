<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mera JSP Page</title>

<style>
.mimg{
height:15%;
width:15%;
margin-top:15px;
}
body{
text-align:center;
background:linear-gradient(to right,#2b40ff,#07121a);
}
h1{
color:white;
font-size:50px;
margin:-62px;
padding:60px;
}
input{
	font-size:20px;
	border:2px,solid,white;
	border-radius:10px;
	color:white;
	background-color:black;
	padding:15px;
	}
button{
	font-size:30px;
	color:white;
	background-color:black;
	border-radius:10px;
	margin:40px;
	padding:15px;
	border:2px,solid,white;
}
img:hover{
-ms-transform:scale(1.1);
-webkit-transform:scale(1.1);
transform:scale(1.1);
}
.emj{
	height:6%;
	width:6%;
	margin-left:-15px;
	margin-bottom:-10px;
	margin-top:-20px;
}
.ejoke{
	height:50px;
	width:50px;
	margin-bottom:-16px;
}
h3{
	margin-top:20px;
	color:white;
	
}
</style>

</head>
<body>
<img src="Images/laughing.gif" class="mimg">
<h1>Joke, of the Day !</h1>
<h3><img src="Images/emoji.gif" class="ejoke">Joke = <%=request.getParameter("joke") %></h3>
<form action="MyServlet">
	<input name="num1" placeholder="FirstNumber">
	<input name="num2" placeholder="SecondNumber">
	<br>
	<Button name="btn1" value="1">+</Button>
	<Button name="btn1" value="2">-</Button>
	<Button name="btn1" value="3">*</Button>
	<Button name="btn1" value="4">/</Button>
</form>

<h1>Ans = <%=request.getParameter("Ans") %><img src="Images/thumbs-up.gif" class="emj"></h1>
</body>
</html>