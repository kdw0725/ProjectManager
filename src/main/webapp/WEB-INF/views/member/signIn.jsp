<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="signInPage">
		<h3>이름</h3>
		<input id="member_name" name="member_name" type="text" />
		<h3>아이디</h3>
		<input id="member_id" name="member_id" type="text" /><br>
		<button type="button" name="button" onclick="idOverlap()">중복확인</button>
		<br>
		<br>

		<h3>비밀번호</h3>
		<input id="member_pw"name="member_pw" type="password" />
		<h3>이메일</h3>
		<input id="member_email"name="member_email" type="text" placeholder="aaa@gmail.com" />
		<br>
		<h3>연락처</h3>
		<input id="member_pnum"name="member_pnum" type="text" placeholder="ex.010-0000-0000" />
		<br> 
		<br> 
		<input type="submit" value="회원가입"> 
		<input type="reset" value="재작성">

	</form>
</body>

<script>
	function idOverlap() {
		location.href = "/ProjectManager/idOverlap"
	}
</script>
</html>