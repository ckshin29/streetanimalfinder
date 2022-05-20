<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>login</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/login/login.css" type="text/css">
</head>
<body>
  <jsp:include page="/header/header.jsp"/>
<main>
<section class="bigbox">
	<div class="login-container">
		<div class="row login-box">
			<div class="login-detail">
				<div class="login-form-bg">
				
			
	<header class = "login">
		<h2 class="login-banner">Login</h2> 
	</header>

	<form id="login-form" class="login-input" action="#" method="post" novalidate="novalidate">
		<div class="write-login-form">
			<label class="login-id g-brd-main--hover">아이디:</label>
			<input class="form-control" name="username" type="text">
		</div>
		<div class="write-login-form">
			<label class="login-pw g-brd-main--hover">비밀번호:</label>
			<input class="form-control" name="password" type="text">
			<div class="row status-box">

				<div class="col align-self-center">
						<label class = "login-status">
							<input class="login-status-input" type="checkbox" checked name="remember-me">
							<span class="login-statsu-check-icon">
							<i class="fa" data-check-icon=""></i>
						</span>
						로그인 유지
						</label>
				</div>
				<div class="col align-self-center text-right">
					<a class="find-id" href="${pageContext.request.contextPath}/find_id_pw/id_mobileform.jsp" style="color:#019267">아이디 찾기</a>
					<a class="find-pw" href="${pageContext.request.contextPath}/find_id_pw/pw_mobileform.jsp" style="color:#019267">비밀번호 찾기</a>
				</div>
			</div>
		</div>

		<div class="login-button">
			<button class="btn btn-block" type="submit">로그인</button>
		</div>
	</form>

	<footer class="login-footer">
		<p class="question-signin">
			아직 회원이 아니신가요?
			<a class="g-font-weight-500" href="${pageContext.request.contextPath}/join/join.jsp">회원가입</a>
		</p>

	</footer>


</div>
</div>
</div>
</div>
</section>
</main>
  <jsp:include page="/footer/footer.jsp"/>

</body>
</html>