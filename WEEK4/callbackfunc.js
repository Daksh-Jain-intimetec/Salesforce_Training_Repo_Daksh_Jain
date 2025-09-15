function print(n){
    for(let i=1;i<=n;i++){
        console.log(i);
    }
}
function printto(fun,x){
    fun(x);
}

printto(print,20);