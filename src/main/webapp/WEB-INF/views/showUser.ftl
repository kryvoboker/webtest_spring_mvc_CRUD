<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User info</title>
</head>
<body>
<h1>User info</h1>
    <table> <#--вывод информации о User-ах-->
        <tr>
            <td>Id</td>
            <td>${user.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${user.email}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${user.age}</td>
        </tr>
    </table>

<br>
<a href="/webtest_war/users">Back</a> <#--возвращаемся назад к таблице User-ов-->
</body>
</html>