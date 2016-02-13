function doRaty(id,scoreVal){
	
	$(('#'+id)).raty({
	  size     : 36,
	  starOff: 'resources/images/star-off.png',
	  starOn : 'resources/images/star-on.png',
	  scoreName: 'review[point]' ,
	  readOnly: true,
	  score : scoreVal
	});
}

