/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var terminosA=document.getElementById("terminosA");
var modalTerminos=document.getElementById("modalTerminos");
var cerrarModal=document.querySelector(".cerrarModal");


terminosA.addEventListener("click",()=>{
    modalTerminos.style.display="block";
});

cerrarModal.addEventListener("click",()=>{
    modalTerminos.style.display="none"; 
});

window.addEventListener("click",(e)=>{
    if(e.target===terminosA){
        terminosA.style.display="inline"; 
    }
});

