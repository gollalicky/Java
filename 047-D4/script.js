
        function checkVote() {

            let age = Number(document.getElementById("age").value);

            if (age >= 18) {
                document.getElementById("result").innerHTML =
                "You are eligible to vote";
            }
            else {
                document.getElementById("result").innerHTML =
                "You are not eligible to vote";
            }
        }
  
let a = 10;
let b = 5;

console.log("Addition :" + (a + b));
console.log("Subtraction :" + (a - b));
console.log("Multiplication :" + (a * b));
console.log("Division :" + (a / b));