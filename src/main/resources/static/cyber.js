fetch("/api/health")
    .then(response => response.json())
    .then(data => {
        console.log(data);
        alert("Backend Connected!\nStatus: " + data.status);
    })
    .catch(error => {
        console.error(error);
        alert("Backend connection failed!");
    });