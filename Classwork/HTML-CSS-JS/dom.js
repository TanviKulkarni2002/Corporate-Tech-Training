console.log()

// const title=document.getElementById('para')
// console.log(title)

// const item =document.getElementsByClassName('cl1')
// console.log(item)

// const item2 =document.getElementsByTagName('li')
// console.log(item2)

// const item3 =document.querySelector('li')
// console.log(item3)

// const item4 =document.querySelectorAll('li')
// console.log(item4)

const ul = document.querySelector('ul')
const li = document.createElement('li')
li.classList.add('cl1')
ul.append(li)

li.innerText="GOLDEN"
console.log(li.classList.contains('cl1'))

// li.remove()

const box=document.querySelector("#Submit")
console.log(box);

box.addEventListener("mouseover",changeBackground)

function changeBackground(){
    box.style.backgroundColor="pink";
}