var num = 10; // var declare globally

function print(k){
    var outsideVar = k; // var declare inside func
    if(k>=10){
        let insideLet = ++outsideVar; // let declare inside if block
        var insideVar = ++insideLet; // var delcare inside if block
    }
    console.log(num); // print because num is var declare globally
    console.log(outsideVar); // print because num declare inside function
    console.log(insideVar); // print because var scope is inside function block not in if block
    console.log(insideLet); // throw error due to let scope issue, cannot use out side scope
}

print(num);
