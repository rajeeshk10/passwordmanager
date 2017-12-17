<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
    <%@ page import="passwordmanager.AccountType" %>
</head>
<body>
  <fieldset>

  <!-- Form Name -->
  <legend><g:message code="form.accounttype.register" /></legend>

  <h3>success!!!</h3>
  <table class="table">
   <thead>
     <tr>
       <th>NO:</th>
       <th>Account Type</th>
       <th>Account Category</th>
     </tr>
   </thead>
   <tbody>
  <g:each in="${AccountType.list()}">
  <tr>
    <td>${it.id}</td>
    <td>${it.typeName}</td>
    <td>${it.accountCategory.category}</td>
  </tr>
  </g:each>


   </tbody>
 </table>


</fieldset>

</body>
</html>
