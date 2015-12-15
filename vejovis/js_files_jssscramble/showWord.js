function showWord() {
  document.body.style.backgroundColor="beige";
  var wordId = "theWord";
  document.getElementById(wordId).innerHTML=actual;
  wordSoFar = document.getElementsByTagName("span");
  for (i = 0; i < wordSoFar.length; i++) {
	_theWord = wordSoFar[i].getAttribute("id");
	if (_theWord != null && _theWord == wordId) {
		//OK
	}
  }
}