<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body class="" style="background: #e2e2e2;">

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-header">
						<h3 class="text-center">Complex Form</h3>
					</div>
					<div class="card-body">
					
						<form action="handleform" method="post">
						
							<div class="form-group">
								<label for="yourName">Your Name</label> 
								<input
									type="text" class="form-control" id="yourName"
									aria-describedby="nameHelp" placeholder="Enter name" name="name">
								<small id="nameHelp" class="form-text text-muted">We'll
									never share your name with anyone else.</small>
							</div>
						
							<div class="form-group">
								<label for="yourId">Your id</label> 
								<input
									type="text" class="form-control" id="yourId"
									placeholder="Enter ID" name="id">
							</div>
							
							<div class="form-group">
								<label for="yourDob">Your DOB</label> 
								<input
									type="text" class="form-control" id="yourDob"
									placeholder="dd/mm/yyyy" name="date">
							</div>
							
							<div class="form-group">
								<label for="selectCourse">Select Courses</label> 
								<select name="courses" class="form-control" 
								id="selectCourse" multiple>
								<option>Java</option>
								<option>Springboot</option>
								<option>Hibernate</option>
								<option>Spring JPA</option>
								<option>Servlet and JSP</option>
								<option>Micro Services</option>
								
								</select>
							</div>
							
							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="gender"
								id="inlineRadio1" value="male">
								<label class="form-check-label" for="inlineRadio1" >Male</label>
								</div>
								<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="gender"
								id="inlineRadio1" value="female">
								<label class="form-check-label" for="inlineRadio1" >Female</label>
								</div>
								
							</div>
							
							<div class="form-group">
							<label for="">Select Type</label>
							<select class="form-control" name="type">
							<option value="oldstudent">Old Student</option>
							<option value="newstudent">New Student</option>
							</select>
							</div>
							
							<div class="card">
							<div class="card-body">
							<p>Your Address</p>
							<div class="form-group">
							<input name="address.street" type="text" class="form-control" placeholder="Enter street">
							</div>
							<div class="form-group">
							<input name="address.city" type="text" class="form-control" placeholder="Enter street">
							</div>
							</div>
							</div>
							
							<div class="text-center">
							<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</form>

					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>