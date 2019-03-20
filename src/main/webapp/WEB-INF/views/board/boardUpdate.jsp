<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1px">
		<tr>
			<td>제목</td>
			<td>${VO.board_title }</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${VO.board_writer }</td>
			<td>작성 시간</td>
			<td>${VO.board_insertdate }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${VO.board_content }</td>
		</tr>
	</table>
	
	
</body>
</html>