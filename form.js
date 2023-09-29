function validarFormulario() {
    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    
    if (!nome || !email) {
        alert('Por favor, preencha todos os campos obrigatórios.');
        return false;
    }
    return true;
}
