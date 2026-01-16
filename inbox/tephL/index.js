const rock = document.getElementById("rock");
const scissor = document.getElementById("scissor");
const paper = document.getElementById("paper");
const opp_choice = document.getElementById("opp_choice");
const user_choice = document.getElementById("user_choice");
const

let choices = ['Paper', 'Rock', 'Paper'];
let randChc;

rock.onclick = function(){
    user_choice.textContent = 'Rock';
    randChc = choices[Math.floor(Math.random() * 2)];
    opp_choice.textContent = String(randChc);

    if(user_choice == opp_choice){

    }
}

paper.onclick = function(){
    user_choice.textContent = 'Paper';
    randChc = choices[Math.floor(Math.random() * 2)];
    opp_choice.textContent = String(randChc);
}

scissor.onclick = function(){
    user_choice.textContent = 'Scissor';
    randChc = choices[Math.floor(Math.random() * 2)];
    opp_choice.textContent = String(randChc);
}