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