/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validar(){
   let idf = document.getElementById('idf').value;
    let mascota = document.getElementById('mascota').value;
    let rol = document.getElementById('rol').value;
    let p1 = document.getElementById('p1').value;
    let p2 = document.getElementById('p2').value;
    let p3 = document.getElementById('p3').value;
    let p4 = document.getElementById('p4').value;
    let p5 = document.getElementById('p5').value;
    let p6 = document.getElementById('p6').value;
    let p7 = document.getElementById('p7').value;
    let p8 = document.getElementById('p8').value;
    let p9 = document.getElementById('p9').value;
    let p10 = document.getElementById('p10').value;
    let estado = document.getElementById('estado').value;
    let fecha = document.getElementById('fecha').value;
   

   
    
    if ( p1 === "" || p2 === "" || p3 === "Selecciona.."|| p4 === ""|| p5 === ""|| p6 === ""|| p7 === "Selecciona.."|| p8 === "Selecciona.."|| p9 === "Selecciona.."|| p10 === "Selecciona..") {
        Swal.fire({icon: 'error',
                  title: 'Todos los campos son obligatorios'});
        return false;
    }
    
    if(p1.length<4){
        Swal.fire({icon: 'error',
                  title: 'Ingresa una descripción valida',
                  text: 'Debe tener minimo 3 palabras la pregunta "¿Qué crees que la mascota le va a aportar a la familia?"'});
        return false;
    }
    
    
    else if(p2.length<3){
        Swal.fire({icon: 'warning',
                  title: 'Ingresa una descripción valida',
                  text: 'Debe tener minimo 4 palabras la pregunta "¿Quién será el adulto encargado de las principales necesidades de la mascota? "'});
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
                  title: 'Tu respuesta ha sido enviada '+idf.value,
                  timer: 5000});
              
              return true;
        
    });