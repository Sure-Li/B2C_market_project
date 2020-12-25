<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="js/jquery-treetable/css/jquery.treetable.css">
<link rel="stylesheet" href="js/jquery-treetable/css/jquery.treetable.theme.default.css">
<!-- <link rel="stylesheet" href="js/jquery-treetable/css/screen.css"> -->
</head>
<body>
	<table id="example-basic-static">
		<tbody>
			<tr data-tt-id="0">
				<td>app</td>
			</tr>
			<tr data-tt-id="1" data-tt-parent-id="0">
				<td>controllers</td>
			</tr>
			<tr data-tt-id="5" data-tt-parent-id="1">
				<td>application_controller.rb</td>
			</tr>
			<tr data-tt-id="2" data-tt-parent-id="0">
				<td>helpers</td>
			</tr>
			<tr data-tt-id="3" data-tt-parent-id="0">
				<td>models</td>
			</tr>
			<tr data-tt-id="4" data-tt-parent-id="0">
				<td>views</td>
			</tr>
		</tbody>
	</table>
</body>
<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="js/jquery-treetable/jquery.treetable.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#example-basic-static").treetable({
			expandable : true
		});
	});
</script>
</html>