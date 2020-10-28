<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Users list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>

    <#list users as user>
    <tr>
        <td><a href="/webtest_war/user/${user.id}">${user.id}</a></td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.age}</td>
        <td><a href="/webtest_war/delete/${user.id}">Delete</a></td>
        <td><a href="/webtest_war/update/${user.id}">Update</a></td>
    </tr>
</#list>

</table>

<a href="/webtest_war/addUser">Create new user</a>

</body>
</html>