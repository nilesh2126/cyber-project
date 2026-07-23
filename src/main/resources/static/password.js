console.log("password.js");
const checkBtn = document.getElementById("checkBtn");

const passwordInput = document.getElementById("passwordInput");

const strength = document.getElementById("strength");
const score = document.getElementById("score");
const message = document.getElementById("message");
 
checkBtn.addEventListener("click",checkPassword);
async function checkPassword(){
    const password = passwordInput.value;
    console.log("Button clicked");

    const response = await fetch("/api/password" ,{
        method: "POST",
        headers: {
            "content-type" : "application/json"
        },
        body: JSON.stringify({
            password: password
        })
    });
    const result = await response.json();
     strength.textContent = "Strength : " + result.strength;
    score.textContent = "Score : " + result.score + "/100";
    message.textContent = "Message : " + result.message;
}