const calc=(number)=>{
    let sum=0;
for(let i=0;i<number;i++){
    sum =sum + i;
}
return sum;
}


const memorisation=(fun)=>{
    let chach={};
    return function(num) {
        //let n= args[0];
        if(num in chach){
            console.log("from chche",chach);
            return chach[num];
        }
        else{
            console.log("cal first time");
            let add = fun(num);
            chach[num] = add;
            return add;
        }
    }
}
console.time();
let result = memorisation(calc);
console.log(result(5));
console.timeEnd();
console.time();
console.log(result(5));
console.timeEnd();