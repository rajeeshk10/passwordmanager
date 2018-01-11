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
            <th>Username</th>
            <th>Password</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${listOfAccounts}">
            <tr>
                <td>${it.id}</td>
                <td>${it.accountType.typeName}</td>
                <td>${it.tempUsername}</td>
                <td>${it.tempPassword}</td>
                <td><g:link  class="btn btn-info" action="viewAccount" id="${it.id}">view</g:link></td>
            </tr>
        </g:each>


        </tbody>
    </table>


</fieldset>

</body>
</html>
