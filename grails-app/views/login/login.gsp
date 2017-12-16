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
        <legend>Login</legend>


        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="textinput">username</label>
            <div class="col-md-4">
                <input id="textinput" name="textinput" placeholder="placeholder" class="form-control input-md" type="text">

            </div>
        </div>

        <!-- Password input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="passwordinput">password</label>
            <div class="col-md-4">
                <input id="passwordinput" name="passwordinput" placeholder="placeholder" class="form-control input-md" type="password">
                
            </div>
        </div>

        <div class="form-group">
          <span class="col-md-4"></span>
          <div class="col-md-8">
            <button id="button1id" name="button1id" class="btn btn-success">submit</button>
            <button id="button2id" name="button2id" class="btn btn-danger">cancel</button>
          </div>
        </div>


    </fieldset>
</form>

</body>
</html>
