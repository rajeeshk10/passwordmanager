<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
    <%@ page import="passwordmanager.AccountCategory" %>
    <%@ page import="passwordmanager.AccountType" %>
</head>
<body>
<g:form name="accountRegistration"   class="form-horizontal">

<fieldset>

<!-- Form Name -->
<legend><g:message code="form.accounttype.register" /></legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label">Account Type</label>
  <div class="col-md-4">
  <g:textField name="accountType.typeName" value="${accountType.typeName}" class="form-control input-md"/>
  </div>
</div>


<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" >Select Basic</label>
  <div class="col-md-4">
  <g:select name="accountType.accountCategory"  from="${AccountCategory.list()}" value="${accountType?.accountCategory}"
          optionKey="id" optionValue="category" noSelection="${['null':'Select One...']}"/>
  </div>
</div>


  <!-- Button (Double) -->
  <div class="form-group">
    <span class="col-md-4"></span>
    <div class="col-md-8">

      <g:actionSubmit class="btn btn-success" value="${message(code:'label.submit')}"    action="saveAccountTypes" onclick="return confirm('Are you sure???')" />


      <button id="button2id" name="button2id" class="btn btn-danger">Cancel</button>
    </div>
  </div>


</fieldset>
</g:form>

</body>
</html>
