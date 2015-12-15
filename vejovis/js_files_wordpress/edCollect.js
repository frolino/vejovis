function edCollect() {
	var formI = document.getElementsByTagName("input");
	var first = formI[0].dir;
	for (i = 0; i < formI.length; i++) {
		d = formI[i].dir;
	}

	var tb = document.getElementsByTagName("tbody");
	var firstTb = tb[0].style;
	for (i = 0; i < tb.length; i++) {
		tb[i].style.backgroundColor = "white";
	}
}