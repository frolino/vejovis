function append(RHUCKO1) {
  document.body.style.backgroundColor="red";
  document.getElementById("aid"+RHUCKO1).style.visibility="hidden";
    //document.getElementById("assemble").innerHTML+=document.getElementById("aid"+RHUCKO1).innerHTML;
    creatWord2(RHUCKO1);
    var ltrs = document.getElementsByTagName("a");
    var ok = true;
    for (i = 0; i < ltrs.length; i++) {
	var ok = ok && checkLetter(ltrs[i].getAttribute("id"));
    }
    if (!ok) {
	history.go(0);
    }
}