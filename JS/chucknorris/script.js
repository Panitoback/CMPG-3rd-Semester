document.getElementById("jokeButton").addEventListener("click", fetchJoke);

function fetchJoke() {
    const url = "https://api.chucknorris.io/jokes/random";

    fetch(url)
        .then(response => response.json())
        .then(data => {
            const jokeElement = document.getElementById("joke");
            jokeElement.textContent = data.value;
        })
        .catch(error => {
            console.error("Error fetching the joke:", error);
            document.getElementById("joke").textContent = "Oops! Something went wrong. Try again.";
        });
}
