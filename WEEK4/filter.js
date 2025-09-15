function isOdd(ele){
    if(ele%2!=0) return true;
    else return false;
}

let arr = [1,2,3,4,5,6,7,8,9];
console.log(arr);
// filter function take boolean value only;
// let brr = arr.filter(isOdd); 

// let brr = arr.filter(function (ele){
//     if(ele%2!=0) return true;
//     else return false;
// })

// let brr = arr.filter( ele => { return (ele%2!=0) ? true : false ;})

let brr = arr.filter(ele => (ele%2!=0))

console.log(brr);