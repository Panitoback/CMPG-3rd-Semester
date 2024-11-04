/*  Typing animation  */
var typed = new Typed(".typing", {
    strings:["","Web Designer","Web Developer","Graphic Designer", "Youtuber", "Crypto-Enthusiast"],
    typeSpeed: 100,
    BackSpeed: 60,
    loop: true
})

const sections = document.querySelectorAll("section");
const navLinks = document.querySelectorAll(".nav a");

window.addEventListener("scroll", () => {
    let currentSection = "";

    //Determine section
    sections.forEach(section => {
        const sectionTop = section.offsetTop;
        const sectionHeight = section.clientHeight;
        
        if (window.scrollY >= sectionTop - sectionHeight / 3) {
            currentSection = section.getAttribute("id");
        }
    });

    //Remove class active from
    navLinks.forEach(link => {
        link.classList.remove("active");
        if(link.getAttribute("href") === `#${currentSection}`){
            link.classList.add("active");
        }
    });
})

// Form Handler

const btn = document.getElementById('button');

document.getElementById('form')
 .addEventListener('submit', function(event) {
   event.preventDefault();

   btn.value = 'Sending...';

   const serviceID = 'default_service';
   const templateID = 'template_l9urhz7';

   emailjs.sendForm(serviceID, templateID, this)
    .then(() => {
      btn.value = 'Send Email';
      alert('Sent!');
    }, (err) => {
      btn.value = 'Send Email';
      alert(JSON.stringify(err));
    });
});

// Modal Handler
// Open modal with the selected image
function openModal(imageSrc, description) {
    const modal = document.getElementById("imageModal");
    const modalImg = document.getElementById("modalImg");
    const caption = document.getElementById("caption");

    modal.style.display = "block";
    modalImg.src = imageSrc;
    caption.innerText = description;
}

// Close modal
function closeModal() {
    document.getElementById("imageModal").style.display = "none";
}








