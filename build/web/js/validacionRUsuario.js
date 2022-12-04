let correo = document.getElementById('correo').value;
function validar(){
    let nombre = document.getElementById('nombre').value;
    let direccion = document.getElementById('direccion').value;
    let fecha = document.getElementById('fecha').value;
    let correo = document.getElementById('correo').value;
    let apellido = document.getElementById('apellido').value;
    let numero = document.getElementById('numero').value;
    let estado = document.getElementById('estado').value;
    let password = document.getElementById('password').value;
    let tipo = document.getElementById('tipo').value;
    let numerod = document.getElementById('numerod').value;
   
   expresion =/^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
   expresionC = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
    
    if (nombre===""||direccion===""||fecha===""||correo === "" ||apellido===""||numero===""|| password === ""||tipo==="Selecciona.."|| numerod==="") {
        Swal.fire({icon: 'error',
                  title: 'Todos los campos son obligatorios'});
        return false;
    }
    
    else if (!expresion.test(correo)){
   Swal.fire({icon: 'error',
                  title: 'La dirección del correo no es valida ',
                  text: 'Por favor ingresa un correo valido'});
        return false;
 
}

 else if (!expresionC.test(password)){
   Swal.fire({icon: 'error',
                  title: 'Contraseña invalida',
                  text: 'La contraseña debe tener de 6 a 16 caracteres, minimo un número y un caracter especial'});
        return false;
 
}


}
let registrar = document.getElementById('registrar')
         registrar.addEventListener('click', function (){
        Swal.fire({icon: 'success',
                  title: '¡Te has registrado!',
                  timer: 5000});
        
        return true;
    });
