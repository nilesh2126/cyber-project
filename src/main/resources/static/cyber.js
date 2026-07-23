const scanButton = document.getElementById("scanBtn");
const urlInput = document.getElementById("urlInput");

const status = document.getElementById("status");
const threat = document.getElementById("threat");
const recommendation = document.getElementById("recomendation");
const riskScore = document.getElementById("riskScore");
scanButton.addEventListener("click",scanURL);
async function scanURL(){
    const url = urlInput.value;
    const response = await fetch("/api/scan", {
        method :"POST",
        headers: {
            "content-type" : "application/json"
        },
        body: JSON.stringify({
            url: url
        })
    });
    const result = await response.json();
    status.textContent = "Status: " + result.status;
    riskScore.textContent = "Risk Score: " + result.riskScore + "/100";
    if(result.status === "SAFE"){
        threat.textContent = "Threat Level: Low";
    } else {
        threat.textContent = "Threat Level: High";
    }
    recommendation.textContent = result.message;
}
async function checkPassword() {

    const password = passwordInput.value;

    const response = await fetch("/api/password", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            password: password
        })
    });

    const result = await response.json();
}