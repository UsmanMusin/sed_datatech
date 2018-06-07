dojo.require("dijit/layout/BorderContainer");
dojo.require("dijit/layout/ContentPane");

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