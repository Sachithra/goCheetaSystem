/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
'use strict';


const smoothScrol=document.querySelector('.nav__links');


//Scroll-Smoothly

smoothScrol.addEventListener('click', function(e) {
       e.preventDefault();
     // console.log(e.target);
    if (e.target.classList.contains('nav__link')) {
        const id = e.target.getAttribute('href');
        //console.log(id);
        document.querySelector(id).scrollIntoView({
            behavior: 'smooth'
        });
    }
});

