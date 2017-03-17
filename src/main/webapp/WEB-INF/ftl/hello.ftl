[#ftl]
[#--修改<>为[]--]
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>${username}</h1>
    [@foreachTag foreachCount="3" ]
        <h1> [#list content_list as content ]
                ${content} <br/>
             [/#list]</h1>
    [/@foreachTag]
</body>
</html>