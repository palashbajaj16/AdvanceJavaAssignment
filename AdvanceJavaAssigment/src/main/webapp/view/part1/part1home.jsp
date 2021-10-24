<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link rel="stylesheet" href="css/root.css">
</head>
<body>
	<div class="container-fluid top-bar"> 
	<div class="mnu">
	 <a href="index.html">Home</a>
	</div>          
    </div>
    <div class="container">
            <div class="col-lg-9 mx-auto">
                <div class="block-div mt-3">
                <h5 class="text-center">Task 1.a) Hello World Servlet Pages</h5>
                    <table class="table table-dark table-hover m-2">
                          <tr>
                            <th scope="row"></th>
                            <td colspan="3">Normal Servlet</td>
                            <td><button type="button" class="btn btn-light"><a href="normalservlet">Normal Servlet</a></button></td>
                          </tr>
                          <tr>
                            <th scope="row"></th>
                            <td colspan="3">Generic Servlet</td>
                            <td><button type="button" class="btn btn-light"><a href="genericservlet">Generic Servlet</a></button></td>
                          </tr>
                          <tr>
                            <th scope="row"></th>
                            <td colspan="3">HTTP Servlet</td>
                            <td><button type="button" class="btn btn-light"><a href="httpservlet">HTTP Servlet</a></button></td>
                          </tr>
                        </tbody>
                      </table>
                    </div>  
                    <div class="block-div mt-3">
                  	<h5 class="text-center">Task 1.b) Hello World JSP Page</h5>
                    <table class="table table-dark table-hover m-2">
                          <tr>
                            <th scope="row"></th>
                            <td colspan="3">JSP Page</td>
                            <td><button type="button" class="btn btn-light"><a href="task1demo">JSP Page</a></button></td>
                          </tr>
                        </tbody>
                      </table>
                </div>
            </div>
        </div>      
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>  
</body>
</html>