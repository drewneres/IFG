let slideIndex = 0;

function mostrarSlide(n) {
    const slides = document.getElementsByClassName('slide');
    if (n >= slides.length) {
        slideIndex = 0;
    }
    if (n < 0) {
        slideIndex = slides.length - 1;
    }
    for (let i = 0; i < slides.length; i++) {
        slides[i].style.display = 'none';
    }
    slides[slideIndex].style.display = 'block';
}

function avancarSlide(n) {
    slideIndex += n;
    mostrarSlide(slideIndex);
}

// Chamar mostrarSlide(0) para mostrar o primeiro slide por padrão
mostrarSlide(0);
