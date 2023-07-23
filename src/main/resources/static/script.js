function bookFacility() {
    const facility = document.getElementById("facility").value;
    const date = document.getElementById("date").value;
    const startTime = document.getElementById("startTime").value;
    const endTime = document.getElementById("endTime").value;

    fetch('/bookFacility', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: `name=${facility}&date=${date}&startTime=${startTime}&endTime=${endTime}`,
    })
    .then(response => response.text())
    .then(result => {
        document.getElementById("result").innerText = result;
    })
    .catch(error => console.error('Error:', error));
}
