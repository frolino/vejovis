function countHelloInstances() {
				var x = document.getElementsByTagName("h1");
				var i;
				var sum = 0;
				for (i = 0; i < x.length; i++) {
					var y = x[i].innerHTML;
					if (y == "Hello") {
						sum++;
					}
				}

				var z = document.getElementsByTagName("titel");
				z[0].innerHTML = "Print Tags!!";

				document.getElementById("count").innerHTML = sum;
			}