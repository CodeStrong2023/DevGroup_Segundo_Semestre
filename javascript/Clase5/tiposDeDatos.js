// Tipo de dato Undefined
var x;
console.log(x);
console.log(typeof x);

// null: ausencia de valor
var y = null; //null no es un tipo de dato, pero es de tipo object
console.log(y);
console.log(typeof y);

// Tipo de dato array y Empty string
var autos = ["Citroen", "BW", "Fiat", "Ford", "Audi"];
console.log(autos);
console.log(typeof autos);

var z = "";
console.log(z);
console.log(typeof z);

autos.forEach((auto) => {
  console.log(auto);
});
