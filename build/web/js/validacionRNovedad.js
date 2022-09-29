function validar(){
    let mascota = document.getElementById('mascota').value;
    let nombreN = document.getElementById('nombreN').value;
    let descripcion = document.getElementById('descripcion').value;
   
    
    if (mascota === 4 || nombreN === "" || descripcion === "") {
        Swal.fire({icon: 'error',
                  title: 'Todos los campos son obligatorios'});
        return false;
    }
    
    else if(nombreN.length<4){
        Swal.fire({icon: 'error',
                  title: 'El nombre de la novedad esta muy corto',
                  text: 'Por favor ingresa un nombre valido'});
        return false;
    }
    
    else if(nombreN.length>11){
         Swal.fire({icon: 'error',
                  title: 'El nombre de la novedad esta muy largo',
                  text: 'Por favor ingresa un nombre valido'});
         return false;
    }
    
    else if(descripcion.length>50){
        Swal.fire({icon: 'warning',
                  title: 'Solo puedes ingresar maximo 50 caracteres',
                  text: 'Por favor ingresa una descripción valida'});
         return false;
    }
    
    else if(descripcion.length<5){
        Swal.fire({icon: 'error',
                  title: 'La descripcion de la novedad esta muy corta',
                  text: 'Por favor ingresa una novedad valida'});
        return false;
    }
   
    
    
}

let registrar = document.getElementById('registrar')
         registrar.addEventListener('click', function (){
        Swal.fire({icon: 'success',
                  title: 'La novedad se registro ',
                  timer: 5000});
        
    });
 
    




