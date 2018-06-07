<%--
  Created by IntelliJ IDEA.
  User: umusin
  Date: 23.05.2018
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ru">
<head>
  <meta charset="utf-8">
  <title>SED</title>
  <link rel="stylesheet"
        href="https://ajax.googleapis.com/ajax/libs/dojo/1.13.0/dijit/themes/claro/claro.css">

  <link rel="stylesheet" href="css/style.css">
</head>
<body class="claro">
<div id="borderContainer">
  <div id="topContentPane"></div>
  <div id="leftContentPane"></div>
  <div id="centerContentPane"></div>







</div>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/dojo/1.13.0/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
<script>
    dojo.require("dijit/layout/BorderContainer");
    dojo.require("dijit/layout/ContentPane");
    //Add Dijit components you are using here using dojo.require

    dojo.addOnLoad(function() {
        var borderContainer = new BorderContainer({
            style: "width: 100%; height: 100%",
        },"borderContainer");

        var topContentPane = new dijit.layout.ContentPane({
            region: "top",
            splitter: true
        });

        var leftContentPane = new dijit.layout.ContentPane({
            region: "left",
            style: "width: 100px",
            splitter: true
        });

        var centerContentPane = new dijit.layout.ContentPane({
            region: "center",
            //splitter: true
        });


    });
</script>
</body>
</html>
