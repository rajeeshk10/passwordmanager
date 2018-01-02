<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
    <%@ page import="passwordmanager.AccountType" %>
    </head>
<body>
<form class="form-horizontal" name="accountRegistration">
    <fieldset>

        <!-- Form Name -->
        <legend>Register Account</legend>

<section>



    <!-- Select Basic -->
    <div class="form-group">
        <label class="col-md-4 control-label">Select Basic</label>
        <div class="col-md-4">
            <g:select name="account.accountType.id"  from="${AccountType.list()}"  class="form-control"
                      optionKey="id" optionValue="typeValue" noSelection="${['null':'Select One...']}"/>
        </div>
    </div>


    <div class="form-group">
        <label class="col-md-4 control-label" >username</label>
        <div class="col-md-4">
            <input name="account.tempUsername" type="text" placeholder="placeholder" class="form-control input-md typeahead">
        </div>
    </div>

    <div class="form-group">
        <label class="col-md-4 control-label" >password</label>
        <div class="col-md-4" >
            <input name="account.tempPassword" id="password" type="text" placeholder="placeholder" class="form-control input-md typeahead">
        </div>
    </div>

    <!-- Text input-->
    <div class="form-group">
        <label class="col-md-4 control-label" >Secret Key</label>
        <div class="col-md-4" id="remote">
            <input id="textinput" name="secretKey" type="text" placeholder="placeholder" class="form-control input-md typeahead">
        </div>
    </div>



</section>
        <div class="form-group">
          <span class="col-md-4"></span>
          <div class="col-md-8">

              <g:actionSubmit class="btn btn-success" value="${message(code:'label.submit')}"    action="saveAccount" onclick="return confirm('Are you sure???')" />
              <button id="button2id" name="button2id" class="btn btn-danger">Cancel</button>
          </div>
        </div>


    </fieldset>


</form>
</body>
</html>
