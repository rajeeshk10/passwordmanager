
  INSERT INTO email_template ( version, body, is_active, name, subject) VALUES ('0','<!DOCTYPE html>
<html>
<head>
<style>

</style>
</head>
<body>
<table>
    <tr><td>Account Name</td><td></td><td>${Account.accountType.typeName}</td></tr>
    <tr><td>username</td><td></td><td>${Account.tempUsername} </td></tr>
    <tr><td>password</td><td></td><td>${Account.tempPassword}</td></tr>
    <tr><td>updatedon </td><td></td><td>${Account.lastUpdated}</td></tr>
</table>
</body>
</html>'
    ,1,'createAccount', 'PasswordManager :  New Account #${Account.accountType.typeName}') ;