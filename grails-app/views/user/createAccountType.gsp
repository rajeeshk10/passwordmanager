<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Form Name</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Account Type</label>
  <div class="col-md-4">
  <input id="textinput" name="textinput" placeholder="placeholder" class="form-control input-md" type="text">

  </div>
</div>


<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectbasic">Select Basic</label>
  <div class="col-md-4">
      <g:select  class="form-control" name="${accountType.accountCategory}" from="${accountCategoryList}" value="${it}"
              noSelection="['':'-Choose your account category-']"/>
  </div>
</div>


  <!-- Button (Double) -->
  <div class="form-group">
    <span class="col-md-4"></span>
    <div class="col-md-8">
      <button id="button1id" name="button1id" class="btn btn-success">Submit</button>
      <button id="button2id" name="button2id" class="btn btn-danger">Cancel</button>
    </div>
  </div>


</fieldset>
</form>

</body>
</html>
