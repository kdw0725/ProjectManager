<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form id ="insertBoardForm" name= "insertForm" method="get" action="boardInsertPage">
         <table class="table table-striped table-hover">
            <thead class="thead-dark">
   
               <tr>
                  <td>작성자</td>
                  <td>
                     <input type="text" id ="board_writer" name="board_writer" required/> 
                  </td>
               </tr>
               <tr>
                  <td>제&nbsp;&nbsp;&nbsp;목</td>
                  <td colspan="3">
                     <input class="form-control" type="text" id="board_title" name="board_title" required/>
                  </td>
               </tr>
               <tr>
                  <td class="boardAreaTitleModal">내&nbsp;&nbsp;&nbsp;용</td>
                  <td colspan="3">
                     <textarea name="board_content" id="board_content" style="width: 1000px; height: 205px;" required></textarea>
                  </td>
               </tr>
               <tr>
                  <td colspan="4">
                     <input class="btn btn-outline-secondary" type="reset" value="재작성">
                     <input class="btn btn-outline-secondary" type="submit" id="insertButton" value="등록"/>
                     <input class="btn btn-outline-secondary" type="reset" value="목록" onclick="boardList()">
                   </td>
               </tr>
            </thead>
         </table>
      </form>

</body>

<script>
function boardList(){
	location.href="/ProjectManager/boardList"
}
</script>
</html>