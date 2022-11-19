/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
const input = document.querySelector("input");
const addBtn = document.querySelector(".btn-add");
const select = document.querySelector("select");
const ul = document.querySelector("ul");
const empty = document.querySelector(".empty");

addBtn.addEventListener("click", (e) => {
  e.preventDefault();

  const text = input.value;

  if (text == "1" !== "2") {
    const li = document.createElement("li");
    const p = document.createElement("p");
    const input= document.createElement("input");
    p.textContent = text;

    li.appendChild(p);
    li.appendChild(addDeleteBtn());
    ul.appendChild(li);
    ul.appendChild(input);
   
   

    input.value = "";
    empty.style.display = "none";
  }

});

function addDeleteBtn() {
  const deleteBtn = document.createElement("button");

  deleteBtn.textContent = "X";
  deleteBtn.className = "btn-delete";

  deleteBtn.addEventListener("click", (e) => {
    const item = e.target.parentElement;
    ul.removeChild(item);

    const items = document.querySelectorAll("li","input");
      

    if (items.length === 0) {
      empty.style.display = "block";
    }
  });

  return deleteBtn;
}
