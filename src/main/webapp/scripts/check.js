


window.onload = function() {
	validate();
}
function validate() {
    let user = {username:document.getElementById("username")};

  
    // user["username"] =  document.getElementById("username");
    // user["password"] =  document.getElementById("password");
    // user["position"] =  document.getElementById("position");
    

    // document.getElementById("password").innerText = "password: "+document.forms["loginForm"][+user.password];

    // document.getElementById("position").innerText = "position: "+document.forms["loginForm"][+user.position];

}
// let user = {};

// window.onload = function() {
// 	populateUser();
// }

// function populateUser() {
// 	// send a GET request to SessionServlet to obtain session information
// 	fetch("http://localhost:8080/ServletDemo/session").then(function(response) {
// 		return response.json(); // parsing json data in the response as a JS object
// 	}).then(function(data) {
// 		console.log(data);
// 		// check whether there is a valid session
// 		//define behavior for when there is no valid user
// 		if(data.session === null) {
// 			window.location = "http://localhost:8080/ServletDemo/login"
// 		} else {
// 			//define behavior for when a user is returned
// 			user = data;
// 			document.getElementById("username").innerText = "username: "+user.username;
// 			document.getElementById("firstname").innerText = "firstname: "+user.firstname;
// 			document.getElementById("lastname").innerText = "lastname: "+user.lastname;
// 			document.getElementById("email").innerText = "email: "+user.email;
// 		}
// 	})
// }