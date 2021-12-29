<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<sec:csrfMetaTags />
<style>
.btn {
	padding-bottom: 35px;
	height: 35px;
	
}

#page-header {
	margin-top: 0px;
}
 *{margin:0;padding:0;}
    .sl, .sl li{list-style:none;}
    .slide{height:1000px;overflow:hidden; position:relative; top: -115px;}
    .slide .sl {width:calc(100% * 4);display:flex;animation:slide 25s infinite;} /* slide를 8초동안 진행하며 무한반복 함 */
    .slide .sl li{width:calc(100% / 4);height:1000px;;}
    .slide .sl li:nth-child(1){background:linear-gradient(rgba(19, 19, 18, 0.3), rgba(19, 19, 18, 0.3), rgba(19, 19, 18, 0.3)), url(${pageContext.request.contextPath}/resources/images/시설4.jpg) no-repeat center;
    							background-size: cover;}
    .slide .sl li:nth-child(2){background:linear-gradient(rgba(19, 19, 18, 0.3), rgba(19, 19, 18, 0.3), rgba(19, 19, 18, 0.3)), url(${pageContext.request.contextPath}/resources/images/시설3.jpg) no-repeat center;
    							background-size: cover;}
    .slide .sl li:nth-child(3){background:linear-gradient(rgba(19, 19, 18, 0.3), rgba(19, 19, 18, 0.3), rgba(19, 19, 18, 0.3)), url(${pageContext.request.contextPath}/resources/images/시설2.jpg) no-repeat center;
    							background-size: cover;}
    .slide .sl li:nth-child(4){background:linear-gradient(rgba(19, 19, 18, 0.3), rgba(19, 19, 18, 0.3), rgba(19, 19, 18, 0.3)), url(${pageContext.request.contextPath}/resources/images/시설1.jpg) no-repeat center;
    							background-size: cover;}
    @keyframes slide {
      0% {margin-left:0;} /* 0 ~ 10  : 정지 */
      10% {margin-left:0;} /* 10 ~ 25 : 변이 */
      25% {margin-left:-100%;} /* 25 ~ 35 : 정지 */
      35% {margin-left:-100%;} /* 35 ~ 50 : 변이 */
      50% {margin-left:-200%;}
      60% {margin-left:-200%;}
      75% {margin-left:-300%;}
      85% {margin-left:-300%;}
      100% {margin-left:0;}
    }
#loginb {
	
	padding-bottom: 0px;
	padding-left: 0px;
	padding-right: 0px;
	padding-top: 0px;
}
#loginbtn {
	width: 101px;
	padding-bottom: 0;
	padding-left: 0;
	padding-right: 0;
	padding-top: 0;
	 
}
#id {
	width: 332px;
	padding-top: 0px;
	padding-left: 0px;
	padding-bottom: 0px;
	padding-right: 0px;
	margin-bottom: 0px;
}

#password {
	width: 332px;
	padding-top: 0px;
	padding-left: 0px;
	padding-bottom: 0px;
	padding-right: 0px;
	margin-bottom: 0px;
}

#custom-login-btn {
	
}

#doge {
	width: 332px;
	padding-top: 10px;
	padding-left: 0px;
	padding-bottom: 0px;
	padding-right: 0px;
	margin-bottom: 10px;
	margin-top: 10px;
	margin-right: 5px;
}

#findme {
	width: 332px;
	padding-top: 10px;
	padding-left: 0px;
	padding-bottom: 0px;
	padding-right: 0px;
	margin-bottom: 10px;
	margin-top: 10px;
	margin-left: 5px;
}

#findu {
	width: 332px;
	padding-top: 10px;
	padding-left: 0px;
	padding-bottom: 0px;
	padding-right: 0px;
	margin-bottom: 10px;
	margin-top: 10px;
}
</style>
<jsp:include page="../includes/head.jsp" />
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
</head>

