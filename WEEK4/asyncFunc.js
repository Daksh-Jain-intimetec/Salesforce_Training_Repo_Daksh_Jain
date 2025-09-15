function asyncFunc(){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
           console.log("Some data1"); 
           resolve("Data fetched...")
        }, 2000);
    });
}

console.log("Fetching data1");
let p1 = asyncFunc();
p1.then((res) => {
    console.log(res);
})