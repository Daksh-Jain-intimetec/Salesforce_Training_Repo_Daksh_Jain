let arr = [1,9,7,3,6];
console.log(arr);
arr = arr.sort();
console.log(arr);

//  custom comparator in sort to decreasing order
// arr = arr.sort(function(a,b){
//     return b-a;
// })
arr = arr.sort((a,b) => (b-a))
console.log(arr);

console.log("-------------------------------------------------");

let brr = [1,-9,-2,7];
console.log(brr);
brr = brr.sort(); // galat sort deta hai
console.log(brr);
brr = brr.sort((a,b) => a-b) // ye sahi se sort krega acending order me
console.log(brr);