<body>
	<div class="page-header" id="page-header">
		<jsp:include page="../includes/header.jsp" />

	
	</div>
	 <div class="slide" >
	     <ul class="sl">
	      <li></li>
	      <li></li>
	      <li></li>
	      <li></li>
	    </ul>
    </div>
	<div class="content" style="padding-top: 0px;">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<h1 class="mb30" align="center">로그인</h1>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<form class="user" method="post"
						action="${pageContext.request.contextPath}/login" id="login_form">
						<div class="row">
							<!-- Textarea -->
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<!-- Text input 아이디-->
								<div class="form-group" align="center">
									<label class=" control-label" for="id" >ID :</label> <input
										id="id" name="username" type="text" class="form-control">
									<!-- required 나중에 붙이기 -->
								</div>
							</div>
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<!-- Text input 비밀번호-->
								<div class="form-group" align="center">
									<label class=" control-label" for="password">PassWord :</label>
									<input id="password" name="password" type="password"
										class="form-control">
									<!-- required 나중에 붙이기 -->
								</div>
							</div>
							<sec:csrfInput />
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" align="center">
								<!-- Button -->
								<div class="form-group" id="loginb">
									<button id="loginbtn" name="singlebutton"
										class="btn btn-default">로그인</button>
										<!-- onclick="kakaoLogin();" 카카오로그인-->
									<a id="custom-login-btn" href="javascript:loginWithKakao()">
										<img
										src="${pageContext.request.contextPath}/resources/images/kakao_login_medium.png" />
									</a>
								</div>
								<div class="kakao-login">
									
								</div>
								<div style="border-top: 1px solid;">
									<a href="${pageContext.request.contextPath}/common/joinUs"
										class="btn btn-default" id="doge">회원가입</a> <a
										href="${pageContext.request.contextPath}/common/findInfo"
										class="btn btn-default" id="findme">아이디 찾기</a> <a
										href="${pageContext.request.contextPath}/common/findInfo"
										class="btn btn-default" id="findu">비밀번호 찾기</a>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="map" id="map"></div>

	<jsp:include page="../includes/footer.jsp" />
	<!-- back to top icon -->
	<a href="#0" class="cd-top" title="Go to top">Top</a>
	<jsp:include page="../includes/foot.jsp" />
	<!-- <script type="text/javascript">
	window.Kakao.init("e59ff1ffd80d084ac77b713f9eab5ae7");
	  function loginWithKakao() {
		 window.Kakao.Auth.login({
	      success: function(authObj) {
	        alert(JSON.stringify(authObj))
	      },
	      fail: function(err) {
	        alert(JSON.stringify(err))
	      },
	    })
	  }
	</script> -->
	<script>
		var csrfHeader = $("meta[name='_csrf_header']").attr("content")
		var csrfToken = $("meta[name='_csrf']").attr("content");
		if (csrfHeader && csrfToken) {
			$(document).ajaxSend(function(e, xhr) {
				xhr.setRequestHeader(csrfHeader, csrfToken);
			});
		}
		$(function() {
			/* $("#loginbtn").click(function() {
				var map = new Map();
				map.set("id", $("#id").val());
				map.set("pwd", $("#password").val());
				console.log(map);
				console.log("로그인버튼 작동");
				
				var user = {
					id : $("#id").val(),
					pwd : $("#password").val()
				}
				console.log(user);		
				
				var url = "${pageContext.request.contextPath}/common/login";
				$.ajax(url, {
					type : "post",		
					data : JSON.stringify(user),
					contentType : "application/json; charset=utf-8",
					success : function(result) {
						if(result === "success"){
							// 메인페이지로 보냄 
							location.href = "${pageContext.request.contextPath}/common/index";
						}
						else {
							 alert("로그인 실패");
						}
						
					},
					error : function(){
						alert("failed ajax login");
					}
				})
			});  */
		})
	</script>


	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=e59ff1ffd80d084ac77b713f9eab5ae7"></script>
	
</body>

</html>
