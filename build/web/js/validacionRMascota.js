function validar(){
   
    let nombre = document.getElementById('nombre').value;
    let file = document.getElementById('file').value;
    let edad = document.getElementById('edad').value;
    let raza = document.getElementById('raza').value;
    let tipo = document.getElementById('tipo').value;
  
   
    
    if ( file==="" || nombre === "" || edad === "" || raza === "" || tipo === "Selecciona..") {
        Swal.fire({icon: 'error',
                  title: 'Todos los campos son obligatorios'});
        return false;
    }
    
    if(nombre.length<4){
        Swal.fire({icon: 'error',
                  title: 'El nombre esta muy corto',
                  text: 'Por favor ingresa un nombre valido'});
        return false;
    }
    
    else if(nombre.length>11){
         Swal.fire({icon: 'error',
                  title: 'El nombre esta muy largo',
                  text: 'Por favor ingresa un nombre valido'});
         return false;
    }
    
    else if(edad.length>2){
        Swal.fire({icon: 'warning',
                  title: 'Solo puedes ingresar maximo 2 digitos',
                  text: 'Por favor ingresa una edad valida'});
         return false;
    }
    
    else if(isNaN(edad)){
        alert("La edad ingresada no es un número")
        return false;
    }
    
     else if(edad.length>2){
        Swal.fire({icon: 'warning',
                  title: 'Solo puedes ingresar maximo 2 digitos',
                  text: 'Por favor ingresa una edad valida'});
         return false;
    }
    
    else if(raza.length>15){
        Swal.fire({icon: 'error',
                  title: 'El campo raza esta muy largo ',
                  text: 'Por favor ingresa una raza valida'});
         return false;
    }
    
    
    
}
 let registrar = document.getElementById('registrar')
         registrar.addEventListener('click', function (){
        Swal.fire({icon: 'success',
                  title: 'La mascota se registro ',
                  timer: 5000});
              
              return true;
        
    });