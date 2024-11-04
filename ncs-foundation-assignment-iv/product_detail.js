console.log()

const quant=document.getElementById("quant"); //got the quant from user
const price=document.getElementById("price"); //got the price from user

const box=document.querySelector("#Submit");
const result = document.getElementById("result")

const  calcFinalPrice = (e) => {
    e.preventDefault();
    let x = quant.value;
    let y = price.value;
    final_price=x*y;
    result.innerText=final_price;
}

box.addEventListener("click",calcFinalPrice)