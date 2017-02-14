<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>物流管理系统</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<style media="all" type="text/css">@import "../style/all.css";</style>
	<script type="text/javascript" src="../script/jquery-1.3.2.min.js"></script>
	<script type="text/javascript">
	<!--
		function reinitIframe(){
			var iframe = document.getElementById("frame_content");
			try{
				var bHeight = iframe.contentWindow.document.body.scrollHeight;
				var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
				var height = Math.max(bHeight, dHeight);
				iframe.style.height = height;

			}catch (ex){}
		}
		$(function(){
			window.setInterval("reinitIframe()", 200);
			$("#left-column h3").bind("click",function(){
				var t = $(this);
				t.toggleClass('link');
				t.next().toggle();
			});
		});
	//-->
	</script>
</head>
<body>
<div id="main">
	<div id="header">
		<a href="index.html" class="logo"><img src="../style/img/logo.gif" width="200" height="29" alt="" /></a>
		<ul id="top-navigation">
			<li><span><span><a href="../index.html">首页</a></span></span></li>
			<li><span><span><a href="../cus_server/index.html">客户服务中心</a></span></span></li>
			<li class="active"><span><span>调度中心</span></span></li>
			<li><span><span><a href="../sub_dept/index.html">分站管理</a></span></span></li>
			<li><span><span><a href="../depot_manage/index.html">库房管理</a></span></span></li>
			<li><span><span><a href="../dist_hub/index.html">配送中心</a></span></span></li>
			<li><span><span><a href="../finance_manage/index.html">财务管理</a></span></span></li>
		</ul>
		<div id="operator"class="active">操作员&nbsp;<span>admin</span>&nbsp;<a href="#">退出</a></div>
	</div>
	<div id="middle">
		<div id="left-column">
			<h3>调度中心</h3>
			<ul class="nav">
				<li><a href="queryOrderform?pageSize=3&iCurrPageNo=1" target="center-frame">手动调度</a></li>
				<li><a href="order/orderList2.html" target="center-frame">自动调度</a></li>
				<li><a href="order/orderList3.html" target="center-frame">订单状态修改</a></li>
				<li class="last"><a href="task/taskList.html" target="center-frame">任务单管理</a></li>
			</ul>
		</div>
		<div id="center-column">
			<iframe id="frame_content" name="center-frame" src="home.jsp" frameborder="0" scrolling="no" allowTransparency="true" style="width:100%;height:500px;margin:0 0;padding:0 0;"></iframe>
		</div>
	</div>
	<div id="footer"></div>
</div>
<div id="copyright">Copyright &copy;2009 长沙牛耳第二小组</div>
</body>
</html>

