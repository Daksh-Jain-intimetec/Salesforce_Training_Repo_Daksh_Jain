// objects in javascript
let person = {
    'name':"Daksh",
    'age': 22,
    place : "Bundi",
    number : 88909262
};
console.log(person);
console.log(`---------------------------------------`);

// forin loop
for (const key in person) {
    if (Object.prototype.hasOwnProperty.call(person, key)) {
        console.log(key,person[key]);
        
    }
}