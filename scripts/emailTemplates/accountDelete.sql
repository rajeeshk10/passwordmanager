
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
</table>
</body>
</html>'
    ,1,'deleteAccount', 'PasswordManager :  Account Deleted #${Account.accountType.typeName}') ;