/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validar(){
    let nombre = document.getElementById('nombre').value;
    let edad = document.getElementById('edad').value;
    let raza = document.getElementById('raza').value;
    let tipo = document.getElementById('tipo').value;
    let estado = document.getElementById('estado').value;
   
    
    if ( nombre === "" || edad === "" || raza === "" || tipo === "" || estado === "") {
        Swal.fire({icon: 'error',
                  title: 'Todos los campos son obligatorios'});
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
 let actualizar = document.getElementById('actualizar');
         actualizar.addEventListener('click', function (){
        Swal.fire({icon: 'success',
                  title: 'La Pregunta se actualizo ',
                  timer: 5000});
        
    });
    


