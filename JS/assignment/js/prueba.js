
// Assignment 1 | COMP1073 Client-Side JavaScript

/* Variables
-------------------------------------------------- */
// Create a new speechSynthesis object
var synth = window.speechSynthesis;
var firstNoun = document.querySelector('#firstNoun');
var verb = document.querySelector('#verb');
var adjective = document.querySelector('#adjective');
var secondNoun = document.querySelector('#secondNoun');
var location = document.querySelector('#location');

var textToSpeak = 'hi my friend';

/* Functions
-------------------------------------------------- */
function speakNow(string) {
    // Create a new speech object, attaching the string of text to speak
    var utterThis = new SpeechSynthesisUtterance(string);
    // Actually speak the text
    synth.speak(utterThis);
}

/* Event Listeners
-------------------------------------------------- */
// Onclick handler for the button that speaks the text contained in the above var textToSpeak
firstNoun.onclick = function() {
    speakNow(textToSpeak);
}

