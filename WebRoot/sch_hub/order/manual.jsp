<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>手动调度订单 - 物流管理系统</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<link href="<%=basePath +  "style/all.css"%>" rel="stylesheet"/>
	
</head>
<body style="background: none">
	<div class="top-bar">
		
		<h1>手动调度订单</h1>
		<div class="breadcrumbs">
		    <div class="button-bar">
				<input type="button" name="Submit" value="返回" onclick='javascript:history.back();' class="button"/>
				<input type="button" name="Submit" value="调度" onclick="javascript:history.back();window.open('harmonic.html');window.open('../task/taskbar.html')" class="button"/>
			</div>
			<a href="../../index.html" target="_top">首页</a> /
			<a href="../index.html" target="_top">调度中心</a> /
			手动调度
		</div>
	</div>
	<div class='select-bar'></div>
		<div class="table" align='center'>
			 <table class="listing" style="width:400px;">
				<tr>
					<th class='first'>订单号</th>
					<th class='last'>投递地址</th>
				</tr>
				<s:iterator value="orderforms">
					<tr>
						<td><s:property value="orderid" /></td>
						<td><s:property value="deliveradress"/></td>
					</tr>
				</s:iterator>
			</table>
			<center>
					<strong>统一分配投递分站:</strong>
					<select name="deliverystation" style='width:auto'>
					  <option value="分站1">分站1</option>
					  <option value="分站2">分站2</option>
					  <option value="分站3">分站3</option>
					  <option value="分站4">分站4</option>
					  <option value="分站5">分站5</option>
					  <option value="分站6">分站6</option>
				</select>
			</center>
		</div>
	</div>
</body>
</html>
