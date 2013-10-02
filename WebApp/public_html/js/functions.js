 function hello() {
                var input = document.getElementById("name").value;
                if (input.length === 0) {
                    alert("Please enter a valid name!");
                } else {
                    document.getElementById("output").textContent = "Hello " + input + ", this is a web app!";
                }
                return false;
            }