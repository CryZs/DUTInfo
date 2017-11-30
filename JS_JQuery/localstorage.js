'use strict'; //Déclaration de class

//localStorage.setItem("Hello","World");
//
//localStorage.setItem("foo",JSON.stringify({foo: "bar"}));
//
//let foo = JSON.parse(localStorage.getItem("foo"));
//console.log(foo);
//
//localStorage.removeItem("foo");
//


// |-----------------| //
// | Arrow-direction | //
// |-----------------| //

//navigator.geolocation.getCurrentPosition(function (position) {
//    console.log(position);
//});

//navigator.geolocation.getCurrentPosition(position => console.log(position));


// |-----------------| //
// | Destructuration | //
// |-----------------| //

let array = [1,2,3];
let [a, , c, d = 10] = array; // valeur par défaut d=10, si la liste array à un 4ème élément, prend en compte array[3]


//let [a,b,c,d] = [1,2,3,4];
//console.log(a, b, c, d);

log(a,c,d);


let test = "test".toUpperCase();
//Instead of :
test.toUpperCase();
// Explosion d'une liste 

function log(...data){
    console.log(...data); // Eclatement de la liste retournée par console.log(data);
}


// Déclaration d'une class 

class Test{
    constructor(){
        console.log("OK");
    }
    method(){
        console.log("New Method !");
    }
}

let newObject = new Test();
newObject.method();


// le Back-quote

let prenom = "Rémy";
console.log(`Coucou ${prenom} !`);

console.log(`Retours
à
la
ligne
`);

// ATTENTION

let quatre = '4';
let number = 5;

console.log(quatre + number); // donnera 45 -> Concaténation first
console.log(quatre - number); // donnera -1
//console.log(4 + number); // donnera 9

const constante = {name: "Rémy"};
let myvar = {name: "Vast"};

console.log(constante.name, myvar.name);


// Piege !

constante.name = "Jordan";

console.log(constante);
constante.number = "02";
console.log(constante.number);
//constante = 2; Erreur

// |-------------------------| //
// | Destructuration Part 2. | //
// |-------------------------| //

let options = {
    detached: true,
    port: 200,
    host: `localhost`,
    user:{
        name:'root',
        pwd:'root',
    }
}

console.log(options.detached);

//let detached = options.detached;
//let port = options.port;
//let host = options.host;

// = 
//
//let {detached, host, port} = options;

let {port: w, detached: x, host: y, dbname = "admin"} = options;
//
//console.log(detached, host, port);
console.log(w,x,y,dbname);

function useOptions({host, port = 420}){
    console.log(host, port);
}
useOptions(options);

// Promesse : avoir un resultat en fonction du temps
//let p = new Promise(function (resolve, reject) {
let p = new Promise((resolve, reject) =>{
    console.log("START");
    setTimeout(function(){
        resolve();
    },500);
})
p.then(data => console.log("END"));
p  
    .then(data => console.log(data, 'END'))
    .catch(error => console.log(error));



function waitFiveSeconds(name,callback){
    setTimeout(() =>{
        console.log(name);
        callback();
    }, 5000);
}

waitFiveSeconds("Rémy", function(){
   console.log("test"); 
});