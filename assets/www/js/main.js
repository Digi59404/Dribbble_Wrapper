

function init() {
    //$('html').load("http://www.dribbble.com", function(response, status, xhr) {
      //response.replace('/stylesheets/', 'http://www.dribbble.com/stylesheets/');
      //response.replace('/javascript/', 'http://www.dribbble.com/javascript/');
    //  $('/stylesheets/').replaceAll('http://www.dribbble.com/stylesheets/');
    //});
}

function iframeInject(){
	alert('JS LOADED');
	$('#dribble').contents().find("#header").css('position','fixed');
	$('#dribble').contents().find("#header").css('width','100%');
	$('#dribble').contents().find("#header").css('z-index','100');
	$('#dribble').contents().find("#wrap").css('padding-top','67px');
}