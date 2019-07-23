<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" href="myCoolStyles.css">
    </head>
    <body>
        <div class="display">
            <form action="MyServlet" method="POST" name="loginForm">
                <fieldset>
                    <legend>username:</legend>
                    <input required autocomplete="off" name="username"/>
                </fieldset>
                <fieldset>
                    
                    <legend>password:</legend>
                    <input required autocomplete="off" type="password" name="password"/>
                </fieldset>
                <fieldset>
                    
                    <legend>Position:</legend>
                    <input type="radio" name="position" value="employee" checked> Employee
                    <input type="radio" name="position" value="manager"> Manager<br>
                </fieldset>
                <br>
                <input type="submit" value="login"/>
            </form>
        </div>
    </body>
</html>