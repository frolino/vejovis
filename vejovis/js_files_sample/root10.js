
			function generateH1s() {
				//Hide intro message
				var introMsg = document.getElementById("mainMessage");
				var introBtn = document.getElementById("mainOKButton");
				introMsg.style.display = "none";
				introBtn.style.display = "none";

				//Show H1s and count button
				var h1s = document.getElementById("tags");
				var newBtn = document.getElementById("startBtn");
				h1s.style.display = "inline";
				newBtn.style.display = "inline";
			}

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

			function hideButton() {
				document.getElementById("startBtn").innerHTML = "Counting.."
			}
		