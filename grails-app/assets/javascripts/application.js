// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-2.2.0.min
//= require bootstrap
//= require_tree .
//= require_self

$(document).ready(function() {
});

if (typeof jQuery !== 'undefined') {
    (function($) {
        $(document).ajaxStart(function() {
            $('#spinner').fadeIn();
        }).ajaxStop(function() {
            $('#spinner').fadeOut();
        });
    })(jQuery);
}


var getListOfUserNames = function () {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            // document.getElementById("demo").innerHTML = this.responseText;
            var listOfUserName =  this.responseText;
            console.log(listOfUserName);
        }
    };
    xhttp.open("GET", "/home/getListOfUserNames", true);
    xhttp.send();

};

/*------------------coding with bootstrap-------------------------------------*/
var bestPictures = new Bloodhound({
    datumTokenizer: Bloodhound.tokenizers.obj.whitespace('username'),
    queryTokenizer: Bloodhound.tokenizers.whitespace,
     prefetch: '../home/getListOfUserNames',
    remote: {
        url: '../home/getListOfUserNames/%QUERY',
        wildcard: '%QUERY'
    }
});

$('#remote .typeahead').typeahead(null, {
    name: 'best-pictures',
    display: 'username',
    source: bestPictures
});
/*------------------coding with bootstrap end-------------------------------------*/