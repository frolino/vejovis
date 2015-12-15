function initMenu() {
    if (CHANGED == 0) {
    	//changeHideTodosLayers();
	CHANGED = 1;
    }
    document.body.style.backgroundColor = "beige";
    var uls = document.getElementsByTagName("ul");
    var ct = uls[0].innerHTML;
    for (i = 0; i < uls.length; i++) {
        if (uls[i].className == "menuList") {
            decorateMenu(uls[i]);
        }
    }
}