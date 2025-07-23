const apiUrl = "http://localhost:6969/api/student/allStudents";

function fetchStdData() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            const usersTableBody = document.querySelector("#student-table tbody");
            usersTableBody.innerHTML = ""; // Clear existing rows

            data.forEach(student => {
                const row = document.createElement("tr");
                row.innerHTML = `
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.email}</td>
                <td>${student.age}</td>
                `;
                usersTableBody.appendChild(row);
            });
        })
        .catch(error => {
            console.error("Error fetching student data:", error);
            alert("Failed to fetch student data. Please try again later.");
        });
}

// Important: don't call it immediately with (), just assign the function to run on load
window.onload = fetchStdData;

