document.addEventListener("deviceready", onDeviceReady, false);

function onDeviceReady() {
    navigator.splashscreen.hide();
}


function iframeInject(){
	$('#dribble').contents().find("#header").css('position','fixed');
	$('#dribble').contents().find("#header").css('width','100%');
	$('#dribble').contents().find("#header").css('z-index','100');
	$('#dribble').contents().find("#wrap").css('padding-top','67px');
	
	$('#dribble').contents().find("#t-shots a.has-sub").attr('href','#');
	$('#dribble').contents().find("#t-explore a.has-sub").attr('href','#');
	$('#dribble').contents().find("#t-players a.has-sub").attr('href','#');
}