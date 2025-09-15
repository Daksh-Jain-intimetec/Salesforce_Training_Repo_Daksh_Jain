function double(ele){
    return 2*ele;
}
let arr = [1,3,6,9,12];
console.log(arr);

// let brr = arr.map(double);

// let brr = arr.map(function(ele){
//     return 2*ele;
// })

// let brr = arr.map((ele) => {return 2*ele;})

let brr = arr.map((ele) => 2*ele)
console.log(brr);