console.log()

const age=document.getElementById("ageid"); //got the age from user


const box=document.querySelector("#Submit");
const result = document.getElementById("result")

const checkEligibility = (e) => {
    e.preventDefault();
    let x = age.value;
    
    if (Number(x)<18){
        result.style.color="red";
        result.innerText="not eligible";
    }
    if(x>=18){
        result.style.color="green";
        result.innerText="eligible";
    }
}

box.addEventListener("click",checkEligibility)