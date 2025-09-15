function getdata(dataId, getNextdata){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("data",dataId);
            resolve(dataId);
            if(getNextdata){
                getNextdata(2);
            }
        }, 3000);
    });
}

let promise = getdata(1);
promise.then((res) =>{
    console.log("Promise fullfilled.." + res);
})

// if reject()
// promise.catch(() =>{
//     console.log("Promise rejected..");
// })