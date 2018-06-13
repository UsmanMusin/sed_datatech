<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>SED</title>
  <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/dojo/1.13.0/dijit/themes/claro/claro.css" />
  <link rel="stylesheet" type="text/css" href="style.css">
  <script>
      var dojoConfig = {
          async: true,
          parseOnLoad: true,
          packages: [
              {name: "webapp", location: location.pathname.replace(/\/[^/]+$/, '') + "/webapp"},
              {name: "gridx", location: location.pathname.replace(/\/[^/]+$/, '') + "/gridx"}
          ]
      };
  </script>
  <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/dojo/1.13.0/dojo/dojo.js"></script>
  <script type="text/javascript" src="app/Tree.js"></script>
  <script type="text/javascript" src="app/OpenTab.js"></script>
  <script type="text/javascript" src="app/OpenGrid.js"></script>
</head>
<body class="claro">
<div data-dojo-type="dijit/layout/BorderContainer" style="width: 100%; height: 100%">
  <div id="left-panel" data-dojo-type="dijit/layout/AccordionContainer" data-dojo-props="region: 'left', splitter: true" style="width: 400px; height: 100%; margin: 0 auto;">
    <div data-dojo-type="dijit/layout/AccordionPane" title="Справочник организаций">
      <div id="top-tree"></div>
    </div>
    <div data-dojo-type="dijit/layout/AccordionPane" title="Поручения">
      <div id="bottom-tree"></div>
    </div>
  </div>
  <div id="tab-container" data-dojo-type="dijit/layout/TabContainer" data-dojo-props="region: 'center'">
    <div id="grid-container"></div>
  </div>
</div>
</body>
</html>