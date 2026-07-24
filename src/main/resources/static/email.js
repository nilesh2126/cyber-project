const analyzeBtn = document.getElementById("analyzeBtn");
const emailInput = document.getElementById("emailInput");

const risk = document.getElementById("risk");
const score = document.getElementById("score");
const message = document.getElementById("message");

analyzeBtn.addEventListener("click", analyzeEmail);

async function analyzeEmail(){

    const email = emailInput.value;

    const response = await fetch("/api/email",{

        method:"POST",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify({
            email:email
        })

    });

    const result = await response.json();

    risk.textContent = "Risk Level : " + result.risk;

    score.textContent = "Risk Score : " + result.score + "/100";

    message.textContent = "Message : " + result.message;
}