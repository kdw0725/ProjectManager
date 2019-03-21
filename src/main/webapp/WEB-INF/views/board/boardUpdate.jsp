<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form id ="updateBoardForm" name= "updateForm" method="get" action="boardUpdatePage">
	     <input type="hidden" value="${VO.board_no}" name="board_no" id="board_no" />
         <table class="table table-striped table-hover">
            <thead class="thead-dark">
   
               <tr>
                  <td>작성자</td>
                  <td>
                     <input type="text" id ="board_writer" name="board_writer" value="${VO.board_writer }" required/> 
                  </td>
               </tr>
               <tr>
                  <td>제&nbsp;&nbsp;&nbsp;목</td>
                  <td colspan="3">
                     <input class="form-control" type="text" id="board_title" name="board_title" value="${VO.board_title }"required/>
                  </td>
               </tr>
               <tr>
                  <td class="boardAreaTitleModal">내&nbsp;&nbsp;&nbsp;용</td>
                  <td colspan="3">
                 	 <input name="board_content" id="editor" value="${VO.board_content}" style="width: 1000px; height: 205px;" required></input>
                  </td>
               </tr>
               <tr>
                  <td colspan="4">
                     <input class="btn btn-outline-secondary" type="button" value="취소" onclick="boardDetail(${VO.board_no})">
                     <input class="btn btn-outline-secondary" type="submit" id="insertButton" value="수정"/>
                     <input class="btn btn-outline-secondary" type="button" value="목록" onclick="boardList()">
                   </td>
               </tr>
            </thead>
         </table>
      </form>
	
	
</body>

<script>
function boardList(){
	location.href="/ProjectManager/boardList";
}
function boardDetail(board_no){
	location.href = "/ProjectManager/boardDetail?board_no="+board_no;
}
</script>
</html>