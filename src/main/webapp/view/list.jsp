<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
<link href="/css/index3.css" rel="stylesheet">
</head>
<body>
	 <form action="list" method="post">
		品牌：<input type="text" name="pid" value="${vo.pid}">-类型：<input type="text" name="tid" value="${vo.tid}">
		价格：<input type="text" name="p1" value="${vo.p1}">--<input type="text" name="p2" value="${vo.p2}">  商品名称：<input type="text" name="name" value="${vo.name}">
			<input type="submit" value="查询">
		<input type="button" value="添加" onclick="adds()">
		<table>
			<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品品牌</td>
			<td>商品品牌</td>
			<td>尺寸</td>
			<td>单价</td>
			<td>数量</td>
			<td>标签</td>
			<td>商品图片</td>
			</tr>
			<c:forEach items="${list}" var="G">
			<tr>
				<td>${G.id}</td>
				<td>${G.name}</td>
				 <td>${G.ename}</td> 
				<td>
					<c:if test="${G.pid==1}">三星</c:if>
					<c:if test="${G.pid==2}">苹果</c:if>
					<c:if test="${G.pid==3}">华为</c:if>
					<c:if test="${G.pid==4}">小米</c:if>
					<c:if test="${G.pid==5}">联想</c:if>
					<c:if test="${G.pid==6}">vivo</c:if>
				</td>
				<td>
					<c:if test="${G.tid==1}">电视</c:if>
					<c:if test="${G.tid==2}">手机</c:if>
					<c:if test="${G.tid==3}">电器</c:if>
				</td>
				<td>${G.size}</td>
				<td>${G.price}</td>
				<td>${G.number}</td>
				<td>${G.bq}</td>
				<td>${G.pic}</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="100">
				<button name="pageNum" value="1">首页</button>
				<button name="pageNum" value="${page.prePage==0?1:page.prePage}">上一页</button>
				<button name="pageNum" value="${page.nextPage==0?page.pages:page.nextPage}">下一页</button>
				<button name="pageNum" value="${page.pages}">末页</button>
				第${page.pageNum}页/共${page.pages}页/共${page.total}数据
				</td>
				
			</tr>
			
		</table> 
		
	
	 </form> 
	 <script type="text/javascript">
	 function adds() {
		location="view/add.jsp"
	}
	 </script>
</body>
</html>