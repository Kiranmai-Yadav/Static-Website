let searchform = document.querySelector('.search-form');

document.querySelector('#search-btn').onclick = () =>{
searchform.classList.toggle('active');
}
let navbar = document.querySelector('.navbar');

document.querySelector('#menu-btn').onclick = () =>{
    navbar.classList.toggle('.active');
    searchform.classList.toggle('active');
}
let slides = document.querySelectorAll('.home slides-container .slide');
let index = 0;

function validateForm() {
    var name=document.getElementById("email").value;
    console.log(email);
    if (!/\S+@\S+\.\S+/.test(email)) {
        alert("Please enter a valid email address.");
        return;
    }
    
    alert("Form submitted successfully!");
}

window.onscroll = () => {
    searchform.classList.remove('active');   
    if(window.scrollY > 30) {    
    document.querySelector('header').classList.add('header-active');   
    }   
    else{
       document.querySelector('header').classList.remove('header-active');  
    }
}