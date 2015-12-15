function checkLetter(ltrElem) {
   //Checks if all anchor elements with id begins with "aid"
   if (ltrElem != null) {
	if (ltrElem.startsWith("aid")) {
		return true;
	}
	else {
		return false;
	}
   }
   else {
	return true;
   }
}