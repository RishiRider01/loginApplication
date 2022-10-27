<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>log in</title>

<!-- Bandhan Icon -->
<link rel="icon" href="images/Bandhan_Logo.png" type="images/icon type">

<!-- CSS Files-->
<link rel="stylesheet" type="text/css" href="/css/login.css"/>

<!-- External Dependencies -->
<link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet'>
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- JQuery -->
<script src="/js/jquery.js"></script>

<!--Bootstrap 5.2.2  -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
	<div class="screen">
		<div class="screen__content">
				<div class="w3-card mx-5 mt-5">
					<div><img class="brand" alt="Bandhan_icon" src="images/Bandhan_Text_Logo.png"></div>
				</div>
				<form class="login">
				
				<div class="login__field">
					<i class="login__icon fas fa-user"></i>
					<input type="text" class="login__input" placeholder="User name / Email">
				</div>
				<div class="login__field">
					<i class="login__icon fas fa-lock"></i>
					<input type="password" class="login__input" placeholder="Password">
				</div>

					<div class="captcha">
						<img alt="capthca" src="data:image/png;base64,${captcha.image}">
						<i class="fa fa-refresh class="mt-2" style="font-size: 24px; color: white" id="refresh"></i>
					</div>
					
					<div class="captcha-txt">
						<input type="text" class="mx-2 captcha-text" style="border-radius: 20px" name="captcha">
					</div>

					<button class="button login__submit">
					<span class="button__text">Log In Now</span>
					<i class="button__icon fas fa-chevron-right"></i>
				</button>				
			</form>
		</div>
		<div class="screen__background">
			<span class="screen__background__shape screen__background__shape4"></span>
			<span class="screen__background__shape screen__background__shape3"></span>		
			<span class="screen__background__shape screen__background__shape2"></span>
			<span class="screen__background__shape screen__background__shape1"></span>
		</div> 		
	</div>
</div>

<script type="text/javascript">

	$(#refresh).click(function(){
		alert("refresh clicked");
	})

</script>
</body>
</html>