function changeHideTodosLayers() {
oldHideTodosLayers = hideTodosLayers;
hideTodosLayers = function() {
 $("todosTable").style.backgroundColor="beige";
 oldHideTodosLayers();
}
}