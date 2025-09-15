console.log("Hello World");

// in java script varible does not have a primitive data types and same variable can be defined for multiple times
a = 10; 
console.log(a);
a = "Daksh";
console.log(a);
a = 23.5;
console.log(a); 

console.log("---------------------------------------------------------");
console.log("calculate a and b ");
a = 10;
b = 4;
console.log(a+b);
console.log(a-b);
console.log(a*b);
console.log(a/b);
console.log(a%b);
console.log(a**b); // a power b
console.log("---------------------------------------------------------");

++a;
--b;
console.log("a =",a,"b =",b);
console.log(a++ + b--);
console.log("a =",a,"b =",b);
console.log("---------------------------------------------------------");

let arr = ["Daksh",23,45.6,true];
//forof loop
for (const ele of arr) {
    console.log(arr.indexOf(ele),ele);
    
}

arr.forEach((ele) => { console.log(ele) });